

public class Usuario {
	
	private Long id;
	private String email,password;
	
	public Usuario(Long id, String email, String password) {
		setId(id);
		setEmail(email);
		setPassword(password);
	}

	public Usuario() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if(email == null || email.trim().length() == 0) {
			throw new PojoException("No se admiten emails vacios o nulos");
		}
		
		if(!email.matches("\\w+@\\w+\\.\\w+")){
			throw new PojoException("El formato del email no es el correcto");
		}
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", email=" + email + ", password=" + password + "]";
	}
	
	
	

}
