package dtos;
import java.util.ArrayList;
import logica.Viaje;

public class UsuarioDTO {
	private String apellido;
	private String sexo;
	private String email;
	private int numTelefono;
	private ArrayList<Viaje> viajesRealizados;
	private int cantTrofeo;
	private String ciudad;
	private String pais;
	private static ArrayList<String> idiomas ;
	private float[] puntuacion; 
	private ArrayList<Viaje> fechasOcupadas;
	
	
	
	
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public static ArrayList<String> getIdiomas() {
		return idiomas;
	}
	public static void setIdiomas(ArrayList<String> idiomas) {
		UsuarioDTO.idiomas = idiomas;
	}
	public float[] getPuntuacion() {
		return puntuacion;
	}
	public void setPuntuacion(float[] puntuacion) {
		this.puntuacion = puntuacion;
	}
	public ArrayList<Viaje> getFechasOcupadas() {
		return fechasOcupadas;
	}
	public void setFechasOcupadas(ArrayList<Viaje> fechasOcupadas) {
		this.fechasOcupadas = fechasOcupadas;
	}
	
	public int getCantTrofeo() {
		return cantTrofeo;
	}
	public void setCantTrofeo(int cantTrofeo) {
		this.cantTrofeo = cantTrofeo;
	}
	public int[] getCantReseña() {
		return cantReseña;
	}
	public void setCantReseña(int[] cantReseña) {
		this.cantReseña = cantReseña;
	}
	private int[] cantReseña; 
	
	private String nombre;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getNumTelefono() {
		return numTelefono;
	}
	public void setNumTelefono(int numTelefono) {
		this.numTelefono = numTelefono;
	}
	public ArrayList<Viaje> getViajesRealizados() {
		return viajesRealizados;
	}
	public void setViajesRealizados(ArrayList<Viaje> viajesRealizados) {
		this.viajesRealizados = viajesRealizados;
	}
	
}