package ejerBiblioteca;

public class Libro {

	private Long id;
	private String titulo, editorial, isbn, precio;
	
	
	
	public Libro(Long id, String titulo, String editorial, String isbn, String precio) {
		this.id = id;
		this.titulo = titulo;
		this.editorial = editorial;
		this.isbn = isbn;
		this.precio = precio;
	}


	public Libro() {
		
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getEditorial() {
		return editorial;
	}


	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}


	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	public String getPrecio() {
		return precio;
	}


	public void setPrecio(String precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "Libro [id=" + id + ", titulo=" + titulo + ", editorial=" + editorial + ", isbn=" + isbn + ", precio="
				+ precio + "]";
	}
	
	
}
