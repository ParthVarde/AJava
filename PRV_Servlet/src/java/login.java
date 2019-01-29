import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class login extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String uname = req.getParameter("uname");
        String pass = req.getParameter("pass");
        if(uname.equals("admin") && pass.equals("admin")) {
            RequestDispatcher rd = req.getRequestDispatcher("wel");
            rd.forward(req, res);
        }
        else {
            RequestDispatcher rd=req.getRequestDispatcher("login1.html");
            rd.include(req,res);
        }
    }
}