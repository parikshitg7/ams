package com.airline.management.servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Example validation (Replace with database logic)
        if ("admin".equals(username) && "password123".equals(password)) {
            // Set session attribute
            HttpSession session = request.getSession();
            session.setAttribute("user", username);

            // Redirect to user profile page
            response.sendRedirect("userProfile.jsp");
        } else {
            // Invalid login
            request.setAttribute("error", "Invalid username or password!");
            RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
            dispatcher.forward(request, response);
        }
    }
}
