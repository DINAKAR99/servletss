package serv.servletParams;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/discontext")
public class DisplayContext extends GenericServlet {

    // public ServletContext ctx;

    // public void init(ServletConfig cfg) {
    // this.ctx = cfg.getServletContext();
    // }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

        res.setContentType("text/html");
        PrintWriter writer = res.getWriter();

        String count = req.getServletContext().getInitParameter("count");
        // int count = Integer.parseInt(ctx.getInitParameter("count"));
        writer.println("count =" + count);

    }

}
