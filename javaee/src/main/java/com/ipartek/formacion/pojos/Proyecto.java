package com.ipartek.formacion.pojos;

public class Proyecto {
	private String tituloh2;
	private String imagen;
	private String descripcion;
	private String linkimg;
	
	
	public Proyecto (String tituloh2, String imagen, String descripcion, String linkimg) {
		setTituloh2(tituloh2);
		setImagen(imagen);
		setDescripcion(descripcion);
		setLinkimg(linkimg);
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTituloh2() {
		return tituloh2;
	}

	public void setTituloh2(String tituloh2) {
		this.tituloh2 = tituloh2;
	}

	public String getLinkimg() {
		return linkimg;
	}

	public void setLinkimg(String linkimg) {
		this.linkimg = linkimg;
	}

	@Override
	public String toString() {
		return "Proyecto [tituloh2=" + tituloh2 + ", imagen=" + imagen + ", descripcion="
				+ descripcion + ", linkimg=" + linkimg + "]";
	}
}
