package accesodatos;

import java.util.ArrayList;
import java.util.List;

import pojos.Usuario;

public class UsuarioDaoArrayList implements CrudAble<Usuario> {
	
	private ArrayList<Usuario> usuarios = new ArrayList<>();
	
	
public UsuarioDaoArrayList() {
	usuarios.add(new Usuario(1L, "", ""));
	usuarios.add(new Usuario(2L, "", ""));
}
	@Override
	public List<Usuario> getAll() {
		return usuarios;
	}

	@Override
	public Usuario getById(Long id) {
		for(Usuario usuario:usuarios) {
			if(usuario.getId() == id) {
				return usuario;
			}
		}
		return null;
	}

	@Override
	public void insert(Usuario usuario) {
		if(usuario == null) {
			throw new AccesoDatosException("No se admite usuarios nulos");
		}
		usuarios.add(usuario);
	}

	@Override
	public void update(Usuario usuario) {
		int posicionId = -1;
		for(int i=0; i<usuarios.size(); i++) {
			if(usuarios.get(i).getId() == usuario.getId()) {
				posicionId = i;
			}
			else if(usuarios.get(i).getEmail().equals(usuario.getEmail())) {
				throw new AccesoDatosException("Usuario no encontrado para modificar");
			}
				
		}
		
		if(posicionId == -1) {
			throw new AccesoDatosException("Usuario no encontrado para modificar");
		}
		
		
		usuarios.set(posicionId, usuario);
	}

	@Override
	public void delete(Long id){
		for(int i=0; i<usuarios.size();i++) {
			if(usuarios.get(i).getId() == id) {
				usuarios.remove(i);
				return;
			}
		}
		throw new AccesoDatosException("No existe ese id");
	}

}
