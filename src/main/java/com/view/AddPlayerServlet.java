package com.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddPlayerServlet
 */
@WebServlet("/AddPlayerServlet")
public class AddPlayerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddPlayerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");	
		
		//ArrayList<String> list=(ArrayList<String>)request.getAttribute("errors");
		
		out.println("<html>");
		out.println("<body><center>");
		out.println("<h2>Enter player Information</h2>");
		out.println("<form action='AddPlayerCont';' method='post' enctype='multipart/form-data'>");
		out.println("Name <input type='text' name='Name'><br><br>");
		out.println("Age <input type='text' name='Age'><br><br>");
		out.println("File <input type='file' name='Profile'><br><br>");
		out.println(" <input type='submit' value='AddPlayer'><br><br>");
		out.println("</form></center></body>");
		out.println("</html>");
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
