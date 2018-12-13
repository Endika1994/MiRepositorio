package com.ipartek.formacion.controladores;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.formacion.pojos.PojoException;
import com.ipartek.formacion.pojos.Usuario;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		Usuario usuario;
		
		try {
			usuario = new Usuario(null, email, password);
		} catch(PojoException e) {
			//response.sendRedirect("login.jsp");
			if(email != null && password != null) {
				request.setAttribute("error", "Error en el formato de email o contraseña");
			}
			
			request.getRequestDispatcher("login.jsp").forward(request, response);
			
			return;
		}
		
		if("endika@vazquez.com".equals(usuario.getEmail()) && "Pa$$w0rd".equals(usuario.getPassword())) {
			ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
			
			usuarios.add(new Usuario(1L, "endika@vazquez.com", "Pa$$w0rd"));
			usuarios.add(new Usuario(2L, "pepe@perez.com", "Pa$$w0rd"));
			
			request.setAttribute("usuarios", usuarios);
			
			request.getSession().setAttribute("usuario", usuario);
			
			request.getRequestDispatcher("indexnot.jsp").forward(request, response);
		} else {
			//response.sendRedirect("login.jsp");
			request.setAttribute("error", "No tienes permiso para login");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

}