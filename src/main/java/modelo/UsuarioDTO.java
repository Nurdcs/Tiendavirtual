package modelo;

public class UsuarioDTO {
	private long documento;
	private String nombre;
	private String usuario;
	private String email;
	private String clave;
	public UsuarioDTO(long documento, String nombre, String usuario, String email, String clave) {
		this.documento = documento;
		this.nombre = nombre;
		this.usuario = usuario;
		this.email = email;
		this.clave = clave;
	}
	
	
	
	



	public UsuarioDTO(long documento) {
		super();
		this.documento = documento;
	}



	public long getDocumento() {
		return documento;
	}
	public void setDocumento(long documento) {
		this.documento = documento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	
	@Override
	public String toString() {
		return "UsuarioDTO [documento=" + documento + ", nombre=" + nombre + ", usuario=" + usuario + ", email=" + email
				+ ", clave=" + clave + "]";
	}
	
}
