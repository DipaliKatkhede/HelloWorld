package com.example;

import java.io.*;
import javax.servlet.*;


public class Personal extends GenericServlet {
		
	public void service(ServletRequest request,ServletResponse response) throws ServletException,IOException{
		PrintWriter pw = response.getWriter();
		pw.write("Personal Information :");
		pw.write("Name : Dipali Katkhede");
		pw.write("Age : 22 year");
		pw.write("DOB : 22/10/1995");
		pw.write("Job : Member Technical At CDK global");
		pw.write("EmailId : dipalikatkhede111@gmail.com");
		pw.write("Address : Shastri nagar");
		pw.write(java.time.LocalDate.now());
		pw.write(java.time.LocalTime.now());
		
		
	}	

}