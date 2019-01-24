import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ServletContext_Two extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        ServletContext context = getServletContext();
        String str = context.getAttribute("uname").toString();
        PrintWriter out = res.getWriter();
        out.println("Name = " + str);
    }
}