import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Session_Demo extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        HttpSession s = req.getSession();
        PrintWriter out = res.getWriter();
        Integer count = (Integer)s.getAttribute("count");
        if(count == null) {
            count = new Integer(0);
            s.setAttribute("count", ++count);
            out.println("Visit Count = " + count);
        }
        else {
            s.setAttribute("count", ++count);
            out.println("Visit Count = " + count);
        }
    }
}