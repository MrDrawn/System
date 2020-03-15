package rush.entidades;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.scheduler.BukkitRunnable;

import rush.Main;
import rush.configuracoes.Locations;
import rush.utils.Utils;

public class Warp {

	private String nome;
	private Location location;
	private String permissao;
	private String semPermissao;
	private int delay;
	private boolean delayParaVips;
    private boolean enviarMensagem;
	private String mensagemInicio;
	private String mensagemFinal;
	private boolean enviarTitle;
	private String title;
	private String subtitle;
	private String mensagemPlayerTeleportado;
    private String mensagemPlayerTeleportadoStaff;
	
	public Warp(String nome, String location, String permissao, String semPermissao, int delay, boolean delayVip,
				boolean enviarMensagem, String mensagemInicio, String mensagemFinal, boolean enviarTitle, String title,
				 String subtitle, String mensagemPlayerTeleportado, String mensagemPlayerTeleportadoStaff) {
		this.location = Utils.deserializeLocation(location);
		this.nome = nome.replace('&', '�');
		this.permissao = permissao.trim();
		this.semPermissao = semPermissao.replace('&', '�');
		this.delay = delay;
		this.enviarMensagem = enviarMensagem;
		this.delayParaVips = delayVip;
		this.mensagemInicio = mensagemInicio.replace('&', '�');
		this.mensagemFinal = mensagemFinal.replace('&', '�');
		this.enviarTitle = enviarTitle;
		this.title = title.replace('&', '�');
		this.subtitle = subtitle.replace('&', '�');
		this.mensagemPlayerTeleportado = mensagemPlayerTeleportado.replace('&', '�');
		this.mensagemPlayerTeleportadoStaff = mensagemPlayerTeleportadoStaff.replace('&', '�');
		this.validWarp(location);
	}

	public Location getLocation() {
		return location;
	}

	public String getPermissao() {
		return permissao;
	}

	public String getSemPermissao() {
		return semPermissao;
	}

	public int getDelay() {
		return delay;
	}

	public boolean delayParaVips() {
		return delayParaVips;
	}
	
	public boolean enviarMensagem() {
		return enviarMensagem;
	}

	public String getMensagemInicio() {
		return mensagemInicio;
	}

	public String getMensagemFinal() {
		return mensagemFinal;
	}

	public boolean enviarTitle() {
		return enviarTitle;
	}

	public String getTitle() {
		return title;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public String getNome() {
		return nome;
	}
	
	public String getMensagemPlayerTeleportado() {
		return mensagemPlayerTeleportado;
	}
	
	public String getMensagemPlayerTeleportadoStaff() {
		return mensagemPlayerTeleportadoStaff;
	}
	
	private void validWarp(String location) {
		if (this.location.getWorld() == null) {
			this.location = Locations.padrao;
			new BukkitRunnable() {
				@Override
				public void run() {
					Warp.this.location = Utils.deserializeLocation(location);
					if (Warp.this.location.getWorld() == null) {
						Warp.this.location = Locations.padrao;
						Bukkit.getConsoleSender().sendMessage("�c[System] Nao foi possivel carregar a localizacao da Warp \"" + Warp.this.nome + "\".");
					}
				}
			}.runTaskLaterAsynchronously(Main.get(), 20L * 25L);
		}
	}

	@Override
	public String toString() {
		return nome;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Warp other = (Warp) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

}