<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="fileUploadServlet" method="post" enctype="multipart/form-data">
            <table width="400px" align="center" border="1">
                <tr>
                    <td align="center" colspan="2">Form Details</td>
                </tr>
                <tr>
                    <td>Art Name </td>
                    <td><input type="text" name="name" /></td>
                </tr>
                <tr>
                    <td>Name of the artist </td>
                    <td>
                        <input type="text" name="artist">
                    </td>
                </tr>
                <tr>
                    <td>Price</td>
                    <td>
                        <input type="number" name="price">
                    </td>
                </tr>
                <tr>
                    <td>Image Link: </td>
                    <td>
                        <input type="file" name="file">
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Submit" size="50"/></td>
                </tr>
            </table>

        </form><br>
</body>
</html>