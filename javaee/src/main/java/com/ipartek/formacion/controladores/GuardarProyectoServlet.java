package com.ipartek.formacion.controladores;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.formacion.pojos.Proyecto;


public class GuardarProyectoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Recoger informacion
		String tituloh2 = request.getParameter("tituloh2");
		String imagen = request.getParameter("imagen");
		String descripcion = request.getParameter("descripcion");
		String linkimg = request.getParameter("linkimg");
		
		@SuppressWarnings("unchecked")
		ArrayList<Proyecto> proyectos = (ArrayList<Proyecto>) request.getServletContext().getAttribute("proyectos");
		
		//Empaquetarla en un paquete
		
		Proyecto proyecto = new Proyecto(tituloh2,imagen,descripcion, linkimg);
		proyectos.add(proyecto);
		
		request.getRequestDispatcher("/").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
