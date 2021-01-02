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

import com.gm.model.art;
import com.gm.model.GetConnection;

public class artTest {
	@InjectMocks private Connection conn;

    @Mock
    private PreparedStatement stmt;

    @Mock
    private ResultSet rs;
    private art L;
    
    @Before
    public void setUp() throws Exception {
    	MockitoAnnotations.initMocks(this);
        Mockito.mock(GetConnection.class);
         L= new art();
    
    }
    
    @Test
    public void Testdisplay() throws Exception {
    	when(GetConnection.getMySQLConnection()).thenReturn(conn);
        when(conn.prepareStatement(any(String.class))).thenReturn(stmt);
        when(stmt.executeQuery()).thenReturn(rs);
    	
    assertEquals(rs,	L.display()) ;
  
    }

}