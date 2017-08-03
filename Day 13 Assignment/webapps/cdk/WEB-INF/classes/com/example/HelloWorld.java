package com.example;

import java.io.*;
import javax.servlet.*;

public class HelloWorld extends GenericServlet {
		
	public void service(ServletRequest request,ServletResponse response) throws ServletException,IOException{
		PrintWriter pw = response.getWriter();
		pw.write("Hello from servlet.....");
	}	

}