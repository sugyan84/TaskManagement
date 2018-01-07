<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>

	<form:form action="addUser" modelAttribute="registrationForm">

		<table border="1" align="center" bordercolor="green">
			<tr>
			<td align="center"><br>
				Username:
				<form:input path="username" /><br><br>
				</td>
			</tr>
			
			<tr>
			<td align="center"><br>
				First Name:
				<form:input path="firstName" /><br><br>
				</td>
			</tr>
			
			
			<tr>
			<td align="center"><br>
				Last Name:
				<form:input path="lastName" /><br><br>
				</td>
			</tr>
			
			<tr>
			<td align="center"><br>
				Create Password:
				<form:input path="password" /><br><br>
				</td>
			</tr>
			
			
			<tr>
			<td align="center"><br>
			Re-enter Password:
			<form:input path="password" /><br><br>
			</td>
			</tr>

			<tr>
			<td align="center"><br>
			<input type="submit" value="Register" /><br><br>
			</td>
			</tr>
		</table>

	</form:form>

	<br>
	<br>



</body>
</html>