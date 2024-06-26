package logica;
import logica.Viaje;
import java.util.*;

public abstract class Usuario {
	private String nombre;
	private String apellido;
	private String sexo;
	private String email;
	private int numTelefono;
	private ArrayList<Viaje> viajesRealizados;

	public Usuario(String nombre, String apellido, String sexo, String email, int numTelefono,ArrayList<Viaje> viajesRealizados) {
		this.nombre= nombre;
		this.apellido = apellido;
		this.sexo = sexo;
		this.email = email;
		this.numTelefono = numTelefono;
		this.viajesRealizados = viajesRealizados;
	}
	
	public abstract void RegistrarUsuario(String nombre, String apellido); 
}


