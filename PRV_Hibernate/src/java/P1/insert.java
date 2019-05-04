package P1;

import org.hibernate.*;
import org.hibernate.cfg.*;
        
public class insert {
    public static void main(String[] args) throws Exception {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session sess = factory.openSession();
        Transaction t = sess.beginTransaction();
        student s = new student();
        s.setName("XYZ");
        sess.save(s);
        t.commit();
        sess.close();
        System.out.println("Data Inserted Successfully");
    }
}
