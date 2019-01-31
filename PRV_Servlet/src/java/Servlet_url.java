import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Servlet_url extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String uname = req.getParameter("uname");
        String hidden = req.getParameter("hide");
        if(uname.equals("admin")) {
            res.sendRedirect("Servlet_url2?Uname=" + uname + "&Hidden=" + hidden);
        }
    }
}