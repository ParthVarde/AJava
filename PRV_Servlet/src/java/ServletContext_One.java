import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ServletContext_One extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        ServletContext context = getServletContext();
        context.setAttribute("uname", "Hinu");
        PrintWriter out = res.getWriter();
        out.println("<a href='ServletContext_Two'>Send to Servlet_Two</a>");
    }
}