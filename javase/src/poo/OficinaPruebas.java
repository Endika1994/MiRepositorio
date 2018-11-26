package poo;

public class OficinaPruebas {

	public static void main(String[] args) {
		
		Oficina oficina = new Oficina("Ipartek");
		
		Usuario usuario1 = new Usuario("dasjdajsk@LDSJ", "contra");
		
		oficina.nuevoUsuario(usuario1);
		
//		FORMA MAS RAPIDA DE AÑADIR USUARIOS A LA OFICINA
		//o.nuevoUsuario(new Usuario());
		
		for(Usuario usuario : oficina.getUsuarios() ) {
//			System.out.println(usuario.datosCompletos("corchetes"));
			System.out.println(usuario.getEmail());
		}
		
	}

}
