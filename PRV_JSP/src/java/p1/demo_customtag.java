/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class demo_customtag extends TagSupport {
    public int doStartTag() {
        try {
            JspWriter out = pageContext.getOut();
            out.println("My Custom Tag");
        }
        catch(Exception e) {
            
        }
        return EVAL_PAGE;
    }
    public int doEndTag() {
        return SKIP_PAGE;
    }
}
