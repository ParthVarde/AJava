package p1;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
        
public class custom_tag_example extends TagSupport {
    public int n;
    public void setn(int n) {
        this.n = n;
    }
    public int getn() {
        return n;
    }
    
    public int doStartTag() {
        try {
            JspWriter out = pageContext.getOut();
            out.println(n * n);
        }
        catch(Exception e) {
            
        }
        return EVAL_PAGE;
    }
}
