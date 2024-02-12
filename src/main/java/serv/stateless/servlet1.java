package serv.stateless;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/servlet1")
public class servlet1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("user_name");

        resp.setContentType("text/html");

        PrintWriter writer = resp.getWriter();

        /// cookies
        // Cookie c1 = new Cookie("user_name", name);
        // resp.addCookie(c1);
        // cookies

        writer.println("<h1>hello  " + name + "welcome to my site");

        // by url rewriting
        // writer.println("<h1><a href='servlet2?user_name=" + name + "'> go to sevlet
        // 2</a></h1>");
        // by url rewriting

        // hidden form coding

        writer.println("<form action='servlet2'>"

                + "<input type='hidden' name='user_name' value='" + name + "'/>" +

                "<button type='submit'>go to 2 serv</button>" +

                "</form>");
        // hidden form coding

    }

}
