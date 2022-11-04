import javax.swing.JTextField;

/**
 * 
 */

/**
 * @author joaquinaparicios.
 *
 */
public class Usuario {
	private String nombre;
	private String correo;
	private String pais;
	private int miembros;
	
	public Usuario() {
		nombre = null;
		correo = null;
		pais = null;
		miembros = 0;
	}
	
	public Usuario(String nombre, String correo, String pais){
		this.nombre = nombre;
		this.correo = correo;
		this.pais = pais;
		this.miembros = miembros;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getCorreo() {
		return correo;
	}
	
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	public String getPais() {
		return pais;
	}
	
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	public int getMiembros() {
		return miembros;
	}
	
	public void setMiembros(int miembros) {
		this.miembros = miembros;
	}
}
