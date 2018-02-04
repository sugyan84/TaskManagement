<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Registration</title>

<style type="text/css">
table {
	border: 1px solid black;
}

td {
	padding: 12px;
	align-content: center;
}

tr:nth-child(even) {
	background-color: #d9ffb3;
}

tr:nth-child(odd) {
	background-color: #fff2e6;
}

.headingString {
	color: #0066ff;
	font-family: "Bookman", monospace;
}

.tableFormHead {
	align-content: center;
}

body {
	background-color: teal;
}

.textSizeTableHeader {
	font-size: 50px;
}

.textSizeTableFormHead{

}

</style>
</head>
<body>

	<form:form action="addUser" modelAttribute="registrationForm">

		<table border="1" align="center" bordercolor="green">

			<th bgcolor="#ff6666" colspan="2" height="80px" class="textSizeTableHeader"><b
				class="headingString">Register</b></th>
			<tr>
				<td>Username:</td>
				<td><br> <form:input path="loginId" /><br> <br></td>
			</tr>

			<tr>
				<td>First Name:</td>
				<td><br> <form:input path="firstName" /><br> <br></td>
			</tr>


			<tr>
				<td>Last Name:</td>
				<td><br> <form:input path="lastName" /><br> <br></td>
			</tr>

			<tr>
				<td>Create Password:</td>
				<td><br> <form:input path="password" /><br> <br></td>
			</tr>
<%-- 

			<tr>
				<td>Re-enter Password:</td>
				<td><br> <form:input path="password" /><br> <br></td>
			</tr> --%>

			<tr>
				<td align="center" colspan="2"><br> <input type="submit"
					value="Register" /><br> <br></td>
			</tr>
		</table>

	</form:form>

	<br>
	<br>



</body>
</html>