/**
 * Servlet program to send request and response 
 * Demonstration: Compute simple interest
 * 
 * @see https://cleartax.in/s/simple-compound-interest-calculator
 * @see https://www.cuemath.com/commercial-math/simple-interest/
 * 
 */
package com.udesh;

import java.io.IOException;
import java.io.PrintWriter; 

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse; 

// Class loan extends the HttpServlet API 
public class Loan extends HttpServlet {
	
		// Servlet life cycle // 
		public void service(HttpServletRequest requ, 
				HttpServletResponse resp) throws IOException 
		{
			// Return values of parameter as a string // 
			// getParameter method //
	
		double p = Double.parseDouble(requ.getParameter("principal")); 
		double r = Double.parseDouble(requ.getParameter("rate")); 
		int t = Integer.parseInt(requ.getParameter("period")); 
		double calc = (p * r * t)/100; 
		// Display result in the form // 
		PrintWriter out = resp.getWriter(); 
		out.println("Your total value: " +calc);
		
	}

}
