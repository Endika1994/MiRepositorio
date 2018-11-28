package presentacion;

import accesodatos.CrudAble;
import accesodatos.UsuarioDaoArrayList;
import biblioteca.Consola;
import pojos.Usuario;

public class PresentacionConsola {

	public static void main(String[] args) {
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
