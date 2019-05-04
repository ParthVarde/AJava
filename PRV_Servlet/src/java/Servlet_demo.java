import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

class Servlet_demo extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        PrintWriter out = res.getWriter();
        out.println(req.getLocalAddr());
    }
}