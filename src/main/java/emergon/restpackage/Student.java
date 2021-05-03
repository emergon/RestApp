package emergon.restpackage;

import java.time.LocalDate;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

public class Student {
    private String name;
    private int age;
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    private LocalDate dob;

    public Student() {
    }

    public Student(String name, int age, LocalDate dob) {
        this.name = name;
        this.age = age;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
    
    
}
