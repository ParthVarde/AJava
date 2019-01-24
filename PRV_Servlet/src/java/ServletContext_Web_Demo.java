import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ServletContext_Web_Demo extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String str = getServletContext().getInitParameter("USERNAME").toString();
        PrintWriter out = res.getWriter();
        out.println("UserName = " + str);
    }
}