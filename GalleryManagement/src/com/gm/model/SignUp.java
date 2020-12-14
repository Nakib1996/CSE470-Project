package com.gm.model;

import java.sql.SQLException;

public class SignUp {
public boolean Signing(String email,String password,String address,String gender)
{
String sql="insert into user (email,password,address,gender) values (?,?,?,?)";
String sql2="Select * from user where email=?";

GetConnection gc=new GetConnection();

try {
    
	gc.ps2=GetConnection.getMySQLConnection().prepareStatement(sql2);
	gc.ps2.setString(1, email);
	gc.rs2=gc.ps2.execute();
	if(!(gc.rs2))
	{
	gc.ps1=GetConnection.getMySQLConnection().prepareStatement(sql);
	
	gc.ps1.setString(1, email);
	gc.ps1.setString(2, password);
	gc.ps1.setString(3,address);
	gc.ps1.setString(4,address);
	
	gc.rs1=gc.ps1.executeQuery();
	
	return gc.rs1.next();
}} catch (SQLException e) {
	e.printStackTrace();
}

return false;

}}