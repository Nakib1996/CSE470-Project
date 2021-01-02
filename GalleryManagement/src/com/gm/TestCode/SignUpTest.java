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

import com.gm.model.SignUp;
import com.gm.model.GetConnection;

public class SignUpTest {
	@InjectMocks private Connection conn;

    @Mock
    private PreparedStatement stmt;

    @Mock
    private ResultSet rs;
    private SignUp L;
    
    @Before
    public void setUp() throws Exception {
    	MockitoAnnotations.initMocks(this);
        Mockito.mock(GetConnection.class);
         L= new SignUp();
    
    }
    
    @Test
    public void TestSigning() throws Exception {
    	when(GetConnection.getMySQLConnection()).thenReturn(conn);
        when(conn.prepareStatement(any(String.class))).thenReturn(stmt);
        when(stmt.executeQuery()).thenReturn(rs);
    	
    assertEquals(true,	L.Signing("hidden","secret","secret","secret")) ;
  
    }

}