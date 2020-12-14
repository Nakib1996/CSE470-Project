<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page trimDirectiveWhitespaces="true" %>
<%@ page import="java.sql.*"%>
<%@ page import="java.io.*"%>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="com.gm.model.art"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border=1>
<tr>
<td>ID</td><td>NAME</td><td>ARTIST</td><td>PRICE</td><td>CUSTOMER</td><td>DELIVERY ADDRESS</td><td>STATUS</td></tr>


</tr>



<%
ResultSet rs = rs=new art().display();	
while(rs.next())
{

out.println("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(7)+"</td><td>"+rs.getString(5)+"</td><td>"+rs.getString(6)+"</td><td>"+rs.getString(8)+"</td></tr>");
}
%>



</table>





</body>
</html>