import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LifeCycle extends HttpServlet {
    public void init()
    {
        System.out.println("Init -------------------------------------------------------------------------------------------");
    }
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        PrintWriter out = res.getWriter();
        out.println("SERVICE");
    }
    public void destroy()
    {
        System.out.println("Destroy -------------------------------------------------------------------------------------------");
    }
}