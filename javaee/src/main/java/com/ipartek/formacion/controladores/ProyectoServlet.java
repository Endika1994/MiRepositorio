package com.ipartek.formacion.controladores;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.formacion.pojos.Proyecto;



public class ProyectoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tituloh2 = request.getParameter("tituloh2");
		String imagen = request.getParameter("imagen");
		String descripcion = request.getParameter("descripcion");
		String linkimg = request.getParameter("linkimg");
		
		Proyecto proyecto;
		
		ArrayList <Proyecto> proyectos = new ArrayList<Proyecto>();
		
		proyectos.add(new Proyecto("Proyecto1","media/proyecto-1.jpg", "Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas."
				+ " Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas semper.", "Leer Mas"));
		
		proyectos.add(new Proyecto("Proyecto2","media/proyecto-2.jpg", "Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas."
				+  "Donec eu libero sit amet quam egestas semper.", "Leer Mas"));
		
		proyectos.add(new Proyecto("Proyecto3","media/proyecto-3.jpg", "Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas."
				+ " Vestibulum tortor quam, feugiat vitae, ultricies eget.", "Leer Mas"));
		
		request.setAttribute("proyectos", proyectos);
		request.getRequestDispatcher("indexproy.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
