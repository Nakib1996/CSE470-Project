package com.gm.model;

import java.io.InputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
public class art {
public boolean upload(String name,String artist,InputStream image,int price)
{
String sql="insert into paintings (p_name,p_artist,p_image,p_price,status) values (?,?,?,?,'on sale')";
GetConnection gc=new GetConnection();

try {
	gc.ps2=GetConnection.getMySQLConnection().prepareStatement(sql);
	
	gc.ps2.setString(1, name);
	gc.ps2.setString(2, artist);
	gc.ps2.setBlob(3, image);
	gc.ps2.setInt(4, price);
	
	
	
	
	gc.rs2=gc.ps2.execute();
	
	return gc.rs2;
} catch (SQLException e) {
	e.printStackTrace();
}

return false;

}
public ResultSet display()
{
String sql="select * from paintings";
GetConnection gc=new GetConnection();

try {
	gc.ps2=GetConnection.getMySQLConnection().prepareStatement(sql);
	gc.rs1=gc.ps2.executeQuery();
	
	return gc.rs1;
	
	
} catch (SQLException e) {
	e.printStackTrace();
}

return null;

}


}