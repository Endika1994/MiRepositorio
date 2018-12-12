<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Nuevo proyecto</title>
</head>
<body>
<h1>Nuevo proyecto</h1>

<form action="guardarproyecto">
	<fieldset>
		<legend>Nuevo proyecto</legend>
		<p>
			<label for="tituloh2">Tituloh2</label>
			<input type="text" name="tituloh2" id="tituloh2" />
		</p>
		<p>
			<label for="imagen">Imagen</label>
			<input name="imagen" id="imagen" />
		</p>
		<p>
			<label for="descripcion">Descripción</label>
			<textarea name="descripcion" id="descripcion" cols="30" rows="10"></textarea>
		</p>
		<p>
			<label for="linkimg">Link de la imagen</label>
			<textarea name="linkimg" id="linkimg" cols="30" rows="10"></textarea>
		</p>
		<p>
			<button>Guardar cambios</button>
		</p>
	</fieldset>
</form>

</body>
</html>