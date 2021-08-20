package com.practice.JerseyIntegration;

import jakarta.validation.constraints.Past;
//import jakarta.websocket.server.PathParam;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.container.AsyncResponse;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;



import java.util.List;

import com.practice.JerseyIntegration.dao.Student;
import com.practice.JerseyIntegration.dao.StudentDao;

@Path("/students")
public class StudentResource {
	//StudentDao dao = new StudentDao();

    @GET
    @Path("show")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Student> getAllStudent() {
    	StudentDao dao = new StudentDao();
        return dao.getAllStudent();
    }
    
    @POST
    @Path("add")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Student> addStudent(Student student){
    	StudentDao dao = new StudentDao();
    	 dao.addStudent(student);
    	 return dao.getAllStudent();
    }    
    
    @DELETE
    @Path("remove/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Student> removeStudent(@PathParam("id") int id) {
    	StudentDao dao = new StudentDao();
     	 dao.removeStudent(id);
   	     return dao.getAllStudent();
    	
    }
    
    
    @PUT
    @Path("update/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Student> updateStudent(@jakarta.ws.rs.PathParam("id") int id,Student student) {
    	StudentDao dao = new StudentDao();
     	 dao.updateStudent(id,student);
   	     return dao.getAllStudent();
    	
    }
    
    
    
    
    
    
//    public String getIt() {
//        return "Hello Shubham Got it!";
//    }
    
//    @GET
//    @Path("students/{id}")
//    @Produces(MediaType.APPLICATION_JSON)
//    public List<Student> studentById(int id) {
//    	StudentDao dao = new StudentDao();
//        return dao.getStudent(id);
//    }
    
    
   
    
    
   
    
    
    
    
}