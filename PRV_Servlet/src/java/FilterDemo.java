import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FilterDemo implements Filter {
    public void init(FilterConfig fc) {}
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain f) throws ServletException, IOException {
        //PrintWriter out = res.getWriter();
        //out.println("Servlet not visible , Filter Visible");
        String uname = req.getParameter("uname");
        String pass = req.getParameter("pass");
        if(uname.equals("admin") && pass.equals("admin")) {
            f.doFilter(req, res);
        }
    }
    public void destroy() {}
}
