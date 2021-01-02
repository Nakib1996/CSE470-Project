package com.gm.TestCode;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import org.mockito.InjectMocks;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import com.gm.model.Login;
import com.gm.model.GetConnection;

public class LoginTest {
	@InjectMocks private GetConnection conn;

    @Mock
    private PreparedStatement stmt;

    @Mock
    private ResultSet rs;
    private Login L;
    String sql="select * from user Where email=? and password=?";
    @Before
    public void setUp() throws Exception {
    	MockitoAnnotations.initMocks(this);
         L= new Login();
    
    }
    
    @Test
    public void Testvalidateuser() throws Exception {
        when(conn.getMySQLConnection().prepareStatement(sql)).thenReturn(stmt);
        when(stmt.executeQuery()).thenReturn(rs);
    	
    assertEquals(true,	L.validateuser("hidden","secret")) ;
  
    }

}