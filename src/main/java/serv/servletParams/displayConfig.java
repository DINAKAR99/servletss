package serv.servletParams;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = "/displayconfig", initParams = { @WebInitParam(name = "count", value = "89"),
        @WebInitParam(name = "kont", value = "222") })
public class displayConfig extends GenericServlet {

    private int count = 0;
    private ServletConfig config;

    public void init(ServletConfig config) {
        this.config = config;

    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter writer = res.getWriter();

        this.count = Integer.parseInt(config.getInitParameter("count"));

        writer.println("count value is " + count);

    }

}
