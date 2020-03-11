package rush.comandos;

import java.io.File;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Set;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.permissions.PermissionAttachmentInfo;

import rush.Main;
import rush.addons.MassiveFactions;
import rush.configuracoes.Mensagens;
import rush.configuracoes.Settings;
import rush.utils.Utils;
import rush.utils.manager.DataManager;

public class ComandoSethome implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender s, Command cmd, String lbl, String[] args) {
		
		// Verificando se o sender � um player
		if (!(s instanceof Player)) {
			s.sendMessage(Mensagens.Console_Nao_Pode); 
			return true;
		}
				
		// Verificando se o player digitou o n�mero de argumentos corretos
		if (args.length != 1) {
			s.sendMessage(Mensagens.SetHome_Comando_Incorreto);
			return true;
		}
		
		// Verificando se o nome da Home contem caracteres especiais
		if (Utils.stringContainsSpecialCharacters(args[0])) {
			s.sendMessage(Mensagens.Erro_Nome_Com_Caracteres_Especiais.replace("%nome%", "da home").replace("%caractere%", Utils.getSpecialCharacters(args[0])));
			return true;
		}
			     
		// Pegando o player, a home a ser setada, o arquivo do player a config e alista de homes
		Player p = (Player) s;
		String home = args[0].replace(":", "");
		File file = DataManager.getFile(p.getName().toLowerCase(), "playerdata");
		FileConfiguration config = DataManager.getConfiguration(file);
		Set<String> HOMES = config.getConfigurationSection("Homes").getKeys(false);
		int homes = HOMES.size();
		
		// Verificando se o player j� atingiu o limite m�ximo de homes permitidas
		int limite = getHomesLimit(p);
		if (homes >= limite && !s.hasPermission("system.home.admin") && !s.isOp() && !HOMES.contains(home)) {
			s.sendMessage(Mensagens.Limite_De_Homes_Atingido.replace("%limite%", String.valueOf(limite)));
			return true;
		} 
		
		// Pegando a localiza��o do player, serializando e salvando no arquivo
		Location location = p.getLocation();
		
		// Verificando se a compatibilidade com o factions
		if (Main.setupFactions) {
			if (!MassiveFactions.isValidSetHome(location, p)) {
				return true;
			}
		}
		
		String loc = Utils.serializeLocation(location);
		config.set("Homes." + home + ".Localizacao" , loc);
		config.set("Homes." + home + ".Publica" , false);
		try {
			config.save(file);
			s.sendMessage(Mensagens.Home_Definida.replace("%home%", home));
		} catch (IOException e) {
			Bukkit.getConsoleSender().sendMessage(Mensagens.Falha_Ao_Salvar.replace("%arquivo%", file.getName()));
		}
		return true;
	}
	
	private int getHomesLimit(Player p) {		
		int limit = Settings.Limite_De_Homes_Inicial;
		
		// Percorrendo todas os grupos de homes e verificando se o player tem permiss�o de algum
		for (Entry<String, Integer> perm : Settings.Grupos_De_Permissoes_De_Homes.entrySet()) {
			if (p.hasPermission("system.homes." + perm.getKey())) {
				int newLimit = perm.getValue();
				if (newLimit > limit) {
					limit = newLimit;
				}
			}
		}
		
		// Percorrendo todas as permiss�es do player e verificando se ele possui algum limite de homes
		for (PermissionAttachmentInfo perm : p.getEffectivePermissions()) {
			if (perm.getPermission().startsWith("system.homes.")) {
				try {
					int newLimit = Integer.parseInt(perm.getPermission().replace("system.homes.", ""));
					if (newLimit > limit) {
						limit = newLimit;
					}
				} catch (Throwable e) {}
			}
		}
		
		// Retornando o limite
		return limit;
	}
    
}