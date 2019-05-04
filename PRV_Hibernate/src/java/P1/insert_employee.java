package P1;

import javax.security.auth.message.callback.PrivateKeyCallback;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class insert_employee {
    public static void main(String[] args) throws Exception {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session sess = factory.openSession();
        Transaction t = sess.beginTransaction();
        
        employee e = new employee();
        
    }
}
