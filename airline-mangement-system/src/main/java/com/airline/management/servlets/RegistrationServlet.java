package com.airline.management.servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class RegistrationServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // Add user to the database (mock logic here)
        boolean isRegistered = true; // Replace with actual DB logic

        if (isRegistered) {
            response.sendRedirect("login.jsp?message=Registration successful. Please log in.");
        } else {
            request.setAttribute("error", "Registration failed. Try again.");
            RequestDispatcher dispatcher = request.getRequestDispatcher("register.jsp");
            dispatcher.forward(request, response);
        }
    }
}
