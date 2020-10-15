package emergon.restpackage;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private static List<Student> students;
    
    public List<Student> findAll(){
        if(students == null){
            students = new ArrayList();
        }
        students.add(new Student("Peter", 21, LocalDate.of(1999, Month.MARCH, 13)));
        students.add(new Student("Katherine", 20, LocalDate.of(2000, 6, 10)));
        students.add(new Student("Jack", 10, LocalDate.of(2010, 10, 20)));
        return students;
    }
    
    public void create(Student s){
        students.add(s);
    }
    
    public Student findById(int id){
        return students.get(id);
    }
    
    public void update(int id, Student newStudent){
        students.set(id, newStudent);
    }
    
    public void delete(int id){
        students.remove(id);
    }
}
