package rush.configuracoes;

import org.bukkit.configuration.file.FileConfiguration;

import rush.utils.ConfigManager;

public class Mensagens {

	public static String Separador_De_Listas;
	public static String Console_Nao_Pode;
	public static String Sem_Permissao;
	public static String Numero_Invalido;
	public static String Money_Null;
	public static String Player_Offline;
	public static String Player_Nao_Existe;
	public static String Mundo_Nao_Existe;
	public static String Falha_Ao_Criar_Arquivo;
	public static String Falha_Ao_Criar_Pasta;
	public static String Falha_Ao_Salvar;
	public static String Erro_Versao_Nao_Suportada;
	public static String Nick_Similar;
	public static String Servidor_Lotado;
	public static String Aviso_Dar_Lugar_Ao_Vip	;
	public static String Kick_Dar_Lugar_Ao_Vip;
	public static String Nick_Bloqueado;
	public static String Comando_Bloqueado;
	public static String Tentou_Passar_Da_Borda;
	public static String Tentou_Vender_Com_Valor_Negativo;
	public static String Aguarde_EnderPearl_Cooldown;
	public static String Shift_Bloqueado_No_Container;
	public static String Palavras_Desativadas_Na_Placa;
	public static String Palavra_Bloqueada_Na_Placa;
	public static String Inventario_Cheio_Quebrou;
	public static String Spawner_Bugado;
	public static String Spawner_Givado;
	public static String Inventario_Cheio_Give;
	public static String Sgive_Comando_Incorreto;
	public static String Spawner_Desconhecido;
	public static String Nome_Do_MobSpawner;
	public static String SetWarp_Comando_Incorreto;
	public static String DelWarp_Comando_Incorreto;
	public static String Warp_Comando_Incorreto;
	public static String Warp_Definida;
	public static String Warp_Deletada;
	public static String Warp_Ja_Existe;
	public static String Warp_Nao_Existe;
	public static String Nenhuma_Warp_Definida;
	public static String Warps_Lista;
	public static String Particular_Comando_Incorreto;
	public static String Publica_Comando_Incorreto;
	public static String SetHome_Comando_Incorreto;
	public static String DelHome_Comando_Incorreto;
	public static String Homes_Comando_Incorreto;
	public static String Home_Comando_Incorreto;
	public static String Home_Outro_Comando_Incorreto;
	public static String Home_Definida;
	public static String Home_Deletada;
	public static String Home_Nao_Existe;
	public static String Player_Home_Nao_Existe;
	public static String Player_Home_Nao_Publica;
	public static String Home_Privada_Iniciando_Teleporte;
	public static String Home_Publica_Iniciando_Teleporte;
	public static String Home_Privada_Teleportado_Sucesso;
	public static String Home_Publica_Teleportado_Sucesso;
	public static String Homes_Publicas;
	public static String Homes_Particulares;
	public static String Limite_De_Homes_Atingido;
	public static String Home_Ja_Publica;
	public static String Home_Ja_Particular;
	public static String Tornou_Home_Publica;
	public static String Tornou_Home_Particular;
	public static String Kit_Comando_Incorreto;
	public static String Kit_Comando_Incorreto_Console;
	public static String DelKit_Comando_Incorreto;
	public static String VerKit_Comando_Incorreto;
	public static String CriarKit_Comando_Incorreto;
	public static String EditarKit_Comando_Incorreto_Delay;
	public static String EditarKit_Comando_Incorreto_Perm;
	public static String EditarKit_Comando_Incorreto;
	public static String Kit_Nao_Existe;
	public static String Kit_Ja_Existe;
	public static String Kit_Sem_Permissao;
	public static String Kit_Criado;
	public static String Kit_Editado;
	public static String Kit_Deletado;
	public static String Kit_Sem_Espaco_Pra_Pegar;
	public static String Kit_Pego;
	public static String Kit_Enviado;
	public static String Kit_Aguarde;
	public static String Nenhum_Kit_Criado;
	public static String Kits_Lista;
	public static String Divulgar_Comando_Incorreto;
	public static String Link_Invalido;
	public static String Divulgando_Live;
	public static String Divulgando_Video;
	public static String Divulgando_Outro;
	public static String Link;
	public static String Divulgando_Title;
	public static String Divulgando_SubTitle;
	public static String Tp_Comando_Incorreto;
	public static String Tp_Erro_Voce_Mesmo;
	public static String Tp_Erro_Player_Mesmo;
	public static String Tp_Teleportado_Com_Sucesso_Player;
	public static String Tp_Teleportado_Com_Sucesso_Cords;
	public static String Tp_Voce_Teleportou_Player_Ate_Player;
	public static String Tp_Voce_Teleportou_Player_Ate_Cords;	
	public static String Tphere_Comando_Incorreto;
	public static String Tphere_Erro_Voce_Mesmo;
	public static String Tphere_Puxou_Com_Sucesso;
	public static String Tphere_Puxado_Com_Sucesso;
	public static String Tpall_Comando_Incorreto;
	public static String Tpall_Puxou_Com_Sucesso_Player;
	public static String Tpall_Puxou_Com_Sucesso_Cords;
	public static String Tpa_Comando_Incorreto;
	public static String Tpa_Aguarde_Cooldown;
	public static String Tpa_Ja_Possui_Solicitacao;
	public static String Tpa_Desligado_Tptoggle;
	public static String Tpa_Solicitcao_Expirada_Player;
	public static String Tpa_Solicitcao_Expirada_Alvo;
	public static String Tpa_Solicitacao_Enviada_Sucesso;
	public static String Tpa_Solicitacao_Recebida;
	public static String Tpa_Pendente_Nao_Possui;
	public static String Tpa_Pendente_Player_Nao_Possui;
	public static String Tpaccept_Comando_Incorreto;
	public static String Tpaccept_Player_Offline;
	public static String Tpaccept_Erro_Voce_Mesmo;
	public static String Tpaccept_Solicitacao_Aceita_Sucesso;
	public static String Tpaccept_Iniciando_Teleporte;
	public static String Tpaccept_Teleportado_Com_sucesso;
	public static String Tpdeny_Comando_Incorreto;
	public static String Tpdeny_Erro_Voce_Mesmo;
	public static String Tpdeny_Recusado_Com_Sucesso;
	public static String Tpdeny_Recusou_Seu_Pedido;
	public static String Tpcancel_Comando_Incorreto;
	public static String Tpcancel_Erro_Voce_Mesmo;
	public static String Tpcancel_Cancelado_Com_Sucesso;
	public static String Tpcancel_Cancelou_Pedido;
	public static String Tptoggle_Comando_Incorreto;
	public static String Tptoggle_Desativado_Com_Sucesso;
	public static String Tptoggle_Ja_Desativado;
	public static String Tptoggle_Ativado_Com_Sucesso;
	public static String Tptoggle_Ja_Ativado;
	public static String Fly_Comando_Incorreto;
	public static String Fly_Desabilitado_Voce;
	public static String Fly_Desabilitado_Outro;
	public static String Fly_Habilitado_Voce;
	public static String Fly_Habilitado_Outro;
	public static String Fly_Ja_Habilitado_Voce;
	public static String Fly_Ja_Habilitado_Outro;
	public static String Fly_Ja_Desabilitado_Voce;
	public static String Fly_Ja_Desabilitado_Outro;
	public static String Fly_Sem_Permissao_Outro;
	public static String Fly_Desabilitado_Neste_Mundo;
	public static String God_Comando_Incorreto;
	public static String God_Desabilitado_Voce;
	public static String God_Desabilitado_Outro;
	public static String God_Habilitado_Voce;
	public static String God_Habilitado_Outro;
	public static String God_Ja_Habilitado_Voce;
	public static String God_Ja_Habilitado_Outro;
	public static String God_Ja_Desabilitado_Voce;
	public static String God_Ja_Desabilitado_Outro;
	public static String God_Sem_Permissao_Outro;
	public static String Vanish_Comando_Incorreto;
	public static String Vanish_Desabilitado_Voce;
	public static String Vanish_Desabilitado_Outro;
	public static String Vanish_Habilitado_Voce;
	public static String Vanish_Habilitado_Outro;
	public static String Vanish_Ja_Habilitado_Voce;
	public static String Vanish_Ja_Habilitado_Outro;
	public static String Vanish_Ja_Desabilitado_Voce;
	public static String Vanish_Ja_Desabilitado_Outro;
	public static String Vanish_Sem_Permissao_Outro;
	public static String Gamemode_Comando_Incorreto;
	public static String Gamemode_Invalido;
	public static String Gamemode_Ja_Esta_Outro;
	public static String Gamemode_Ja_Esta_Voce;
	public static String Gamemode_Definido_Outro;
	public static String Gamemode_Definido_Voce;
	public static String Gamemode_Outro_Sem_Permissao;
	public static String Gamemode_Sem_Permissao_Tipo;
	public static String Clear_Comando_Incorreto;
	public static String Clear_Inventario_Vazio_Outro;
	public static String Clear_Inventario_Vazio_Voce;
	public static String Clear_Inventario_Limpado_Outro;
	public static String Clear_Inventario_Limpado_Voce;
	public static String Clear_Outro_Sem_Permissao;
	public static String Editar_Item_Invalido;
	public static String Editar_Item_Atributo_Invalido;
	public static String Editar_Item_Numero_Operacao_Invalido;
	public static String Editar_Item_Com_Sucesso;
	public static String Editar_Item_Comando_Incorreto;
	public static String Area_Vip_Definida;
	public static String Area_Nao_Vip_Definida;
	public static String Setmundovip_Comando_Incorreto;
	public static String Alerta_Comando_Incorreto;
	public static String Alerta_Chat;
	public static String Alerta_Title;
	public static String Alerta_SubTitle;
	public static String ExecutarSom_Comando_Incorreto;
	public static String Som_Invalido;
	public static String Som_Executado_Player;
	public static String Som_Executado_Todos;
	public static String Luz_Ativada;
	public static String Luz_Desativada;
	public static String SlimeChunk_Esta;
	public static String SlimeChunk_NaoEsta;
	public static String Teleportado_Com_Sucesso_Spawn;
	public static String Iniciando_Teleporte_Spawn;
	public static String Skull_Comando_Incorreto;
	public static String Skull_Enviada_Outro;
	public static String Skull_Enviada_Voce;
	public static String Derreter_Nao_Possui;
	public static String Derreter_Com_Sucesso;
	public static String Compactar_Nao_Possui;
	public static String Compactar_Com_Sucesso;
	public static String Ping_Comando_Incorreto;
	public static String Seu_Ping;
	public static String Player_Ping;
	public static String Iniciando_Teleporte_Vip;
	public static String Teleportado_Com_Sucesso_Sem_Vip;
	public static String Teleportado_Com_Sucesso_Vip;
	public static String Nao_Possui_Back;
	public static String Back_Teleportado_Sucesso;
	public static String Chapeu_Colocado;
	public static String Chapeu_Invalido;
	public static String Invsee_Comando_Incorreto;
	public static String Invsee_Abrindo_Inventario;
	public static String Title_Comando_Incorreto;
	public static String Title_Enviado;
	public static String Titulo_Da_Lixeira;
	public static String Players_Online;
	public static String SetSpawn_Comando_Incorreto;
	public static String SetSpawn_Normal_Definido;
	public static String SetSpawn_Vip_Definido;
	public static String Tabela_De_Cores;
	public static boolean Avisar_Que_O_Chat_Foi_Limpo;
	public static String Aviso_Que_O_Chat_Limpo_Global;
	public static String mcMMO_Upou_100_Niveis;
	public static String Crashar_Comando_Incorreto;
	public static String Crashado_Com_Sucesso;
	public static String Sudo_Comando_Incorreto;
	public static String Sudo_Executado_Com_Sucesso;
	public static String Fome_Level_Maximo;
	public static String Vida_Level_Maximo;
	public static String Fome_Regenerada_Com_Sucesso;
	public static String Vida_Regenerada_Com_Sucesso;
	public static String Speed_Comando_Incorreto;
	public static String Speed_Outro_Sem_Permissao;
	public static String Speed_Alterado_Voce; 
	public static String Speed_Alterado_Outro; 
	public static String Speed_Valor_Invalido;
	public static String System_Comando_Incorreto;
	public static String Plugin_Recarregado_Sucesso;
	public static String Backup_Com_Sucesso;
	public static String Enchant_Comando_Incorreto;
	public static String Enchant_Encantamento_Invalido;
	public static String Enchant_Item_Invalido;
	public static String Enchant_Encantado_Com_Sucesso;
	public static String Potion_Comando_Incorreto;
	public static String Potion_Item_Invalido;
	public static String Potion_Efeito_Invalido;
	public static String Potion_Editada_Sucesso;
	public static String Sem_Permissao_Sethome;
	public static String Sem_Permissao_Teleportar;
	public static String Reparar_Comando_Incorreto;
	public static String Reparar_All_Sem_Permissao;
	public static String Reparar_Nao_Possui;
	public static String Reparar_Item_Invalido;
	public static String Reparar_Ja_Reparado;
	public static String Reparar_All_Com_Sucesso;
	public static String Reparar_Hand_Com_Sucesso;
	public static String Editar_Placa_Comando_Incorreto;
	public static String Editar_Placa_Linha_Invalida;
	public static String Editar_Placa_Nao_Esta_Olhando;
	public static String Editar_Placa_Com_Sucesso;
	public static String Verinfo_Comando_Incorreto;
	public static String Verinfo_Informacoes;
	public static String Estatisticas_Comando_Incorreto;
	public static String Estatisticas_Informacoes;
	
	public static void loadMensagens() {
		FileConfiguration config = ConfigManager.getConfig("mensagens");

		Separador_De_Listas = config.getString("Separador-De-Listas").replace('&', '�');
		Console_Nao_Pode = config.getString("Console-Nao-Pode").replace('&', '�');
		Sem_Permissao = config.getString("Sem-Permissao").replace('&', '�');
		Numero_Invalido = config.getString("Numero-Invalido").replace('&', '�');
		Money_Null = config.getString("Money-Null").replace('&', '�');
		Player_Offline = config.getString("Player-Offline").replace('&', '�');
		Player_Nao_Existe = config.getString("Player-Nao-Existe").replace('&', '�');
		Mundo_Nao_Existe = config.getString("Mundo-Nao-Existe").replace('&', '�');
		Falha_Ao_Criar_Arquivo = config.getString("Falha-Ao-Criar-Arquivo").replace('&', '�');
		Falha_Ao_Criar_Pasta = config.getString("Falha-Ao-Criar-Pasta").replace('&', '�');
		Falha_Ao_Salvar = config.getString("Falha-Ao-Salvar").replace('&', '�');
		Erro_Versao_Nao_Suportada = config.getString("Erro-Versao-Nao-Suportada").replace('&', '�');
		Nick_Similar = config.getString("Nick-Similar").replace('&', '�');
		Servidor_Lotado = config.getString("Servidor-Lotado").replace('&', '�');
		Aviso_Dar_Lugar_Ao_Vip = config.getString("Aviso-Dar-Lugar-Ao-Vip").replace('&', '�').replace("%tempo%", String.valueOf(Settings.Tempo_Para_Ser_Kick));
		Kick_Dar_Lugar_Ao_Vip = config.getString("Kick-Dar-Lugar-Ao-Vip").replace('&', '�');
		Nick_Bloqueado = config.getString("Nick-Bloqueado").replace('&', '�');
		Comando_Bloqueado = config.getString("Comando-Bloqueado").replace('&', '�');
		Tentou_Passar_Da_Borda = config.getString("Tentou-Passar-Da-Borda").replace('&', '�');
		Tentou_Vender_Com_Valor_Negativo = config.getString("Tentou-Vender-Com-Valor-Negativo").replace('&', '�');
		Aguarde_EnderPearl_Cooldown = config.getString("Aguarde-EnderPearl-Cooldown").replace('&', '�').replace("%tempo%", String.valueOf(Settings.EnderPearl_Cooldown_Cooldown));
		Shift_Bloqueado_No_Container = config.getString("Shift-Bloqueado-No-Container").replace('&', '�');
		Palavras_Desativadas_Na_Placa = config.getString("Placas.Palavras-Desativadas-Na-Placa").replace('&', '�');
		Palavra_Bloqueada_Na_Placa = config.getString("Placas.Palavra-Bloqueada-Na-Placa").replace('&', '�');
		Inventario_Cheio_Quebrou = config.getString("Inventario-Cheio-Quebrou").replace('&', '�');
		Spawner_Bugado = config.getString("Spawner-Bugado").replace('&', '�');
		Spawner_Givado = config.getString("Spawner-Givado").replace('&', '�');
		Inventario_Cheio_Give = config.getString("Inventario-Cheio-Give").replace('&', '�');
		Sgive_Comando_Incorreto = config.getString("Sgive-Comando-Incorreto").replace('&', '�');
		Spawner_Desconhecido = config.getString("Spawner-Desconhecido").replace('&', '�');
		Nome_Do_MobSpawner = config.getString("Nome-Do-MobSpawner").replace('&', '�');
		SetWarp_Comando_Incorreto = config.getString("SetWarp-Comando-Incorreto").replace('&', '�');
		DelWarp_Comando_Incorreto = config.getString("DelWarp-Comando-Incorreto").replace('&', '�');
		Warp_Comando_Incorreto = config.getString("Warp-Comando-Incorreto").replace('&', '�');
		Warp_Definida = config.getString("Warp-Definida").replace('&', '�');
		Warp_Deletada = config.getString("Warp-Deletada").replace('&', '�');
		Warp_Ja_Existe = config.getString("Warp-Ja-Existe").replace('&', '�');
		Warp_Nao_Existe = config.getString("Warp-Nao-Existe").replace('&', '�');
		Nenhuma_Warp_Definida = config.getString("Nenhuma-Warp-Definida").replace('&', '�');
		Warps_Lista = config.getString("Warps-Lista").replace('&', '�');
		Particular_Comando_Incorreto = config.getString("Particular-Comando-Incorreto").replace('&', '�');
		Publica_Comando_Incorreto = config.getString("Publica-Comando-Incorreto").replace('&', '�');
		SetHome_Comando_Incorreto = config.getString("SetHome-Comando-Incorreto").replace('&', '�');
		DelHome_Comando_Incorreto = config.getString("DelHome-Comando-Incorreto").replace('&', '�');
		Homes_Comando_Incorreto = config.getString("Homes-Comando-Incorreto").replace('&', '�');
		Home_Comando_Incorreto = config.getString("Home-Comando-Incorreto").replace('&', '�');
		Home_Outro_Comando_Incorreto = config.getString("Home-Outro-Comando-Incorreto").replace('&', '�');
		Home_Definida = config.getString("Home-Definida").replace('&', '�');
		Home_Deletada = config.getString("Home-Deletada").replace('&', '�');
		Home_Nao_Existe = config.getString("Home-Nao-Existe").replace('&', '�');
		Player_Home_Nao_Existe = config.getString("Player-Home-Nao-Existe").replace('&', '�');
		Player_Home_Nao_Publica = config.getString("Player-Home-Nao-Publica").replace('&', '�');
		Home_Privada_Iniciando_Teleporte = config.getString("Home-Privada-Iniciando-Teleporte").replace('&', '�').replace("%tempo%", String.valueOf(Settings.Delay_Para_Teleportar_Comandos));
		Home_Publica_Iniciando_Teleporte = config.getString("Home-Publica-Iniciando-Teleporte").replace('&', '�').replace("%tempo%", String.valueOf(Settings.Delay_Para_Teleportar_Comandos));
		Home_Privada_Teleportado_Sucesso = config.getString("Home-Privada-Teleportado-Sucesso").replace('&', '�');
		Home_Publica_Teleportado_Sucesso = config.getString("Home-Publica-Teleportado-Sucesso").replace('&', '�');
		Homes_Publicas = config.getString("Homes-Publicas").replace('&', '�');
		Homes_Particulares = config.getString("Homes-Particulares").replace('&', '�');
		Limite_De_Homes_Atingido = config.getString("Limite-De-Homes-Atingido").replace('&', '�');
		Home_Ja_Publica = config.getString("Home-Ja-Publica").replace('&', '�');
		Home_Ja_Particular = config.getString("Home-Ja-Particular").replace('&', '�');
		Tornou_Home_Publica = config.getString("Tornou-Home-Publica").replace('&', '�');
		Tornou_Home_Particular = config.getString("Tornou-Home-Particular").replace('&', '�');
		Kit_Comando_Incorreto = config.getString("Kit-Comando-Incorreto").replace('&', '�');
		Kit_Comando_Incorreto_Console = config.getString("Kit-Comando-Incorreto-Console").replace('&', '�');
		DelKit_Comando_Incorreto = config.getString("DelKit-Comando-Incorreto").replace('&', '�');
		VerKit_Comando_Incorreto = config.getString("VerKit-Comando-Incorreto").replace('&', '�');
		CriarKit_Comando_Incorreto = config.getString("CriarKit-Comando-Incorreto").replace('&', '�');
		EditarKit_Comando_Incorreto_Delay = config.getString("EditarKit-Comando-Incorreto-Delay").replace('&', '�');
		EditarKit_Comando_Incorreto_Perm = config.getString("EditarKit-Comando-Incorreto-Perm").replace('&', '�');
		EditarKit_Comando_Incorreto = config.getString("EditarKit-Comando-Incorreto").replace('&', '�');
		Kit_Nao_Existe = config.getString("Kit-Nao-Existe").replace('&', '�');
		Kit_Ja_Existe = config.getString("Kit-Ja-Existe").replace('&', '�');
		Kit_Sem_Permissao = config.getString("Kit-Sem-Permissao").replace('&', '�');
		Kit_Criado = config.getString("Kit-Criado").replace('&', '�');
		Kit_Editado = config.getString("Kit-Editado").replace('&', '�');
		Kit_Deletado = config.getString("Kit-Deletado").replace('&', '�');
		Kit_Sem_Espaco_Pra_Pegar = config.getString("Kit-Sem-Espaco-Pra-Pegar").replace('&', '�');
		Kit_Pego = config.getString("Kit-Pego").replace('&', '�');
		Kit_Enviado = config.getString("Kit-Enviado").replace('&', '�');
		Kit_Aguarde = config.getString("Kit-Aguarde").replace('&', '�');
		Nenhum_Kit_Criado = config.getString("Nenhum-Kit-Criado").replace('&', '�');
		Kits_Lista = config.getString("Kits-Lista").replace('&', '�');
		Divulgar_Comando_Incorreto = config.getString("Divulgar-Comando-Incorreto").replace('&', '�');
		Link_Invalido = config.getString("Link-Invalido").replace('&', '�');
		Divulgando_Live = config.getString("Divulgando-Live").replace('&', '�');
		Divulgando_Video = config.getString("Divulgando-Video").replace('&', '�');
		Divulgando_Outro = config.getString("Divulgando-Outro").replace('&', '�');
		Link = config.getString("Link").replace('&', '�');
		Divulgando_Title = config.getString("Divulgando-Title").replace('&', '�');
		Divulgando_SubTitle = config.getString("Divulgando-SubTitle").replace('&', '�');
		Tp_Comando_Incorreto = config.getString("Tp-Comando-Incorreto").replace('&', '�');
		Tp_Erro_Voce_Mesmo = config.getString("Tp-Erro-Voce-Mesmo").replace('&', '�');
		Tp_Erro_Player_Mesmo = config.getString("Tp-Erro-Player-Mesmo").replace('&', '�');
		Tp_Teleportado_Com_Sucesso_Player = config.getString("Tp-Teleportado-Com-Sucesso-Player").replace('&', '�');
		Tp_Teleportado_Com_Sucesso_Cords = config.getString("Tp-Teleportado-Com-Sucesso-Cords").replace('&', '�');
		Tp_Voce_Teleportou_Player_Ate_Player = config.getString("Tp-Voce-Teleportou-Player-Ate-Player").replace('&', '�');
		Tp_Voce_Teleportou_Player_Ate_Cords = config.getString("Tp-Voce-Teleportou-Player-Ate-Cords").replace('&', '�');
		Tphere_Comando_Incorreto = config.getString("Tphere-Comando-Incorreto").replace('&', '�');
		Tphere_Erro_Voce_Mesmo = config.getString("Tphere-Erro-Voce-Mesmo").replace('&', '�');
		Tphere_Puxou_Com_Sucesso = config.getString("Tphere-Puxou-Com-Sucesso").replace('&', '�');
		Tphere_Puxado_Com_Sucesso = config.getString("Tphere-Puxado-Com-Sucesso").replace('&', '�');
		Tpall_Comando_Incorreto = config.getString("Tpall-Comando-Incorreto").replace('&', '�');
		Tpall_Puxou_Com_Sucesso_Player = config.getString("Tpall-Puxou-Com-Sucesso-Player").replace('&', '�');
		Tpall_Puxou_Com_Sucesso_Cords = config.getString("Tpall-Puxou-Com-Sucesso-Cords").replace('&', '�');
		Tpa_Comando_Incorreto = config.getString("Tpa-Comando-Incorreto").replace('&', '�');
		Tpa_Aguarde_Cooldown = config.getString("Tpa-Aguarde-Cooldown").replace('&', '�').replace("%tempo%", String.valueOf(Settings.Tempo_Para_Poder_Enviar_Outra_Solicitacao_Tpa));;
		Tpa_Desligado_Tptoggle = config.getString("Tpa-Desligado-Tptoggle").replace('&', '�');
		Tpa_Ja_Possui_Solicitacao = config.getString("Tpa-Ja-Possui-Solicitacao").replace('&', '�');
		Tpa_Solicitcao_Expirada_Player = config.getString("Tpa-Solicitcao-Expirada-Player").replace('&', '�');
		Tpa_Solicitcao_Expirada_Alvo = config.getString("Tpa-Solicitcao-Expirada-Alvo").replace('&', '�');
		Tpa_Solicitacao_Enviada_Sucesso = config.getString("Tpa-Solicitacao-Enviada-Sucesso").replace('&', '�');
		Tpa_Solicitacao_Recebida = config.getString("Tpa-Solicitacao-Recebida").replace('&', '�');
		Tpa_Pendente_Nao_Possui = config.getString("Tpa-Pendente-Nao-Possui").replace('&', '�');
		Tpa_Pendente_Player_Nao_Possui = config.getString("Tpa-Pendente-Player-Nao-Possui").replace('&', '�');
		Tpaccept_Comando_Incorreto = config.getString("Tpaccept-Comando-Incorreto").replace('&', '�');
		Tpaccept_Player_Offline = config.getString("Tpaccept-Player-Offline").replace('&', '�');
		Tpaccept_Erro_Voce_Mesmo = config.getString("Tpaccept-Erro-Voce-Mesmo").replace('&', '�');
		Tpaccept_Solicitacao_Aceita_Sucesso = config.getString("Tpaccept-Solicitacao-Aceita-Sucesso").replace('&', '�');
		Tpaccept_Iniciando_Teleporte = config.getString("Tpaccept-Iniciando-Teleporte").replace('&', '�').replace("%tempo%", String.valueOf(Settings.Delay_Para_Teleportar_Comandos));
		Tpaccept_Teleportado_Com_sucesso = config.getString("Tpaccept-Teleportado-Com-sucesso").replace('&', '�');
		Tpdeny_Comando_Incorreto = config.getString("Tpdeny-Comando-Incorreto").replace('&', '�');
		Tpdeny_Erro_Voce_Mesmo = config.getString("Tpdeny-Erro-Voce-Mesmo").replace('&', '�');
		Tpdeny_Recusado_Com_Sucesso = config.getString("Tpdeny-Recusado-Com-Sucesso").replace('&', '�');
		Tpdeny_Recusou_Seu_Pedido = config.getString("Tpdeny-Recusou-Seu-Pedido").replace('&', '�');
		Tpcancel_Comando_Incorreto = config.getString("Tpcancel-Comando-Incorreto").replace('&', '�');
		Tpcancel_Erro_Voce_Mesmo = config.getString("Tpcancel-Erro-Voce-Mesmo").replace('&', '�');
		Tpcancel_Cancelado_Com_Sucesso = config.getString("Tpcancel-Cancelado-Com-Sucesso").replace('&', '�');
		Tpcancel_Cancelou_Pedido = config.getString("Tpcancel-Cancelou-Pedido").replace('&', '�');
		Tptoggle_Comando_Incorreto = config.getString("Tptoggle-Comando-Incorreto").replace('&', '�');
		Tptoggle_Desativado_Com_Sucesso = config.getString("Tptoggle-Desativado-Com-Sucesso").replace('&', '�');
		Tptoggle_Ja_Desativado = config.getString("Tptoggle-Ja-Desativado").replace('&', '�');
		Tptoggle_Ativado_Com_Sucesso = config.getString("Tptoggle-Ativado-Com-Sucesso").replace('&', '�');
		Tptoggle_Ja_Ativado = config.getString("Tptoggle-Ja-Ativado").replace('&', '�');
		Fly_Comando_Incorreto = config.getString("Fly-Comando-Incorreto").replace('&', '�');
		Fly_Desabilitado_Voce = config.getString("Fly-Desabilitado-Voce").replace('&', '�');
		Fly_Desabilitado_Outro = config.getString("Fly-Desabilitado-Outro").replace('&', '�');
		Fly_Habilitado_Voce = config.getString("Fly-Habilitado-Voce").replace('&', '�');
		Fly_Habilitado_Outro = config.getString("Fly-Habilitado-Outro").replace('&', '�');
		Fly_Ja_Habilitado_Voce = config.getString("Fly-Ja-Habilitado-Voce").replace('&', '�');
		Fly_Ja_Habilitado_Outro = config.getString("Fly-Ja-Habilitado-Outro").replace('&', '�');
		Fly_Ja_Desabilitado_Voce = config.getString("Fly-Ja-Desabilitado-Voce").replace('&', '�');
		Fly_Ja_Desabilitado_Outro = config.getString("Fly-Ja-Desabilitado-Outro").replace('&', '�');
		Fly_Desabilitado_Neste_Mundo = config.getString("Fly-Desabilitado-Neste-Mundo").replace('&', '�');
		Fly_Sem_Permissao_Outro = config.getString("Fly-Sem-Permissao-Outro").replace('&', '�');
		God_Comando_Incorreto = config.getString("God-Comando-Incorreto").replace('&', '�');
		God_Desabilitado_Voce = config.getString("God-Desabilitado-Voce").replace('&', '�');
		God_Desabilitado_Outro = config.getString("God-Desabilitado-Outro").replace('&', '�');
		God_Habilitado_Voce = config.getString("God-Habilitado-Voce").replace('&', '�');
		God_Habilitado_Outro = config.getString("God-Habilitado-Outro").replace('&', '�');
		God_Ja_Habilitado_Voce = config.getString("God-Ja-Habilitado-Voce").replace('&', '�');
		God_Ja_Habilitado_Outro = config.getString("God-Ja-Habilitado-Outro").replace('&', '�');
		God_Ja_Desabilitado_Voce = config.getString("God-Ja-Desabilitado-Voce").replace('&', '�');
		God_Ja_Desabilitado_Outro = config.getString("God-Ja-Desabilitado-Outro").replace('&', '�');
		God_Sem_Permissao_Outro = config.getString("God-Sem-Permissao-Outro").replace('&', '�');
		Vanish_Comando_Incorreto = config.getString("Vanish-Comando-Incorreto").replace('&', '�');
		Vanish_Desabilitado_Voce = config.getString("Vanish-Desabilitado-Voce").replace('&', '�');
		Vanish_Desabilitado_Outro = config.getString("Vanish-Desabilitado-Outro").replace('&', '�');
		Vanish_Habilitado_Voce = config.getString("Vanish-Habilitado-Voce").replace('&', '�');
		Vanish_Habilitado_Outro = config.getString("Vanish-Habilitado-Outro").replace('&', '�');
		Vanish_Ja_Habilitado_Voce = config.getString("Vanish-Ja-Habilitado-Voce").replace('&', '�');
		Vanish_Ja_Habilitado_Outro = config.getString("Vanish-Ja-Habilitado-Outro").replace('&', '�');
		Vanish_Ja_Desabilitado_Voce = config.getString("Vanish-Ja-Desabilitado-Voce").replace('&', '�');
		Vanish_Ja_Desabilitado_Outro = config.getString("Vanish-Ja-Desabilitado-Outro").replace('&', '�');
		Vanish_Sem_Permissao_Outro = config.getString("Vanish-Sem-Permissao-Outro").replace('&', '�');
		Gamemode_Comando_Incorreto = config.getString("Gamemode-Comando-Incorreto").replace('&', '�');
		Gamemode_Invalido = config.getString("Gamemode-Invalido").replace('&', '�');
		Gamemode_Ja_Esta_Outro = config.getString("Gamemode-Ja-Esta-Outro").replace('&', '�');
		Gamemode_Ja_Esta_Voce = config.getString("Gamemode-Ja-Esta-Voce").replace('&', '�');
		Gamemode_Definido_Outro = config.getString("Gamemode-Definido-Outro").replace('&', '�');
		Gamemode_Definido_Voce = config.getString("Gamemode-Definido-Voce").replace('&', '�');
		Gamemode_Outro_Sem_Permissao = config.getString("Gamemode-Outro-Sem-Permissao").replace('&', '�');
		Gamemode_Sem_Permissao_Tipo = config.getString("Gamemode-Sem-Permissao-Tipo").replace('&', '�');
		Clear_Comando_Incorreto = config.getString("Clear-Comando-Incorreto").replace('&', '�');
		Clear_Inventario_Vazio_Outro = config.getString("Clear-Inventario-Vazio-Outro").replace('&', '�');
		Clear_Inventario_Vazio_Voce = config.getString("Clear-Inventario-Vazio-Voce").replace('&', '�');
		Clear_Inventario_Limpado_Outro = config.getString("Clear-Inventario-Limpado-Outro").replace('&', '�');
		Clear_Inventario_Limpado_Voce = config.getString("Clear-Inventario-Limpado-Voce").replace('&', '�');
		Clear_Outro_Sem_Permissao = config.getString("Clear-Outro-Sem-Permissao").replace('&', '�');
		Editar_Item_Invalido = config.getString("Editar-Item-Invalido").replace('&', '�');
		Editar_Item_Atributo_Invalido = config.getString("Editar-Item-Atributo-Invalido").replace('&', '�');
		Editar_Item_Numero_Operacao_Invalido = config.getString("Editar-Item-Numero-Operacao-Invalido").replace('&', '�');
		Editar_Item_Com_Sucesso = config.getString("Editar-Item-Com-Sucesso").replace('&', '�');
		Editar_Item_Comando_Incorreto = config.getString("Editar-Item-Comando-Incorreto").replace('&', '�');
		Area_Vip_Definida = config.getString("Area-Vip-Definida").replace('&', '�');
		Area_Nao_Vip_Definida = config.getString("Area-Nao-Vip-Definida").replace('&', '�');
		Setmundovip_Comando_Incorreto = config.getString("Setmundovip-Comando-Incorreto").replace('&', '�');
		Alerta_Comando_Incorreto = config.getString("Alerta-Comando-Incorreto").replace('&', '�');
		Alerta_Chat = config.getString("Alerta-Chat").replace('&', '�');
		Alerta_Title = config.getString("Alerta-Title").replace('&', '�');
		Alerta_SubTitle = config.getString("Alerta-SubTitle").replace('&', '�');
		ExecutarSom_Comando_Incorreto = config.getString("ExecutarSom-Comando-Incorreto").replace('&', '�');
		Som_Invalido = config.getString("Som-Invalido").replace('&', '�');
		Som_Executado_Player = config.getString("Som-Executado-Player").replace('&', '�');
		Som_Executado_Todos = config.getString("Som-Executado-Todos").replace('&', '�');
		Luz_Ativada = config.getString("Luz.Ativada").replace('&', '�');
		Luz_Desativada = config.getString("Luz.Desativada").replace('&', '�');
		SlimeChunk_Esta = config.getString("SlimeChunk.Esta").replace('&', '�');
		SlimeChunk_NaoEsta = config.getString("SlimeChunk.NaoEsta").replace('&', '�');
		Teleportado_Com_Sucesso_Spawn = config.getString("Teleportado-Com-Sucesso-Spawn").replace('&', '�');
		Iniciando_Teleporte_Spawn = config.getString("Iniciando-Teleporte-Spawn").replace('&', '�').replace("%tempo%", String.valueOf(Settings.Delay_Para_Teleportar_Comandos));
		Skull_Comando_Incorreto = config.getString("Skull-Comando-Incorreto").replace('&', '�');
		Skull_Enviada_Outro = config.getString("Skull-Enviada-Outro").replace('&', '�');
		Skull_Enviada_Voce = config.getString("Skull-Enviada-Voce").replace('&', '�');
		Derreter_Nao_Possui = config.getString("Derreter-Nao-Possui").replace('&', '�');
		Derreter_Com_Sucesso = config.getString("Derreter-Com-Sucesso").replace('&', '�');
		Compactar_Nao_Possui = config.getString("Compactar-Nao-Possui").replace('&', '�');
		Compactar_Com_Sucesso = config.getString("Compactar-Com-Sucesso").replace('&', '�');
		Ping_Comando_Incorreto = config.getString("Ping-Comando-Incorreto").replace('&', '�');
		Seu_Ping = config.getString("Ping.Seu-Ping").replace('&', '�');
		Player_Ping = config.getString("Ping.Player-Ping").replace('&', '�');
		Iniciando_Teleporte_Vip = config.getString("Iniciando-Teleporte-Vip").replace('&', '�').replace("%tempo%", String.valueOf(Settings.Delay_Para_Teleportar_Comandos));
		Teleportado_Com_Sucesso_Sem_Vip = config.getString("Teleportado-Com-Sucesso-Sem-Vip").replace('&', '�');
		Teleportado_Com_Sucesso_Vip = config.getString("Teleportado-Com-Sucesso-Vip").replace('&', '�');
		Nao_Possui_Back = config.getString("Nao-Possui-Back").replace('&', '�');
		Back_Teleportado_Sucesso = config.getString("Back-Teleportado-Sucesso").replace('&', '�');
		Chapeu_Colocado = config.getString("Chapeu-Colocado").replace('&', '�');
		Chapeu_Invalido = config.getString("Chapeu-Invalido").replace('&', '�');
		Invsee_Comando_Incorreto = config.getString("Invsee-Comando-Incorreto").replace('&', '�');
		Invsee_Abrindo_Inventario = config.getString("Invsee-Abrindo-Inventario").replace('&', '�');
		Title_Comando_Incorreto = config.getString("Title-Comando-Incorreto").replace('&', '�');
		Title_Enviado = config.getString("Title-Enviado").replace('&', '�');
		Titulo_Da_Lixeira = config.getString("Titulo-Da-Lixeira").replace('&', '�');
		Players_Online = config.getString("Players-Online").replace('&', '�');
		SetSpawn_Comando_Incorreto = config.getString("SetSpawn-Comando-Incorreto").replace('&', '�');
		SetSpawn_Normal_Definido = config.getString("SetSpawn-Normal-Definido").replace('&', '�');
		SetSpawn_Vip_Definido = config.getString("SetSpawn-Vip-Definido").replace('&', '�');
		Tabela_De_Cores = config.getString("Tabela-De-Cores");
		Avisar_Que_O_Chat_Foi_Limpo = config.getBoolean("Avisar-Que-O-Chat-Foi-Limpo");
		Aviso_Que_O_Chat_Limpo_Global = config.getString("Aviso-Que-O-Chat-Limpo-Global").replace('&', '�');
		mcMMO_Upou_100_Niveis = config.getString("mcMMO-Upou-100-Niveis").replace('&', '�');
		Crashar_Comando_Incorreto = config.getString("Crashar-Comando-Incorreto").replace('&', '�');
		Crashado_Com_Sucesso = config.getString("Crashado-Com-Sucesso").replace('&', '�');
		Sudo_Comando_Incorreto = config.getString("Sudo-Comando-Incorreto").replace('&', '�');
		Sudo_Executado_Com_Sucesso = config.getString("Sudo-Executado-Com-Sucesso").replace('&', '�');
		Fome_Level_Maximo = config.getString("Fome-Level-Maximo").replace('&', '�');
		Vida_Level_Maximo = config.getString("Vida-Level-Maximo").replace('&', '�');
		Fome_Regenerada_Com_Sucesso = config.getString("Fome-Regenerada-Com-Sucesso").replace('&', '�');
		Vida_Regenerada_Com_Sucesso = config.getString("Vida-Regenerada-Com-Sucesso").replace('&', '�');
		Speed_Comando_Incorreto = config.getString("Speed-Comando-Incorreto").replace('&', '�');
		Speed_Outro_Sem_Permissao = config.getString("Speed-Outro-Sem-Permissao").replace('&', '�');
		Speed_Alterado_Voce = config.getString("Speed-Alterado-Voce").replace('&', '�'); 
		Speed_Alterado_Outro = config.getString("Speed-Alterado-Outro").replace('&', '�'); 
		Speed_Valor_Invalido = config.getString("Speed-Valor-Invalido").replace('&', '�'); 
		System_Comando_Incorreto = config.getString("System-Comando-Incorreto").replace('&', '�'); 
		Plugin_Recarregado_Sucesso = config.getString("Plugin-Recarregado-Sucesso").replace('&', '�'); 
		Backup_Com_Sucesso = config.getString("Backup-Com-Sucesso").replace('&', '�'); 
		Enchant_Comando_Incorreto = config.getString("Enchant-Comando-Incorreto").replace('&', '�'); 
		Enchant_Encantamento_Invalido = config.getString("Enchant-Encantamento-Invalido").replace('&', '�'); 
		Enchant_Item_Invalido = config.getString("Enchant-Item-Invalido").replace('&', '�'); 
		Enchant_Encantado_Com_Sucesso = config.getString("Enchant-Encantado-Com-Sucesso").replace('&', '�'); 
		Potion_Comando_Incorreto = config.getString("Potion-Comando-Incorreto").replace('&', '�'); 
		Potion_Item_Invalido = config.getString("Potion-Item-Invalido").replace('&', '�'); 
		Potion_Efeito_Invalido = config.getString("Potion-Efeito-Invalido").replace('&', '�'); 
		Potion_Editada_Sucesso = config.getString("Potion-Editada-Sucesso").replace('&', '�'); 
		Sem_Permissao_Teleportar = config.getString("Sem-Permissao-Teleportar").replace('&', '�'); 
		Sem_Permissao_Sethome = config.getString("Sem-Permissao-Sethome").replace('&', '�'); 
		Reparar_Comando_Incorreto = config.getString("Reparar-Comando-Incorreto").replace('&', '�'); 
		Reparar_All_Sem_Permissao = config.getString("Reparar-All-Sem-Permissao").replace('&', '�'); 
		Reparar_Nao_Possui = config.getString("Reparar-Nao-Possui").replace('&', '�'); 
		Reparar_Item_Invalido = config.getString("Reparar-Item-Invalido").replace('&', '�'); 
		Reparar_Ja_Reparado = config.getString("Reparar-Ja-Reparado").replace('&', '�'); 
		Reparar_All_Com_Sucesso = config.getString("Reparar-All-Com-Sucesso").replace('&', '�'); 
		Reparar_Hand_Com_Sucesso = config.getString("Reparar-Hand-Com-Sucesso").replace('&', '�'); 
		Editar_Placa_Comando_Incorreto = config.getString("Editar-Placa-Comando-Incorreto").replace('&', '�'); 
		Editar_Placa_Linha_Invalida = config.getString("Editar-Placa-Linha-Invalida").replace('&', '�'); 
		Editar_Placa_Nao_Esta_Olhando = config.getString("Editar-Placa-Nao-Esta-Olhando").replace('&', '�'); 
		Editar_Placa_Com_Sucesso = config.getString("Editar-Placa-Com-Sucesso").replace('&', '�');
		Verinfo_Comando_Incorreto = config.getString("Verinfo-Comando-Incorreto").replace('&', '�');
		Verinfo_Informacoes = config.getString("Verinfo-Informacoes").replace('&', '�');
		Estatisticas_Comando_Incorreto = config.getString("Estatisticas-Comando-Incorreto").replace('&', '�');
		Estatisticas_Informacoes = config.getString("Estatisticas-Informacoes").replace('&', '�');
	}
}
