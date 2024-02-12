package serv.stateless;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/servlet2")
public class servlet2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();

        String name = null;

        // by url rewriting
        name = req.getParameter("user_name");
        // by url rewriting

        // cookie code
        // Cookie[] cookies = req.getCookies();

        // boolean flag = false;

        // if (cookies == null) {
        // writer.println("<h1>ur a new user go backkkk</h1>");

        // } else {
        // for (Cookie cook : cookies) {

        // String name2 = cook.getName();
        // if (name2.equalsIgnoreCase("user_name")) {

        // name = cook.getValue();
        // flag = true;

        // }

        // }

        // }

        // cookie code

        // if (flag == true) {
        // writer.println("<h1>hello " + name + "welcome to my site again</h1> ");
        // writer.println("<h1>thank you </h1> ");

        // } else {

        // writer.println("<h1>ur a new user go backkkk</h1>");
        // }

        writer.println("<h1>hello  " + name + "welcome to my site again</h1>  ");
        writer.println("<h1>thank you </h1> ");

    }

}
