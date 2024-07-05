package com.view;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterForMatchServlet
 */
@WebServlet("/RegisterForMatchServlet")
public class RegisterForMatchServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterForMatchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Register for a Match</title>");
        out.println("<style>");
        out.println("body { font-family: Arial, sans-serif; background-color: #f4f4f4; color: #333; margin: 0; padding: 0; display: flex; justify-content: center; align-items: center; height: 100vh; }");
        out.println(".container { background: #fff; border-radius: 8px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1); padding: 20px; width: 400px; }");
        out.println("h2 { color: #007bff; margin-bottom: 20px; }");
        out.println("label { display: block; margin-bottom: 10px; font-weight: bold; }");
        out.println("input, select { width: 100%; padding: 10px; margin-bottom: 20px; border: 1px solid #ccc; border-radius: 4px; }");
        out.println("button { background: #007bff; color: #fff; border: none; padding: 10px; border-radius: 4px; cursor: pointer; width: 100%; }");
        out.println("button:hover { background: #0056b3; }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='container'>");
        out.println("<h2>Register for a Match</h2>");
        out.println("<form action='RegisterForMatchCont' method='post'>");
        out.println("<label for='name'>Name:</label>");
        out.println("<input type='text' id='name' name='name' required>");
        out.println("<label for='match'>Select Match:</label>");
        out.println("<select id='match' name='match' required>");
        out.println("<option value=''>--Select Match--</option>");
        out.println("<option value='match1'>Match 1</option>");
        out.println("<option value='match2'>Match 2</option>");
        out.println("<option value='match3'>Match 3</option>");
        out.println("</select>");
        out.println("<button type='submit'>Register</button>");
        out.println("</form>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
    }

    
}

