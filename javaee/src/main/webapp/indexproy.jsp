<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "com.ipartek.formacion.pojos.Proyecto, java.util.ArrayList"%>
    
 <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

 
 <%
 Object objeto = session.getAttribute("proyecto");
 Proyecto proyecto = (Proyecto)objeto;
 
 Object oProyectos = request.getAttribute("proyectos");
 ArrayList<Proyecto> proyectos = (ArrayList<Proyecto>) oProyectos;
 %>  
  
<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="UTF-8">
	<meta name="generator" content="Notepad++">
	<title>Práctica Estructura y CSS</title>
</head>

	
<body>
	
    
<header>
    <h1>
        <a href="index.html">
            <img src="media/logo.jpg" alt="Logo">
        </a>
    </h1>   
    
    <nav>
        <ul>
            <li><a href="#">Quiénes somos</a></li>
            <li><a href="#">Servicios</a></li>
            <li><a href="#">Proyectos</a></li>
            <li><a href="#">Blog</a></li>
            <li><a href="#">Contacto</a></li>
        </ul>
    </nav>
    
    <ul>
        <li>
            <a href="http://www.facebook.com">
                <img src="media/logo-facebook.gif" alt="Facebook">
            </a>
        </li>
        <li>
            <a href="http://www.twitter.com">
                <img src="media/logo-twitter.gif" alt="Twitter">
            </a>
        </li>
    </ul>
</header> 
    
    
    
<aside>
 
    <p><img src="media/banner.jpg" alt=""></p>  
    
</aside>
    
    
    
<section>
    
    <h2>Últimos Proyectos</h2>
    	<%for(Proyecto p : proyectos) { %>
		
	<article>
       
        <p><%= p.getImagen() %></p>
        
        <header>
            <h3><%= p.getTituloh2() %></h3>
        </header>
        
        <p><%= p.getDescripcion() %></p>
        
        <p><%= p.getLinkimg() %></p>
       
     
    </article>
    <% } %>
</section>   
    
    
    
    
<section>
    <h2>Últimas noticias</h2>
    
    <article>
        <header>
            <h3>Noticia 1</h3>
        </header>
       
        <footer>
             Publicado el <time datetime="2017-01-23">23.01.17</time> por Jane Doe 
        </footer>
    
       <p><img src="media/noticia-1.jpg" alt=""></p>
        
        <p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas semper. Aenean ultricies mi vitae est. Mauris placerat eleifend leo.</p>
        
        <p><a href="#">leer más</a></p>
        
    </article>
    
    <article>
        <header>
            <h3>Noticia 2</h3>
        </header>
       
        <footer>
             Publicado el <time datetime="2017-01-22">22.01.17</time> por John Doe 
        </footer>
    
       <p><img src="media/noticia-2.jpg" alt=""></p>
        
        <p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas semper. Aenean ultricies mi vitae est. Mauris placerat eleifend leo.</p>
        
        <p><a href="#">leer más</a></p>
        
    </article>
    
    <article>
        <header>
            <h3>Noticia 3</h3>
        </header>
       
        <footer>
             Publicado el <time datetime="2017-01-21">21.01.17</time> por Jane Doe 
        </footer>
    
       <p><img src="media/noticia-3.jpg" alt=""></p>
        
        <p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas semper. Aenean ultricies mi vitae est. Mauris placerat eleifend leo.</p>
        
        <p><a href="#">leer más</a></p>
        
    </article>
    
</section>    
    
	
    
     
<section>
    <h2>Información útil</h2>
    
    <dl>
        <dt>Horario</dt>
        <dd>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.</dd>
        
        <dt>Gastos de envío</dt>
        <dd>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.</dd>
        
        <dt>Chat</dt>
        <dd>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac <a href="">eges</a> tas.</dd>
        
        <dt>Devoluciones</dt>
        <dd>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.</dd>
        
    </dl>
    
</section>    
    
    
    
    
    
    
<footer>
    <nav>
        <ul>
            <li><a href="#">Quiénes somos</a></li>
            <li><a href="#">Servicios</a></li>
            <li><a href="#">Proyectos</a></li>
            <li><a href="#">Blog</a></li>
            <li><a href="#">Contacto</a></li>
        </ul>
    </nav>
    
    <ul>
        <li><a href="#">Aviso Legal</a></li>
        <li><a href="#">Privacidad</a></li>
        <li><a href="#">Cookies</a></li>
    </ul>
    
    <p>Copyright 2018</p>
    
</footer>
    
</body>
</html>