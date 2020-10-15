package emergon.restpackage;

import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

//The following Path will be inherited by all methods
@Path("/students")//ContextPath/rest/students
public class StudentResource {
    
    StudentService service = new StudentService();
    
    @GET//ContextPath/rest/students
    public List<Student> getStudents(){
        return service.findAll();
    }
    
    @GET
    @Path("/{id}")//Path parameter
    @Produces(MediaType.APPLICATION_JSON)
    public Response getStudent(@PathParam("id") int id){
        Student s = service.findById(id);
        return Response.ok().entity(s).build();
    }
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createStudent(Student s){
        service.create(s);
        return Response.status(Response.Status.CREATED).build();
    }
    
    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateStudent(@PathParam("id") int id, Student s){
        service.update(id, s);
        String message = "Student updated successfully!!";
        return Response.ok().entity(message).build();
    }
    
    @DELETE
    @Path("/{id}")
    public Response deleteStudent(@PathParam("id") int id){
        service.delete(id);
        String message = "Student deleted successfully!!";
        return Response.ok().entity(message).build();
    }
    
}
