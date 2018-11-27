package presentacion;

import biblioteca.Consola;
import pojos.Usuario;

public class PresentacionConsola {

	public static void main(String[] args) {
		Usuario usuario = pedirUsuario();
		
		System.out.println(usuario);

	}

	private static Usuario pedirUsuario() {
		System.out.print("ID: ");
		Long id = Consola.leerLong();
		
		System.out.print("Email: ");
		String email = Consola.leerLinea();
		
		System.out.print("Contraseña: ");
		String password = Consola.leerLinea();
		
		Usuario usuario = new Usuario(id, email, password);
		return usuario;
	}

}
