package emergon.restpackage;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

//The following Path will be inherited by all methods
@Path("/students")//ContextPath/rest/students
public class StudentResource {
    
    StudentService service = new StudentService();
    
    @GET//ContextPath/rest/students
    public List<Student> getStudents(){
        return service.findAll();
    }
    
}
