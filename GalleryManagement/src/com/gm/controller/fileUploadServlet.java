package com.gm.controller;

import java.io.IOException;
import java.io.InputStream;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import com.gm.model.art;
/**
 * Servlet implementation class fileUploadServlet
 */
@WebServlet("/fileUploadServlet")

@MultipartConfig(maxFileSize = 16177215)
public class fileUploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	public static final String UPLOAD_DIR = "images";
    public String dbFileName = "";
	
	public fileUploadServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		  InputStream inputStream = null; // input stream of the upload file
	         
	        // obtains the upload file part in this multipart request
	        Part filePart = request.getPart("file");
	        if (filePart != null) {
	            // prints out some information for debugging
	            System.out.println(filePart.getName());
	            System.out.println(filePart.getSize());
	            System.out.println(filePart.getContentType());
	             
	            // obtains input stream of the upload file
	            inputStream = filePart.getInputStream();
	     

	        String name=request.getParameter("name");
			String artist=request.getParameter("artist");
			int price = Integer.parseInt(request.getParameter("price"));
			
			if (inputStream != null) {
               
				if(!(new art().upload(name,artist,inputStream,price)))
				{request.getRequestDispatcher("SuccessUpload.jsp").forward(request,response);}
				else {
					request.getRequestDispatcher("UploadFailed.jsp").forward(request,response);
				}}
 
	}  inputStream.close();   
	        
	}}
