package com.waviz.d1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	
    

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String ml=request.getParameter("mail");
		String pass=request.getParameter("password");
		
		
		LoginDao ld=new LoginDao();
		int temp=ld.connection(ml,pass);
		
		if(temp==1){
			response.sendRedirect("welcome.jsp");
		}
		else
		{
			System.out.println("user login not......");
		}
		
		
		}  
}		 
        			 
        			 
		 
        	 
        	 
        	