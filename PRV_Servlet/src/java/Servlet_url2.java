import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Servlet_url2 extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        PrintWriter out = res.getWriter();
        String name = req.getParameter("Uname");
        String hide = req.getParameter("Hidden");
        out.println("Welcome " + name);
        out.println("Hidden Value = " + hide);
    }
}