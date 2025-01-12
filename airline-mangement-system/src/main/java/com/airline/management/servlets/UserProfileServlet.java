package com.airline.management.servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class UserProfileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);

        if (session != null && session.getAttribute("user") != null) {
            String username = (String) session.getAttribute("user");
            request.setAttribute("username", username);
            RequestDispatcher dispatcher = request.getRequestDispatcher("userProfile.jsp");
            dispatcher.forward(request, response);
        } else {
            response.sendRedirect("login.jsp?message=Please log in first.");
        }
    }
}
