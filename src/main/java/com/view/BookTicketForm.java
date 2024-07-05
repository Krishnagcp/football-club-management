package com.view;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BookTicketForm")
public class BookTicketForm extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        out.println("<html><body>");
        out.println("<h2>Book a Ticket</h2>");
        out.println("<form action='BookTicketCont' method='post'>");
        out.println("Name: <input type='text' name='name' required><br><br>");
        out.println("Match: <select name='match' required>");
        out.println("<option value=''>--Select Match--</option>");
        out.println("<option value='match1'>Match 1</option>");
        out.println("<option value='match2'>Match 2</option>");
        out.println("<option value='match3'>Match 3</option>");
        out.println("</select><br><br>");
        out.println("Number of Tickets: <input type='number' name='numTickets' min='1' required><br><br>");
        out.println("<input type='submit' value='Book Ticket'>");
        out.println("</form>");
        out.println("</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}

