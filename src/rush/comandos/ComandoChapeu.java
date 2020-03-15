package rush.comandos;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

import rush.configuracoes.Mensagens;

public class ComandoChapeu implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender s, Command cmd, String lbl, String[] args) {

		// Verificando se o sender � um player
		if (!(s instanceof Player)) {
			s.sendMessage(Mensagens.Console_Nao_Pode);
			return true;
		}
		
		// Pegando o player, o item na m�o e o seu capacete atual
		Player p = (Player) s;
		PlayerInventory i = p.getInventory();
		ItemStack hand = p.getItemInHand();
		ItemStack helmet = i.getHelmet();

		// Verificando se o item � um capacete valido
		if (hand != null && hand.getType().name().contains("HELMET") || hand.getType() != Material.AIR && hand.getType().getMaxDurability() == 0) {
			i.setHelmet(hand);
			i.setItemInHand(helmet);
			p.sendMessage(Mensagens.Chapeu_Colocado);
		} else {
			p.sendMessage(Mensagens.Chapeu_Invalido);
		}
		return true;
	}
}