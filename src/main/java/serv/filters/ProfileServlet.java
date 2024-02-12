package serv.filters;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/profile")
public class ProfileServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("profile seervlet");
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();

        writer.println("<h1>welcome to profile servlet </h1>");
        writer.println("<h1>tis is prof pag</h1>");

    }

}
