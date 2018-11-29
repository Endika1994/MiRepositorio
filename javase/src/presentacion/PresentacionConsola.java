package presentacion;

import java.util.ArrayList;

import accesodatos.CrudAble;
import accesodatos.UsuarioDaoArrayList;
import biblioteca.Consola;
import pojos.Usuario;

public class PresentacionConsola {
	
	 private static ArrayList<Usuario> users = new ArrayList<>();
	 
	public static void main(String[] args) {
//		SIN CAPA DE ACCESO A DATOS
		
		String opcion;
		
		do {
			mostrarMenu();
			
			opcion = Consola.leerLinea("Dime que opcion quieres");
			
			procesarOpcion(opcion);
		} while(!"0".equals(opcion));
		
		//CON CAPA DE ACCESO A DATOS
		CrudAble<Usuario> usuarios = new UsuarioDaoArrayList();
		
		for(Usuario usuario: usuarios.getAll()) {
			System.out.println(usuario);
		}
		
		System.out.println(usuarios.getById(1L));
		
//		usuarios.insert(pedirUsuario());
		usuarios.insert(new Usuario(3L, "paco@paco", "contra"));
		usuarios.update(new Usuario(3L, "paco@paco", "contracambiada"));
		usuarios.delete(2L);
		
//		Usuario usuario = pedirUsuario();
//		
//		System.out.println(usuario);

	}

//	METODOS
	
	private static void procesarOpcion(String opcion) {
		switch(opcion) {
		case "0" : System.out.println("Salir");
		case "1" : listado(); break;
		case "2" : alta(); break;
		// TODO: Otras opciones
		default : System.out.println("No existe esa opcion");
		
		}
	}

	private static void mostrarMenu() {
		System.out.println("LIBROS");
		System.out.println("----------");
		System.out.println("1. LISTADO");
		System.out.println("2. ALTA");
		// TODO: Resto de opciones
		System.out.println("0. SALIR");
	}

	private static void listado() {
		for(Usuario usuario : users) {
			System.out.println(usuario);
		}
		
	}

//	private static void modificacion() {
//		System.out.println("Modificacion");
//		
//	}

	private static void alta() {
		System.out.println("Alta");
		users.add(pedirUsuario());
		
		
	}

	private static Usuario pedirUsuario() {
		Usuario usuario = new Usuario();
		
		
		usuario.setId(Consola.leerLong());
		
		boolean errorEmail;
		do {
			errorEmail = false;
		
		try {
			usuario.setEmail(Consola.leerLinea());
		} catch (Exception e) {
			errorEmail=true;
			System.out.println(e.getMessage());
		}
		}while(errorEmail);
		
		usuario.setPassword(Consola.leerLinea());
		
		
		return usuario;
	}

}
