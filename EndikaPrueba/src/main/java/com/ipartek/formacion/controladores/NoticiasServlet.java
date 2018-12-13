package com.ipartek.formacion.controladores;

import java.io.IOException;
import java.util.HashMap;
import java.util.TreeMap;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.formacion.pojos.Noticia;


@WebServlet("/noticias")
public class NoticiasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Las variables de tipo application se comparten para todos los usuarios
				//de este contexto (aplicación)
				ServletContext application = request.getServletContext();
				
				@SuppressWarnings("unchecked")
				TreeMap<Long, Noticia> noticias = (TreeMap<Long, Noticia>) application.getAttribute("noticias");

				if (noticias == null) {
					noticias = new TreeMap<Long,Noticia>();

					noticias.put(1L, new Noticia(1L, "sfsdfdsf","21/2/10", "sfadf", "sdsads"));
					noticias.put(2L, new Noticia(2L, "sfsdfdfdfdsds","23/2/10", "sfdfdfadf", "sdsadfdsfds"));

					application.setAttribute("noticias", noticias);
				}
				
				request.getRequestDispatcher("indexnot.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
