package com.gm.TestCode;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import org.mockito.Mockito;
import java.io.IOException;

import com.gm.controller.validateuser;
import com.gm.model.Login;

import org.junit.Before;
import org.junit.Test;

public class validateuserTest extends Mockito  {
   
	HttpServletRequest request;
	HttpServletResponse response;
	validateuser user;
	Login L;
	Boolean a;

	
	@Before
	public void setUp() throws Exception {
		 
		 try {
			 request = mock(HttpServletRequest.class);       
			 response = mock(HttpServletResponse.class); 	     
			 L=Mockito.mock(Login.class);
			 when(request.getParameter("email")).thenReturn("Hidden");
			 when(request.getParameter("password")).thenReturn("Secret");
			 when(L.validateuser(any(String.class),any(String.class))).thenReturn(true);
			 user= new validateuser();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testservlet() throws ServletException, IOException {
		 
	     try {
			user.doPost(request,response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     verify(request, atLeast(1)).getParameter("email");
	     
	}

}
