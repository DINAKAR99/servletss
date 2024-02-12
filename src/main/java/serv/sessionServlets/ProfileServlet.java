package serv.sessionServlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/profileservlet")
public class ProfileServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession(false);
        resp.setContentType("text/html");

        PrintWriter writer = resp.getWriter();

        if (session != null)

        {

            String name = (String) req.getAttribute("name");
            writer.write("<h2>welcome to profile </h2>" + name);

        }

        else {
            resp.sendRedirect("login.html");

        }

        writer.println("<h2><a href='sessiondemo.html'> back home </a></h2>");
    }

}
