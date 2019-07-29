package rush.configuracoes;

import java.util.List;
import java.util.Map;

import org.bukkit.Sound;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.inventory.InventoryType;

import rush.utils.Utils;
import rush.utils.manager.ConfigManager;

public class Settings {

	public static boolean AtivarAddons_MassiveFactions;
	public static boolean AtivarAddons_Legendchat;
	public static boolean AtivarAddons_McMMO;
	public static boolean AtivarAddons_Vault;
	public static boolean Bloquear_Cama;
	public static boolean Bloquear_Subir_Em_Veiculos;
	public static boolean Bloquear_NameTag;
	public static boolean Bloquear_Passar_Da_Borda;
	public static boolean Bloquear_Subir_No_Teto_Nether;
	public static boolean EnderPearl_Cooldown_Ativar;
	public static long EnderPearl_Cooldown_Cooldown;
	public static boolean Bloquear_Abrir_Containers_Ativar;
	public static List<InventoryType> Bloquear_Abrir_Containers_Containers;
	public static boolean Bloquear_Shift_Em_Containers_Ativar;
	public static List<InventoryType> Bloquear_Shift_Em_Containers_Containers;
	public static boolean Bloquear_Money_Invalido;
	public static List<String> Comandos_Que_Envolvem_Money;
	public static boolean Bloquear_Congelar_Agua;
	public static boolean Bloquear_Derreter_Gelo_E_Neve;
	public static boolean Desativar_Mobs_Naturais;
	public static boolean Desativar_Propagacao_Do_Fogo;
	public static boolean Desativar_Queda_Das_Folhas;
	public static boolean Desativar_Queda_Da_Areia;
	public static boolean Desativar_Flow_Da_Agua_E_Lava;
	public static boolean Desativar_Chuva;
	public static long Delay_Para_Teleportar_Comandos;
	public static long Delay_Para_Divulgar;
	public static boolean Bloquear_Mobs_De_Pegarem_Fogo_Para_O_Sol;
	public static boolean Bloquear_Mobs_De_Pegarem_Itens_Do_Chao;
	public static boolean Bloquear_Cair_No_Void;
	public static boolean Desativar_Ciclo_Do_Dia;
	public static boolean Desativar_Dano_Do_Blaze;
	public static boolean Desativar_Dano_Do_EnderDragon;
	public static boolean Desativar_Dano_Do_Ghast;
	public static boolean Desativar_Dano_Do_Wither;
	public static boolean Desativar_Fome_Nos_Mundos;
	public static boolean Desativar_Mensagem_De_Entrada;
	public static boolean Desativar_Mensagem_De_Morte;
	public static boolean Desativar_Mensagem_De_Saida;
	public static boolean Entrar_No_Spawn_Ao_Logar;
	public static boolean Bloquear_Criar_Portal;
	public static boolean Bloquear_Teleport_Por_Portal_Ativar;
	public static boolean Bloquear_Teleport_Por_Portal_NetherPortal;
	public static boolean Bloquear_Teleport_Por_Portal_EndPortal;
	public static boolean Bigorna_Infinita;
	public static boolean Ativar_Cores_Na_Bigorna;
	public static boolean Ativar_Cores_Na_Placa;
	public static boolean Limitador_De_Players;
	public static int Limite_De_Players;
	public static boolean Kickar_Sem_Vip;
	public static long Tempo_Para_Ser_Kick;
	public static boolean Invencibilidade_Ao_Teleportar;
	public static long Tempo_De_Invencibilidade_Ao_Teleportar;
	public static boolean Dropar_Cabeca_Ao_Morrer;
	public static int Chance_De_Dropar_Cabeca_Ao_Morrer;
	public static boolean Sistema_De_Fly_Para_Players;
	public static List<String> Mundos_Onde_Pode_Usar_Fly;
	public static boolean Sistema_De_Spawners;
	public static boolean Bloquear_Trocar_Tipo_Do_Spawner_Com_Ovo;
	public static boolean Dropar_Spawner_Ao_Explodir;
	public static boolean Sistema_De_Stack_Mobs;
	public static int Limite_De_Mobs_Agrupados;
	public static String Nome_Dos_Mobs; 
	public static boolean Kill_All;
	public static int Chance_De_Dropar_Ao_Explodir;
	public static String Nome_Do_Spawner;
	public static List<String> Lore_Do_Spawner;
	public static boolean Mensagem_De_Boas_Vindas_Ativar;
	public static List<String> Mensagem_De_Boas_Vindas_Mensagem;
	public static boolean Title_De_Boas_Vindas_Ativar;
	public static String Title_De_Boas_Vindas_Titulo;
	public static String Title_De_Boas_Vindas_Subtitulo;
	public static boolean Ativar_Camarote_Para_Os_Sem_Vip;
	public static boolean Motd_Ativar;
	public static String Motd_Normal;
	public static String Motd_Manutencao;
	public static boolean Bloquear_Comandos;
	public static List<String> Lista_Dos_Comandos_Bloqueados;
	public static boolean Bloquear_Crafts;
	public static List<Integer> Lista_Dos_Crafts_Bloqueados;
	public static boolean Bloquear_Palavras_Em_Placas_Ativar;
	public static boolean Bloquear_Todas_As_Palavras;
	public static boolean Bloquear_Apenas_Algumas_Palavras;
	public static List<String> Lista_Das_Palavras_Bloqueadas;
	public static boolean Bloquear_Nicks_Improprios;
	public static List<String> Nicks_Bloqueados;
	public static long mcTopTag_Tempo_De_Checagem;
	public static String mcTopTag_Tag;
	public static long magnataTag_Tempo_De_Checagem;
	public static String magnataTag_Tag;
	public static Map<String, String> CorAutomatica;
	public static boolean Auto_Anuncio;
	public static boolean Destacar_Anuncio;
	public static long Delay_Entre_Anuncios;
	public static boolean Reproduzir_Som_No_Anuncio;
	public static Sound Som_Do_Anuncio;
	public static List<String> Lista_De_Anuncios;
	public static boolean Anunciar_Morte;
	public static boolean Anuncios_Mostrar_Para_Quem_Morreu;
	public static String Anuncios_Mensagem_Para_Defunto;
	public static boolean Anuncios_Mostrar_Para_Quem_Matou;
	public static String Anuncios_Mensagem_Para_Matador;
	public static boolean Anuncios_Mostrar_Para_Todo_Servidor;
	public static String Anuncios_Mensagem_Para_Todos;
	public static boolean ScoreBoard_Ativar;
	public static String ScoreBoard_Titulo;
	public static List<String> ScoreBoard_Linhas;
	public static boolean Ativar_Tablist;
	public static String Header;
	public static String Footer;
	public static long Tempo_Para_Expirar_Solicitacao_Tpa;
	public static long Tempo_Para_Poder_Enviar_Outra_Solicitacao_Tpa;
	public static Sound Commando_Slime_Esta;
	public static Sound Commando_Slime_Nao_esta;
	public static boolean Bloquear_Quebrar_Plantacoes_Pulando;
	public static boolean Deletar_Comandos;
	public static List<String> Lista_Dos_Comandos_Deletados;
	public static boolean Bloquear_Explodir_Itens;
	public static boolean Bloquear_Kick_Por_Duplo_Login;
	public static boolean Bloquear_Kick_Por_Duplo_Login_Super;
	public static List<String> Mundos_Sem_Sistema_De_Back;
	public static boolean Desativar_Dano_Do_Cacto;

	public static void loadSettings() {
		FileConfiguration config = ConfigManager.getConfig("settings");
		AtivarAddons_MassiveFactions = config.getBoolean("AtivarAddons.MassiveFactions");
		AtivarAddons_Legendchat = config.getBoolean("AtivarAddons.LegendChat");
		AtivarAddons_McMMO = config.getBoolean("AtivarAddons.McMMO");
		AtivarAddons_Vault = config.getBoolean("AtivarAddons.Vault");
		Bloquear_Cama = config.getBoolean("Bloquear-Cama");
		Bloquear_Subir_Em_Veiculos = config.getBoolean("Bloquear-Subir-Em-Veiculos");
		Bloquear_NameTag = config.getBoolean("Bloquear-NameTag");
		Bloquear_Passar_Da_Borda = config.getBoolean("Bloquear-Passar-Da-Borda");
		Bloquear_Subir_No_Teto_Nether = config.getBoolean("Bloquear-Subir-No-Teto-Nether");
		EnderPearl_Cooldown_Ativar = config.getBoolean("EnderPearl-Cooldown.Ativar");
		EnderPearl_Cooldown_Cooldown = config.getLong("EnderPearl-Cooldown.Cooldown");
		Bloquear_Abrir_Containers_Ativar = config.getBoolean("Bloquear-Abrir-Containers.Ativar");
		Bloquear_Abrir_Containers_Containers = Utils.listToListEnum(InventoryType.class, config.getStringList("Bloquear-Abrir-Containers.Containers"));
		Bloquear_Shift_Em_Containers_Ativar = config.getBoolean("Bloquear-Shift-Em-Containers.Ativar");
		Bloquear_Shift_Em_Containers_Containers = Utils.listToListEnum(InventoryType.class, config.getStringList("Bloquear-Shift-Em-Containers.Containers"));
		Bloquear_Money_Invalido = config.getBoolean("Bloquear-Money-Invalido");
		Comandos_Que_Envolvem_Money = Utils.listToLowerCase(config.getStringList("Comandos-Que-Envolvem-Money"));
		Bloquear_Congelar_Agua = config.getBoolean("Bloquear-Congelar-Agua");
		Bloquear_Derreter_Gelo_E_Neve = config.getBoolean("Bloquear-Derreter-Gelo-E-Neve");
		Desativar_Mobs_Naturais = config.getBoolean("Desativar-Mobs-Naturais");
		Desativar_Propagacao_Do_Fogo = config.getBoolean("Desativar-Propagacao-Do-Fogo");
		Desativar_Queda_Das_Folhas = config.getBoolean("Desativar-Queda-Das-Folhas");
		Desativar_Queda_Da_Areia = config.getBoolean("Desativar-Queda-Da-Areia");
		Desativar_Flow_Da_Agua_E_Lava = config.getBoolean("Desativar-Flow-Da-Agua-E-Lava");
		Desativar_Chuva = config.getBoolean("Desativar-Chuva");
		Delay_Para_Teleportar_Comandos = config.getLong("Delay-Para-Teleportar-Comandos");
		Delay_Para_Divulgar = config.getLong("Delay-Para-Divulgar") * 1000L * 60L;
		Bloquear_Mobs_De_Pegarem_Fogo_Para_O_Sol = config.getBoolean("Bloquear-Mobs-De-Pegarem-Fogo-Para-O-Sol");
		Bloquear_Mobs_De_Pegarem_Itens_Do_Chao = config.getBoolean("Bloquear-Mobs-De-Pegarem-Itens-Do-Chao");
		Bloquear_Cair_No_Void = config.getBoolean("Bloquear-Cair-No-Void");
		Desativar_Ciclo_Do_Dia = config.getBoolean("Desativar-Ciclo-Do-Dia");
		Desativar_Dano_Do_Blaze = config.getBoolean("Desativar-Dano-Do-Blaze");
		Desativar_Dano_Do_EnderDragon = config.getBoolean("Desativar-Dano-Do-EnderDragon");
		Desativar_Dano_Do_Ghast = config.getBoolean("Desativar-Dano-Do-Ghast");
		Desativar_Dano_Do_Wither = config.getBoolean("Desativar-Dano-Do-Wither");
		Desativar_Fome_Nos_Mundos = config.getBoolean("Desativar-Fome-Nos-Mundos");
		Desativar_Mensagem_De_Entrada = config.getBoolean("Desativar-Mensagem-De-Entrada");
		Desativar_Mensagem_De_Morte = config.getBoolean("Desativar-Mensagem-De-Morte");
		Desativar_Mensagem_De_Saida = config.getBoolean("Desativar-Mensagem-De-Saida");
		Entrar_No_Spawn_Ao_Logar = config.getBoolean("Entrar-No-Spawn-Ao-Logar");
		Bloquear_Criar_Portal = config.getBoolean("Bloquear-Criar-Portal");
		Bloquear_Teleport_Por_Portal_Ativar = config.getBoolean("Bloquear-Teleport-Por-Portal.Ativar");
		Bloquear_Teleport_Por_Portal_NetherPortal = config.getBoolean("Bloquear-Teleport-Por-Portal.NetherPortal");
		Bloquear_Teleport_Por_Portal_EndPortal = config.getBoolean("Bloquear-Teleport-Por-Portal.EndPortal");
		Bigorna_Infinita = config.getBoolean("Bigorna-Infinita");
		Ativar_Cores_Na_Bigorna = config.getBoolean("Ativar-Cores-Na-Bigorna");
		Ativar_Cores_Na_Placa = config.getBoolean("Ativar-Cores-Na-Placa");
		Limitador_De_Players = config.getBoolean("Limitador-De-Players.Ativar");
		Limite_De_Players = config.getInt("Limitador-De-Players.Limite-De-Players");
		Kickar_Sem_Vip = config.getBoolean("Limitador-De-Players.Kickar-Sem-Vip");
		Tempo_Para_Ser_Kick = config.getLong("Limitador-De-Players.Tempo-Para-Ser-Kickado-Apos-Aviso");
		Invencibilidade_Ao_Teleportar = config.getBoolean("Invencibilidade-Ao-Teleportar.Ativar");
		Tempo_De_Invencibilidade_Ao_Teleportar = config.getLong("Invencibilidade-Ao-Teleportar.Tempo-De-Invencibilidade-Ao-Teleportar");
		Dropar_Cabeca_Ao_Morrer = config.getBoolean("Dropar-Cabeca-Ao-Morrer.Ativar");
		Chance_De_Dropar_Cabeca_Ao_Morrer = config.getInt("Dropar-Cabeca-Ao-Morrer.Chance-De-Dropar-Cabeca-Ao-Morrer");
		Sistema_De_Fly_Para_Players = config.getBoolean("Sistema-De-Fly-Para-Players");
		Mundos_Onde_Pode_Usar_Fly = config.getStringList("Mundos-Onde-Pode-Usar-Fly");
		Sistema_De_Spawners = config.getBoolean("Sistema-De-Spawners");
		Bloquear_Trocar_Tipo_Do_Spawner_Com_Ovo = config.getBoolean("Bloquear-Trocar-Tipo-Do-Spawner-Com-Ovo");
		Dropar_Spawner_Ao_Explodir = config.getBoolean("Dropar-Spawner-Ao-Explodir");
		Chance_De_Dropar_Ao_Explodir = config.getInt("Chance-De-Dropar-Ao-Explodir");
		Nome_Do_Spawner = config.getString("Nome-Do-Spawner", "�fGerador de Monstros").replace('&', '�');
		Lore_Do_Spawner = Utils.colorizeListString(config.getStringList("Lore-Do-Spawner"));
		Sistema_De_Stack_Mobs = config.getBoolean("Sistema-De-Stack-Mobs");
		Limite_De_Mobs_Agrupados = config.getInt("Limite-De-Mobs-Agrupados");
		Nome_Dos_Mobs = config.getString("Nome-Dos-Mobs", "�e%quantia%x %tipo%").replace('&', '�'); 
		Kill_All = config.getBoolean("Kill-All");
		Mensagem_De_Boas_Vindas_Ativar = config.getBoolean("Mensagem-De-Boas-Vindas.Ativar");
		Mensagem_De_Boas_Vindas_Mensagem = Utils.colorizeListString(config.getStringList("Mensagem-De-Boas-Vindas.Mensagem"));
		Title_De_Boas_Vindas_Ativar = config.getBoolean("Title-De-Boas-Vindas.Ativar");
		Title_De_Boas_Vindas_Titulo = getString(config, "Title-De-Boas-Vindas.Titulo");
		Title_De_Boas_Vindas_Subtitulo = getString(config, "Title-De-Boas-Vindas.Subtitulo");
		Ativar_Camarote_Para_Os_Sem_Vip = config.getBoolean("Ativar-Camarote-Para-Os-Sem-Vip");
		Motd_Ativar = config.getBoolean("Motd.Ativar");
		Motd_Normal = getString(config, "Motd.Motd-Normal");
		Motd_Manutencao = getString(config, "Motd.Motd-Manutencao");
		Bloquear_Comandos = config.getBoolean("Bloquear-Comandos");
		Lista_Dos_Comandos_Bloqueados = Utils.listToLowerCase(config.getStringList("Lista-Dos-Comandos-Bloqueados"));
		Bloquear_Crafts = config.getBoolean("Bloquear-Crafts");
		Lista_Dos_Crafts_Bloqueados = config.getIntegerList("Lista-Dos-Crafts-Bloqueados");
		Bloquear_Palavras_Em_Placas_Ativar = config.getBoolean("Bloquear-Palavras-Em-Placas.Ativar");
		Bloquear_Todas_As_Palavras = config.getBoolean("Bloquear-Palavras-Em-Placas.Bloquear-Todas-As-Palavras");
		Bloquear_Apenas_Algumas_Palavras = config.getBoolean("Bloquear-Palavras-Em-Placas.Bloquear-Apenas-Algumas-Palavras");
		Lista_Das_Palavras_Bloqueadas = Utils.listToLowerCase(config.getStringList("Bloquear-Palavras-Em-Placas.Lista-Das-Palavras-Bloqueadas"));
		Bloquear_Nicks_Improprios = config.getBoolean("Bloquear-Nicks-Improprios");
		Nicks_Bloqueados = Utils.listToLowerCase(config.getStringList("Nicks-Bloqueados"));
		mcTopTag_Tempo_De_Checagem = config.getLong("mcTopTag.Tempo-De-Checagem");
		mcTopTag_Tag = config.getString("mcTopTag.Tag", "�9[*] ").replace('&', '�');
		magnataTag_Tempo_De_Checagem = config.getLong("magnataTag.Tempo-De-Checagem");
		magnataTag_Tag = config.getString("magnataTag.Tag", "�2[$] ").replace('&', '�');
		try { CorAutomatica = Utils.mapToMapString(config.getConfigurationSection("CorAutomatica").getValues(true)); } catch (Throwable e) {} ;
		Auto_Anuncio = config.getBoolean("Auto-Anuncio");
		Destacar_Anuncio = config.getBoolean("Destacar-Anuncio");
		Delay_Entre_Anuncios = config.getLong("Delay-Entre-Anuncios");
		Reproduzir_Som_No_Anuncio = config.getBoolean("Reproduzir-Som-No-Anuncio");
		Som_Do_Anuncio = Utils.tryLoadSound("LEVEL_UP", "ENTITY_PLAYER_LEVELUP");
		Lista_De_Anuncios = Utils.colorizeListString(config.getStringList("Lista-De-Anuncios"));
		Anunciar_Morte = config.getBoolean("Anunciar-Morte");
		Anuncios_Mostrar_Para_Quem_Morreu = config.getBoolean("Anuncios.Mostrar-Para-Quem-Morreu");
		Anuncios_Mensagem_Para_Defunto = getString(config, "Anuncios.Mensagem-Para-Defunto");
		Anuncios_Mostrar_Para_Quem_Matou = config.getBoolean("Anuncios.Mostrar-Para-Quem-Matou");
		Anuncios_Mensagem_Para_Matador = getString(config, "Anuncios.Mensagem-Para-Matador");
		Anuncios_Mostrar_Para_Todo_Servidor = config.getBoolean("Anuncios.Mostrar-Para-Todo-Servidor");
		Anuncios_Mensagem_Para_Todos = getString(config, "Anuncios.Mensagem-Para-Todos");
		ScoreBoard_Ativar = config.getBoolean("ScoreBoard.Ativar");
		ScoreBoard_Titulo = config.getString("ScoreBoard.Titulo", "�cSem titulo").replace('&', '�');
		ScoreBoard_Linhas = Utils.colorizeListString(config.getStringList("ScoreBoard.Linhas"));
		Ativar_Tablist = config.getBoolean("Ativar-Tablist");
		Header = getString(config, "Parte-De-Cima");
		Footer = getString(config, "Parte-De-Baixo");
		Tempo_Para_Expirar_Solicitacao_Tpa = config.getLong("Tempo-Para-Expirar-Solicitacao-Tpa");
		Tempo_Para_Poder_Enviar_Outra_Solicitacao_Tpa = config.getLong("Tempo-Para-Poder-Enviar-Outra-Solicitacao-Tpa");
		Commando_Slime_Esta = Utils.tryLoadSound("SLIME_WALK2", "ENTITY_SLIME_SQUISH");
		Commando_Slime_Nao_esta = Utils.tryLoadSound("SLIME_ATTACK", "ENTITY_SLIME_ATTACK");
		Bloquear_Quebrar_Plantacoes_Pulando = config.getBoolean("Bloquear-Quebrar-Plantacoes-Pulando");
		Deletar_Comandos = config.getBoolean("Deletar-Comandos");
		Lista_Dos_Comandos_Deletados = Utils.listToLowerCase(config.getStringList("Lista-Dos-Comandos-Deletados"));
		Bloquear_Explodir_Itens = config.getBoolean("Bloquear-Explodir-Itens");
		Bloquear_Kick_Por_Duplo_Login = config.getBoolean("Bloquear-Kick-Por-Duplo-Login");
		Bloquear_Kick_Por_Duplo_Login_Super = config.getBoolean("Super-Bloquear-Kick-Por-Duplo-Login");
		Mundos_Sem_Sistema_De_Back = config.getStringList("Mundos-Sem-Sistema-De-Back");
		Desativar_Dano_Do_Cacto = config.getBoolean("Desativar-Dano-Do-Cacto");
	}
	
	private static String getString(FileConfiguration config, String path) {
		return config.getString(path, "�cN�o foi possivel localizar a mensagem '�e" + path + "�c' do arquivo �nsettings.yml�c.").replace('&', '�');
	}
	
}