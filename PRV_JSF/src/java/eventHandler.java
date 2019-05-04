import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class eventHandler {
    public String status = "FALSE";

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public void processEvent() {
        if(status.equals("FALSE")) {
            status = "TRUE";
        }
        else {
            status = "FALSE";
        }
    }
}
