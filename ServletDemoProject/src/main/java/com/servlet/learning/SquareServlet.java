package com.servlet.learning;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SquareServlet  extends HttpServlet
{

	public void service(HttpServletRequest req,HttpServletResponse response) throws IOException
	{
		int squareRes=(int)req.getAttribute("squareRes");
	 
		squareRes*=squareRes;
		System.out.println(squareRes);
		
		PrintWriter out= response.getWriter();
		out.println("Square root : "+squareRes);
	
	
	
	}

}
