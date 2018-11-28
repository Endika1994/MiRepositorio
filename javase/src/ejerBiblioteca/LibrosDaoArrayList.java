package ejerBiblioteca;

import java.util.ArrayList;
import java.util.List;





public class LibrosDaoArrayList implements CrudAbleLibros<Libro> {
	
	private ArrayList<Libro> libros = new ArrayList<>();
	
	@Override
	public List<Libro> getAll() {
		return libros;
	}
	
	@Override
	public Libro getById(Long id) {
		for(Libro libro:libros) {
			if(libro.getId() == id) {
				return libro;
			}
		}
		return null;
	}
	
	@Override
	public Libro getByIsbn(String isbn) {
		for(Libro libro:libros) {
			if(libro.getIsbn() == isbn) {
				return libro;
			}
		}
		return null;
	}
	
	@Override
	public void insert(Libro libro) {
		if(libro == null) {
			throw new AccesoDatosLibrosException("No se admite usuarios nulos");
		}
		libros.add(libro);
	}
	
	@Override
	public void update(Libro libro) {
		int posicionId = -1;
		for(int i=0; i<libros.size(); i++) {
			if(libros.get(i).getId() == libro.getId()) {
				posicionId = i;
			}
			else if(libros.get(i).getIsbn().equals(libro.getIsbn())) {
				throw new AccesoDatosLibrosException("Libro no encontrado para modificar");
			}
				
		}
		
		if(posicionId == -1) {
			throw new AccesoDatosLibrosException("Libro no encontrado para modificar");
		}
		
		
		libros.set(posicionId, libro);
	}
	
	@Override
	public void delete(Long id){
		for(int i=0; i<libros.size();i++) {
			if(libros.get(i).getId() == id) {
				libros.remove(i);
				return;
			}
		}
		throw new AccesoDatosLibrosException("No existe ese id");
	}

	@Override
	public Libro getByIsbn(Long isbn) {
		// TODO Auto-generated method stub
		return null;
	}
}
