package serv.Tags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class PrintTable extends TagSupport {

    private int number;
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public int doStartTag() throws JspException {

        try {

            JspWriter out = pageContext.getOut();

            out.println("<div style='color:" + color + "'>");
            for (int i = 0; i < 10; i++) {
                out.println(i * number);

            }

            out.println("</div >");
            // TODO: handle exception

        } catch (Exception e) {
            e.printStackTrace();
        }

        return SKIP_BODY;
    }

}
