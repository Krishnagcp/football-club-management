package com.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.MatchDao;

/**
 * Servlet implementation class MatchInfoServlet
 */
@WebServlet("/MatchInfoServlet")
public class MatchInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MatchInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.println("<html>");
		out.println("<body>");
		out.println("<marquee><h2> Upcoming Match Info</h2></marquee>");
		out.println("<table border='1'><tr><th>Title</th><th>Place</th><th>Match Date</th>");
		ResultSet rs=new MatchDao().retrieveMatch();
		try {
			while(rs.next()) {
				out.println("<tr><th>"+rs.getString("title")+"</th><th>"+rs.getString("place")+"</th><th>"+rs.getString("matchDate"))	;		}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		out.println("</table></body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
