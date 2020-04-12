package rush.comandos;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import rush.configuracoes.Mensagens;
import rush.entidades.Kits;
import rush.utils.GuiHolder;
import rush.utils.Utils;

public class ComandoCriarkit implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender s, Command cmd, String lbl, String[] args) {
			
		// Verificando se o sender � um player
		if (!(s instanceof Player)) {
			s.sendMessage(Mensagens.Console_Nao_Pode); 
			return true;
		}
			
		// Verificando se o player digitou o n�mero de argumentos corretos
		if (args.length != 1) {
			s.sendMessage(Mensagens.CriarKit_Comando_Incorreto);
			return true;
		}
			 
		// Pegando o argumento e verificando se o kit j� existe
		String kit = args[0].toLowerCase();
		if (Kits.contains(kit)) {
			s.sendMessage(Mensagens.Kit_Ja_Existe.replace("%kit-id%", kit));
			return true;
		}
		
		// Verificando se o nome do Kit contem caracteres especiais
		if (Utils.stringContainsSpecialCharacters(args[0])) {
			s.sendMessage(Mensagens.Erro_Nome_Com_Caracteres_Especiais.replace("%nome%", "do kit").replace("%caractere%", Utils.getSpecialCharacters(args[0])));
			return true;
		}
			
		// Verificando se o nome do kit n�o � maior que o permitido
		if (args[0].length() > 10) {
			s.sendMessage("�cO id do kit n�o pode conter mais de 10 caracteres.");
			return true;
		}
		
		// Criando as propriedades do inventario o holder do inventario
		Map<String, Object> propriedades = new HashMap<>();
		propriedades.put("kit", kit);
		GuiHolder holder = new GuiHolder(997, propriedades);
		
		// Pegando o player abrindo um inventario... o resto do processo � feito pela classe KitsListener
		Player p = (Player) s;
		Inventory inv = Bukkit.createInventory(holder, 36, "Criando kit: " + kit);
		p.openInventory(inv);
		return true;
	}
}