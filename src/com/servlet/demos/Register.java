package com.servlet.demos;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	



		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("UserName");
		String passwd = request.getParameter("Password");
		String gender = request.getParameter("gender");
		String [] hobbies = request.getParameterValues("hobbies");
		String country = request.getParameter("country");
		String [] language = request.getParameterValues("languages");
		
		PrintWriter out = response.getWriter();
		
		response.setContentType("text/html");
		
		out.println("<div>");
		out.println("<p> Username :" + name + "</p>");
		out.println("<p> Password :" + passwd + "</p>");
		out.println("<p> Gender :" + gender + "</p>");
		out.println("<p> Hobbies : </p>");
		for (int i = 0; i < hobbies.length; i++){
			
			out.println(hobbies[i]+"</br>");
			}
		out.println("<p> Country :" + country + "</p>");
		out.println("<p> Languages : </p>");
		for(int i=0;i<language.length;i++){
			out.println(language[i] + "</br>");
		}
	}

}
