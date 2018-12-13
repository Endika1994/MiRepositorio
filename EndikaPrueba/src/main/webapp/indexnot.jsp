<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<section>
    <h2>Últimas noticias</h2>
    
    
    <c:forEach items="${noticias.values()}" var="noticia">
    <article>
        <header>
            <h3>${noticia.titular}</h3>
        </header>
       
        <footer>
             Publicado el
             <p>${noticia.fecha} </p>
             por ${noticia.autor} 
        </footer>
        
        <p>${noticia.texto}</p>
        
        <p>
        	<a href="#">leer más</a>
        	<a href="formularionoticias?accion=editar&id=${noticia.id}">Editar</a>
        	<a href="formularionoticias?accion=borrar&id=${noticia.id}">Borrar</a>
        </p>
      
        
    </article>
    </c:forEach>
     <p>
    	<a href="formularionoticias?accion=insertar">Añadir</a>
    </p>
   
   
  <a href ="login.jsp"> <button>Login</button></a>
</section>