<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Dear <%=request.getParameter("email") %> <%=request.getParameter("password") %>,</h1>
<h1> You have used wrong credentials to login.</h1>
<h1> Thank you</h1>
 <ul>
                <li><a href="loginForm.jsp">Sign In as customer</a></li>
                <li><a href="deliverymanLogin.jsp">Sign In as Delivery Man</a></li>
            </ul>
</body>
</html>