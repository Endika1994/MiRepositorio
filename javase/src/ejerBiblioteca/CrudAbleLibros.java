package ejerBiblioteca;

import java.util.List;

public interface CrudAbleLibros<PojLib> {
	public default List<PojLib> getAll(){
		throw new RuntimeException("ERROR");
	}
	public default PojLib getById(Long id) {
		throw new RuntimeException("ERROR");
	}
	public default PojLib getByIsbn(String isbn) {
		throw new RuntimeException("ERROR");
	}
	public default void insert(PojLib pojlib) {
		throw new RuntimeException("ERROR");
	}
	public default void update(PojLib pojlib) {
		throw new RuntimeException("ERROR");
	}
	public default void delete(Long id) {
		throw new RuntimeException("ERROR");
	}
	Libro getByIsbn(Long isbn);
	
}
