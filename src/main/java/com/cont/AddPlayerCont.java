package com.cont;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class AddPlayerCont
 */
@WebServlet("/AddPlayerCont")
@MultipartConfig(maxFileSize=16177215)
public class AddPlayerCont extends HttpServlet {
	private static final long serialVersionUID = 1L;
       String driver="com.cj.jdbc.Driver";
       String url="jdbc:mysql://localhost:3306/vsbdb";
       String unm="root";
       String pwd="root";
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("Name");
		String a= request.getParameter("Age");
		int age=Integer.parseInt(a);
		Part pf = request.getPart("Profile");
		InputStream istrm=null;
		if(pf!=null) {
			System.out.println(pf.getName());
			System.out.println(pf.getSize());
			System.out.println(pf.getContentType());
			istrm = pf.getInputStream();
		}
		Connection con=null;
		String msg=null;
		
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			con=DriverManager.getConnection(url,unm,pwd);
			String sql = "insert into playerdetails(name,age,profile) values(?,?,?)";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, name);
			pst.setInt(2,age);
		
		if(istrm!=null) {
			pst.setBlob(3,istrm);
		}
		
		
		int res= pst.executeUpdate();
		
		if(res>0) {
			msg= "Player uploaded Successfullyyyyyy";
		}
		con.close();
		}
		catch(SQLException s) {
			s.printStackTrace();
		} 
		request.setAttribute("msg",msg);
		getServletContext().getRequestDispatcher("/successmsg.html").forward(request, response);
		
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
}
