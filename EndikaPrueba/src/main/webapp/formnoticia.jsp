<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>



<form action="formularionoticias" method="post">
	<fieldset>
		<legend>Noticia (${accion})</legend>
		
		<input type="hidden" name="accion" value="${accion}" />
		
		<input type="hidden" name="id" id="id" value="${noticia.id}" />

		<p>
			<label for="titulo">Título</label>
			<input type="text" name="titular" id="titular" value="${noticia.titular}" />
		</p>
		<p>
			<label for="fecha">Fecha</label>
			<input type="text" name="fecha" id="fecha" value="${noticia.fecha}" />
		</p>
		<p>
			<label for="autor">Autor</label>
			<input type="text" name="autor" id="autor" value="${noticia.autor}" />
		</p>
		<p>
			<label for="texto">Texto</label>
			<textarea name="texto" id="" cols="80" rows="10">${noticia.texto}</textarea>
		</p>
		<p>
			<button>Aceptar</button>
		</p>
	</fieldset>
</form>