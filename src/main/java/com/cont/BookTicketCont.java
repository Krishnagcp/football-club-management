package com.cont;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.TicketBooking;
import com.model.TicketBookingDao;

@WebServlet("/BookTicketCont")
public class BookTicketCont extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name").trim();
        String match = request.getParameter("match").trim();
        String numTicketsStr = request.getParameter("numTickets").trim();
        
        int numTickets = Integer.parseInt(numTicketsStr);
        
        TicketBooking booking = new TicketBooking(name, match, numTickets);
        TicketBookingDao dao = new TicketBookingDao();
        dao.storeData(booking);
        
        RequestDispatcher rd = request.getRequestDispatcher("successmsg.html");
        rd.forward(request, response);
    }
}

