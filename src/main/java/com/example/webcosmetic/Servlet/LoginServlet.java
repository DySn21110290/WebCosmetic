package com.example.webcosmetic.Servlet;

import com.example.webcosmetic.Entity.Cart;
import com.example.webcosmetic.Entity.User;
import com.example.webcosmetic.EntityDB.CartDB;
import com.example.webcosmetic.EntityDB.UserDB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet(name = "login", value = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        String phone = req.getParameter("phone");
        String password = req.getParameter("password");
<<<<<<< HEAD
        User user = UserDB.select(phone,password);
=======
        User user = UserDB.select(phone, password);
>>>>>>> a965ed2300166aaac3f9618ef65e0b77756a19a7
        if (action.equals("admin")) {
            if (user != null && user.getRole().equals("admin")) {
                HttpSession session = req.getSession();
                session.setAttribute("admin", user);
                getServletContext().getRequestDispatcher("/admin").forward(req, resp);
            } else {
                req.setAttribute("message", "Tài khoản không hợp lệ");
                getServletContext().getRequestDispatcher("/login.jsp").forward(req, resp);
            }
        } else {
            if (user != null && user.getRole().equals("customer")) {
<<<<<<< HEAD
                Cookie c = new Cookie("userIdWebCosmetic", user.getId().toString());
                c.setMaxAge(60);
                c.setPath("/");
                resp.addCookie(c);
                resp.sendRedirect("home");
=======
                HttpSession session = req.getSession();
                session.setAttribute("customer", user);
                getServletContext().getRequestDispatcher("/home").forward(req, resp);
>>>>>>> a965ed2300166aaac3f9618ef65e0b77756a19a7
            } else {
                req.setAttribute("message", "Tài khoản không hợp lệ");
                getServletContext().getRequestDispatcher("/login_customer.jsp").forward(req, resp);
            }
<<<<<<< HEAD
=======

>>>>>>> a965ed2300166aaac3f9618ef65e0b77756a19a7
        }
    }

}
