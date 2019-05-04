import javax.faces.bean.ManagedBean;
import java.sql.*;
import java.util.*;

@ManagedBean
public class StudentDb1 {
    public List<StudentDb> getStudents() throws Exception {
        String url = "jdbc:mysql://localhost:3306/test";
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, "root", "root");
        List<StudentDb> students = new ArrayList<StudentDb>();
        PreparedStatement pstmt = con.prepareCall("select * from student");
        ResultSet rs = pstmt.executeQuery();
        while(rs.next()) {
            StudentDb s = new StudentDb();
            s.setId(rs.getInt("id"));
            s.setName(rs.getString("name"));
            students.add(s);
        }
        return students;
    }
}
