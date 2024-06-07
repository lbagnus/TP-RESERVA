package logica;
import java.util.ArrayList;
import logica.Usuario;


public class Turista extends Usuario {
	private int cantTrofeo;
	private int[] cantReseña =  new int[100];
	
	public Turista(String nombre, String apellido, String sexo, String email, int numTelefono,ArrayList<Viaje> viajesRealizados, int cantTrofeo,int[] cantReseñas ) {
		super(nombre, apellido, sexo, email, numTelefono, viajesRealizados);
		this.cantReseña = cantReseña;
		this.cantTrofeo = cantTrofeo;
	}
	
	
public void RegistrarUsuario(String nombre, String apellido) {
	System.out.println("Se creo el nuevo Turista: " + nombre + apellido);
}

}
