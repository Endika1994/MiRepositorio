package poo;

public class Usuario {
	
//	CONSTANTES
	protected static final String FORMATO_CORCHETES = "corchetes";
	protected static final String FORMATO_COMA = "coma";

	protected static final String EMAIL_POR_DEFECTO = "daljsdsa@sjdsk";
	protected static final String PASS_POR_DEFECTO = "";
	
//	Variables de instancia
	private String email, pass;
	
//	Constructores
	public  Usuario(String email, String pass) {
		setEmail(email);
		setPass(pass);
		System.out.println("Se ha creado un usuario");
	}
	
	public Usuario(String email) {
		this(email, PASS_POR_DEFECTO);
	}
	
	public Usuario() {
		this(EMAIL_POR_DEFECTO, PASS_POR_DEFECTO);
	}
	
//	Metodos de acceso (getters and setters)
	public void setEmail(String email) {
		if(email.indexOf('@') == -1) {
			throw new RuntimeException("No se admiten emails sin @");
		}
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
//	Metodos
	public void cambiarPass(String pass) {
		if(this.pass.equals(pass)) {
			throw new RuntimeException("No has cambiado la pass");
		}
		setPass(pass);
	}
	
	public String datosCompletos() {
		return email + ", " + pass;
	}
	
//	Metodo sobrecargado
	
	public String datosCompletos(String formato) {
		switch(formato) {
		case "coma": return datosCompletos();
		case "corchetes": return "[email: " +email +", pass" +pass +"]";
		default: throw new RuntimeException("Formato no reconocido");
		}
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((pass == null) ? 0 : pass.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (pass == null) {
			if (other.pass != null)
				return false;
		} else if (!pass.equals(other.pass))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Usuario [email=" + email + ", password=" + pass + "]";
	}


}
