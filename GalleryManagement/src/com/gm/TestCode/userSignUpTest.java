package com.gm.TestCode;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import org.mockito.Mockito;
import java.io.IOException;

import com.gm.controller.userSignUp;
import com.gm.model.SignUp;

import org.junit.Before;
import org.junit.Test;

public class userSignUpTest extends Mockito  {
   
	HttpServletRequest request;
	HttpServletResponse response;
	userSignUp user;
	SignUp L;
	Boolean a;

	
	@Before
	public void setUp() throws Exception {
		 
		 try {
			 request = mock(HttpServletRequest.class);       
			 response = mock(HttpServletResponse.class); 	     
			 L=Mockito.mock(SignUp.class);
			 when(request.getParameter("email")).thenReturn("Hidden");
			 when(request.getParameter("password")).thenReturn("Secret");
			 when(request.getParameter("address")).thenReturn("Secret");
			 when(request.getParameter("gender")).thenReturn("Secret");
			 when(L.Signing(any(String.class),any(String.class),any(String.class),any(String.class))).thenReturn(true);
			 user= new userSignUp();
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
