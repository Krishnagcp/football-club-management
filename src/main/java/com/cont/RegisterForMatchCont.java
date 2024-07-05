package com.cont;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.MatchRegistration;
import com.model.MatchRegistrationDao;

@WebServlet("/RegisterForMatchCont")
public class RegisterForMatchCont extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public RegisterForMatchCont() {
        super();
    }

   

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name").trim();
        String match = request.getParameter("match").trim();

        ArrayList<String> errors = new ArrayList<>();
        if (name.isEmpty()) {
            errors.add("Enter name field");
        }
        if (match.isEmpty()) {
            errors.add("Select a match");
        }

        if (!errors.isEmpty()) {
            request.setAttribute("errors", errors);
            RequestDispatcher rd = request.getRequestDispatcher("RegisterForMatchServlet");
            rd.forward(request, response);
            return;
        }

        MatchRegistration registration = new MatchRegistration(name, match);
        MatchRegistrationDao registrationDao = new MatchRegistrationDao();
        registrationDao.storeData(registration);

        RequestDispatcher rd = request.getRequestDispatcher("successmsg.html");
        rd.forward(request, response);
    }
}


