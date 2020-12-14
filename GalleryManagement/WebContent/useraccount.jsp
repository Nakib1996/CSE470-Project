<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome  <%=request.getParameter("email") %></h1>
<h2>See you pending Deliveries</h2>
<li><a href="pendingDeliveryCustomer.jsp">Sign In as customer</a></li>
</body>
</html>