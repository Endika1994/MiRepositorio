package accesodatos;

import java.util.List;

public interface CrudAble<Pojo> {
	public default List<Pojo> getAll(){
		throw new RuntimeException("ERROR");
	}
	public default Pojo getById(Long id) {
		throw new RuntimeException("ERROR");
	}
	public default void insert(Pojo pojo) {
		throw new RuntimeException("ERROR");
	}
	public default void update(Pojo pojo) {
		throw new RuntimeException("ERROR");
	}
	public default void delete(Long id) {
		throw new RuntimeException("ERROR");
	}
}
