<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ejemplo JSP</title>
</head>
<body>
¡Holaaaaaaa!

<%-- Scriptlets --%>

<% for(int i=0;i<=6;i++){ %>
	<h<%=i %>> Titulo <%=i%></h<%=i %>>
<% } %>


<%= new java.util.Date() %>
</body>
</html>