import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Area_Circle extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String str = req.getParameter("radius");
        double r = Double.parseDouble(str);
        double area = 3.14*r*r;
        PrintWriter out = res.getWriter();
        out.println(area);
    }
}