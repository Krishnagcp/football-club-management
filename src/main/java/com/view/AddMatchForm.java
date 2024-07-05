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

@WebServlet("/AddMatchForm")
public class AddMatchForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddMatchForm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out=response.getWriter();
	response.setContentType("text/html");
	
	ArrayList<String> list=(ArrayList<String>)request.getAttribute("errors");
	
	out.println("<html>");
	out.println("<body><center>");
	
	if(list!=null) {
		Iterator<String> itr = list.iterator();
		out.println("<ul>");
		while(itr.hasNext()) {
			out.println("<center><ul>"+itr.next()+"</ul></center>");
			
		}
		out.println("</ul>");
	}
	
	out.println("<h2>Add Match Details</h2>");
	out.println("<form action='AddMatchCont';' method='post'>");
	out.println("Title <input type='text' name='title'><br><br>");
	out.println("Place <input type='text' name='place'><br><br>");
	out.println("Match Date <input type='text' name='date'><br><br>");
	out.println(" <input type='submit' value='Register'><br><br>");
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
