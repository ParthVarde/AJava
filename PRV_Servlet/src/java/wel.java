import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class wel extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String uname = req.getParameter("uname");
        PrintWriter out = res.getWriter();
        out.println("Welcome " + uname);
    }
}