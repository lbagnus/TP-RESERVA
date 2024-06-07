package logica;
import java.util.ArrayList;
import logica.Usuario;

public class Guia extends Usuario{
	private String ciudad;
	private String pais;
	private static ArrayList<String> idiomas = new ArrayList<String>();
	private int cantTrofeo;
	private float[] puntuacion  = new float[100];
	private ArrayList<Viaje> fechasOcupadas;
	
public Guia(String nombre, String apellido, String sexo, String email, int numTelefono,ArrayList<Viaje> viajesRealizados,String ciudad,String pais, ArrayList<String> idiomas, int cantTrofeo, float[] puntuacion,ArrayList<Viaje> fechasOcupadas) {
	super(nombre, apellido, sexo, email, numTelefono, viajesRealizados);
	this.ciudad = ciudad;
	this.pais = pais;
	this.idiomas = idiomas;
	this.cantTrofeo = cantTrofeo;
	this.puntuacion = puntuacion;
	this.fechasOcupadas = fechasOcupadas;
}
public void RegistrarUsuario(String nombre, String apellido) {
	System.out.println("nuevo guia: " + nombre + apellido);
	
}
}
