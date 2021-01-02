package com.gm.TestCode;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import org.mockito.Mockito;
import java.io.IOException;
import java.io.InputStream;

import com.gm.controller.fileUploadServlet;
import com.gm.controller.userSignUp;
import com.gm.model.SignUp;
import com.gm.model.art;

import org.junit.Before;
import org.junit.Test;

public class fileUploadServletTest extends Mockito  {
   
	HttpServletRequest request;
	HttpServletResponse response;
	art user;
	fileUploadServlet L;
	Boolean a;
	Object o=new Object();

	
	@Before
	public void setUp() throws Exception {
		 
		 try {
			 request = mock(HttpServletRequest.class);       
			 response = mock(HttpServletResponse.class); 	     
			 L=Mockito.mock(fileUploadServlet.class);
			 when(request.getParameter("name")).thenReturn("Hidden");
			 when(request.getParameter("Artist")).thenReturn("Secret");
			 when(request.getPart("file")).thenReturn((Part) o);
			 when(request.getParameter("price")).thenReturn("10");
			 when(L.upload(any(String.class),any(String.class),any(InputStream.class),any(Integer.class))).thenReturn(true);
			 user= new art();
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
	     verify(request, atLeast(1)).getParameter("name");
	     
	}

}
