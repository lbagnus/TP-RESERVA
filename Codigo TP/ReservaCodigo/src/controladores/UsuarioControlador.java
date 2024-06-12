package controladores;
import java.util.*;
import logica.*;
import dtos.UsuarioDTO;

public class UsuarioControlador {
	private Turista turista;
	private Guia guia;
	public static List<Usuario> usuarios;
	private IAdapter3Parties adapter;
	
	public UsuarioControlador() {
		turista = new Turista();
		guia = new Guia();
		usuarios = new ArrayList<Usuario>();
		adapter = new IAdapter3Parties();
	}
	
	
	public void RegistrarUsuario(UsuarioDTO user, TipoUsuario tipo, ModoRegistro modo) {
		if (!UsuarioControlador.existe(user)) {
		switch (tipo) {
		case GUIA :
			guia.RegistrarUsuario(user);
			break;
		case TURISTA:
			turista.RegistrarUsuario(user);
			break;
		}
		switch (modo) {
		case FACEBOOK, APPLE, GOOGLE: 
			adapter.registrarUsuario(modo);
		}
		}else {
			System.out.println("Este usuario ya existe bobo");
		}
		
	}
	
	private static boolean existe(UsuarioDTO user) {
		if (UsuarioControlador.usuarios.contains(user)) {
			return false;
		}else {
			return true;
		}

	}


	
	
}

