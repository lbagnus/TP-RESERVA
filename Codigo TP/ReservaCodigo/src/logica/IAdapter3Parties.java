package logica;
import controladores.*;
public class IAdapter3Parties {
	private Google google;
	private Apple apple;
	private Facebook facebook;

	public void registrarUsuario(ModoRegistro modo) {
		switch(modo) {
		case FACEBOOK: 
			facebook = new Facebook();
			facebook.registrarUsuario();
			break;
		case APPLE: 
			apple = new Apple();
			apple.registrarUsuario();
			break;
		case GOOGLE: 
			google = new Google();
			google.registrarUsuario();
			break;
		}
	}
}
