<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action ="login" method="post">
		<fieldset>
			<legend>Login</legend>
			
			<p>
				<label for ="email">Email</label>
				<input type="email" name="email" id ="email"/>
			</p>
			
			<p>
				<label for ="password">Password</label>
				<input type="password" name="password" id ="password"/>
			</p>
			
			<p>
				<button>Login</button>
			</p>
		</fieldset>
		
	</form>
</body>
</html>