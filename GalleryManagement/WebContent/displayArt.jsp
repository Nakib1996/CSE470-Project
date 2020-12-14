<%@ page trimDirectiveWhitespaces="true" %>
<%@ page import="java.sql.*"%>
<%@ page import="java.io.*"%>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="com.gm.model.art"%>

<%
Blob image = null;
byte[ ] imgData = null ;
ResultSet rs = rs=new art().display();	
try{
while(rs.next())
{
image = rs.getBlob(4);
imgData = image.getBytes(1,(int)image.length());
// display the image
response.setContentType("image/jpg");
OutputStream o = response.getOutputStream();
o.write(imgData);
o.flush();
o.close();
}} catch (Exception e) {
out.println("Unable To Display image");
out.println("Image Display Error=" + e.getMessage());
return;
}
%>