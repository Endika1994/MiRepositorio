package ejerBiblioteca;

import biblioteca.Consola;


public class PresentacionLibro {

	public static void main(String[] args) {
		CrudAbleLibros<Libro> libros = new LibrosDaoArrayList();
		
//		Mostramos todos los libros que hay
		for(Libro libro : libros.getAll()) {
			System.out.println(libro);
		}
		
		System.out.println(libros.getById(1L));
		
		
		

	}

	private static Libro pedirLibro() {
		Libro libro = new Libro();
		
		
		libro.setId(Consola.leerLong());
		
		libro.setTitulo(Consola.leerLinea());
		
		libro.setEditorial(Consola.leerLinea());
		
		boolean errorIsbn;
		do {
			errorIsbn = false;
		
		try {
			libro.setIsbn(Consola.leerLinea());
		} catch (Exception e) {
			errorIsbn=true;
			System.out.println(e.getMessage());
		}
		}while(errorIsbn);
		
		libro.setPrecio(Consola.leerLinea());
		
		return libro;
	}

}
