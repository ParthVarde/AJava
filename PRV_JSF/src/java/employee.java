import javax.faces.bean.ManagedBean;

@ManagedBean
public class employee {
    public String name;
    public int age;
    public int r;
    public double area;
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setR(int r) {
        this.r = r;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getR() {
        return r;
    }
    public double getArea() {
        return 3.14 * r * r;
    }
}
