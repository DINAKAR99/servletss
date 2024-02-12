package serv.Tags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class MyFileHandler extends TagSupport {

    @Override
    public int doStartTag() throws JspException {

        try {

            JspWriter out = pageContext.getOut();

            out.println("<h1>this is my custom tag</h1>");
            out.println("<p>this is my custom para</p>");
            out.println("<h1>this is my custom tag</h1>");
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        return SKIP_BODY;
    }

}
