package com.ipartek.formacion.pojos;

import java.util.Date;

public class Noticia {
	private Long id;
	private String titular;
	private Date fecha;
	private String autor;
	private String texto;
	
	private String errorId;
	private String errorTitular;
	private String errorFecha;
	private String errorAutor;
	private String errorTexto;
	
	private boolean hayErrores = false;
	
	
	public Noticia(Long id, String titular, Date fecha, String autor, String texto) {
		super();
		setId(id);
		setTitular(titular);
		setFecha(fecha);
		setAutor(autor);
		setTexto(texto);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		if(id<= 0) {
			//throw new PojoException("No se admiten valores de id menores que 0");
			setErrorId("El id debe valer mas que 0");
		}
		this.id = id;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		if(titular.trim().length() == 0) {
			setErrorTitular("No se admiten titulares vacios");
		}
		this.titular = titular;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		
		if(fecha == null) {
			this.fecha = new Date();
		}else if(fecha.after(new Date())) {
			setErrorFecha("No se admiten fechas futuras");
		}
		this.fecha = fecha;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		if(autor == null || autor.trim().length() == 0) {
			setErrorAutor("No se admiten autores nulos");
		}
		this.autor = autor;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		
		//\w+\.\w+.\w+.
		if(!texto.matches("\\w+\\.\\w+.\\w+.")){
			
		}
		this.texto = texto;
	}

	public String getErrorId() {
		return errorId;
	}

	public void setErrorId(String errorId) {
		hayErrores = true;
		this.errorId = errorId;
	}

	public String getErrorTitular() {
		return errorTitular;
	}

	public void setErrorTitular(String errorTitular) {
		hayErrores = true;
		this.errorTitular = errorTitular;
	}

	public String getErrorFecha() {
		return errorFecha;
	}

	public void setErrorFecha(String errorFecha) {
		hayErrores = true;
		this.errorFecha = errorFecha;
	}

	public String getErrorAutor() {
		return errorAutor;
	}

	public void setErrorAutor(String errorAutor) {
		hayErrores = true;
		this.errorAutor = errorAutor;
	}

	public String getErrorTexto() {
		return errorTexto;
	}

	public void setErrorTexto(String errorTexto) {
		hayErrores = true;
		this.errorTexto = errorTexto;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autor == null) ? 0 : autor.hashCode());
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((texto == null) ? 0 : texto.hashCode());
		result = prime * result + ((titular == null) ? 0 : titular.hashCode());
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
		Noticia other = (Noticia) obj;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (texto == null) {
			if (other.texto != null)
				return false;
		} else if (!texto.equals(other.texto))
			return false;
		if (titular == null) {
			if (other.titular != null)
				return false;
		} else if (!titular.equals(other.titular))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Noticia [id=" + id + ", titular=" + titular + ", fecha=" + fecha + ", autor=" + autor + ", texto="
				+ texto + "]";
	}
}