import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class login extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("wel");
        rd.forward(req, res);
    }
}