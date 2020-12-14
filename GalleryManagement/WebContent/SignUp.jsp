<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <ul>
                <li><a href="deliverymanLogin.jsp">Sign in as a Deliveryman</a></li>
            </ul>

<form action="userSignUp" method="post">
<table border="1">
<tr> 
<td> enter email<td>
<td><input type="email" name="email" /></td>
</tr>
<tr> 
<td> enter password<td>
<td><input type="password" name="password" /></td>
</tr>
<tr> 
<td> enter address<td>
<td><input type="text" name="address" /></td>
</tr>
<tr> 
<td> enter gender<td>
<td><input type="text" name="gender" /></td>
</tr>
<tr> 
<td><input type="submit" /></td>
</tr>
</table>
</form>
</body>
</html>