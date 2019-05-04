import javax.faces.bean.ManagedBean;

@ManagedBean
public class student {
    public String name, add, city, gender, pass;
    public String subject[] = new String[3];
    public int age;
    public void setName(String name) {
        this.name = name;
    }
    public void setAdd(String add) {
        this.add = add;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public void setPass(String pass) {
        this.pass = pass;
    }

    public String[] getSubject() {
        return subject;
    }

    public void setSubject(String[] subject) {
        this.subject = subject;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public String getAdd() {
        return add;
    }
    public String getCity() {
        return city;
    }
    public String getGender() {
        return gender;
    }
    
    public String getPass() {
        return pass;
    }
    public int getAge() {
        return age;
    }
}
