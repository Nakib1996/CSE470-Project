package com.gm.model;

import java.sql.SQLException;

public class Login {
public boolean validateuser(String email,String password)
{
String sql="select * from user Where email=? and password=?";
GetConnection gc=new GetConnection();

try {
	gc.ps1=GetConnection.getMySQLConnection().prepareStatement(sql);
	
	gc.ps1.setString(1, email);
	gc.ps1.setString(2, password);
	
	gc.rs1=gc.ps1.executeQuery();
	
	return gc.rs1.next();
} catch (SQLException e) {
	e.printStackTrace();
}

return false;

}
public boolean managervalidate(String email,String password)
{
String sql="select * from admin Where email=? and password=?";
GetConnection gc=new GetConnection();

try {
	gc.ps1=GetConnection.getMySQLConnection().prepareStatement(sql);
	
	gc.ps1.setString(1, email);
	gc.ps1.setString(2, password);
	
	gc.rs1=gc.ps1.executeQuery();
	
	return gc.rs1.next();
} catch (SQLException e) {
	e.printStackTrace();
}

return false;

}
public boolean deliveryvalidate(String email,String password)
{
String sql="select * from deliveryman Where email=? and password=?";
GetConnection gc=new GetConnection();

try {
	gc.ps1=GetConnection.getMySQLConnection().prepareStatement(sql);
	
	gc.ps1.setString(1, email);
	gc.ps1.setString(2, password);
	
	gc.rs1=gc.ps1.executeQuery();
	
	return gc.rs1.next();
} catch (SQLException e) {
	e.printStackTrace();
}

return false;

}

}
