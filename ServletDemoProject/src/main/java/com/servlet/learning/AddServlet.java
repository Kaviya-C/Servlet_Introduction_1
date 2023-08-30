package com.servlet.learning;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
	
	// we have to use service method only to working
	// it belongs to servlet life cycle
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws IOException,ServletException 
	{
		
	/*	
		int first = Integer.parseInt(request.getParameter("num1"));
		
		int second = Integer.parseInt(request.getParameter("num2"));

		int result = first + second;

		
		
		System.out.println(result);
		above will print in the console
		
		PrintWriter out= response.getWriter();
		
		//if  i want to see the result in the web browser
		out.println("Addition of two number is: "+result);
       */
		
		//-------------------------------------------
		/*
		 * HOW TO CALLING SERVLET FROM SERVLET???
		 * 
		 * in addservlet  u have to use one interface
		 * RequestDispatcher re = request.getRequestDispatcher("square");
		 * re.forward(request,response)
		 * 
		 * 
		 * above is an interface we are not able to create an object
		 * one method is there 
		 * getRequestDispatcher() is a method it takes one argument
		 * that argument is "square" -- this is the servlet name we have 
		 * to attached to web.xml page
		 * 
		 * after that we have to forward the rquest and response 
		 * by using 
		 * re.forward(request,response) 
		 * 
		 */
		
		int first = Integer.parseInt(request.getParameter("num1"));
		
		int second = Integer.parseInt(request.getParameter("num2"));

		int res = first + second;
		
		// here we can send the this result to square servlet
		 
		request.setAttribute("squareRes", res);
		
		RequestDispatcher reqDis = request.getRequestDispatcher("Sq");
		reqDis.forward(request, response);
		
		
		
	}

}





/*
 * in httpservlet --->  there are two  methods are ther
 *      one is doGet()
 *      another is doPost()
 *   
 *    instead of service we can use doGet() or doPost()
 *   
 *    if u want to perform post and get method
 *    
 *      compulsory we have to mention as 
 *      method=post
 *      then make that service() as doPost()
 *      
 *      otherwise we get an error -->
 *      bcoz if we not mention the method in index.html
 *      by default method is get but we do changes only
 *      in java of doPost() then we got an error as
 *      
 *      " HTTP method GET is not supported by this url "
 *    
 */


/*
 * WHAT IS HAPPENING BEHIND THIS DOPOST AND DOGET
 * 
 * Even though we remove the service() in java
 * 
 * we extending HttpServlet  this will having service method
 * and internally it calls service method
 * there doGet and doPost are available
 * depending on our requirement that method will be called
 * 
 */









