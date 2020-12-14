<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome  <%=request.getParameter("email") %>></h1>
<ul>
                <li><a href="uploadArt.jsp">Upload Arts</a></li>
                <li><a href="deliverymanLogin.jsp">Sign In as Delivery Man</a></li>
          
            </ul>

</body>
</html>