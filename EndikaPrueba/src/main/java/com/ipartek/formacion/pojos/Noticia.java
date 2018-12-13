package com.ipartek.formacion.pojos;

import java.util.Date;

public class Noticia {
	private Long id;
	private String titular;
	private String fecha;
	private String autor;
	private String texto;
	
	public Noticia(Long id, String titular, String fecha, String autor, String texto) {
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
		this.id = id;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha2) {
		this.fecha = fecha2;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	@Override
	public String toString() {
		return "Noticia [id=" + id + ", titular=" + titular + ", fecha=" + fecha + ", autor=" + autor + ", texto="
				+ texto + "]";
	}
	
}
