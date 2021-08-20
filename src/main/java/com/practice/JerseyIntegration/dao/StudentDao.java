package com.practice.JerseyIntegration.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentDao {
	SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
	Session session=sessionFactory.openSession();
	 Transaction tx=session.beginTransaction();
	
     public StudentDao() {
    	 
     }
     public List<Student> getAllStudent(){
    	 List<Student> student=new ArrayList<Student>();
    		 
    		 Query query=session.createQuery("from Student");
    		 
    		 student=query.list();
    		 return student;
    		
    	
     }

     
	public void addStudent(Student student) {
		session.save(student);
	}
	
	public void removeStudent(int id) {
		  Student student = (Student)session.load(Student.class,id);
		  session.delete(student);
		
		
	}
  
	public void updateStudent(int id,Student student) {
//		Student student = (Student)session.load(Student.class,id);
//		student.setName("Johnson");
//        session.update(student);
		Query q=session.createQuery("update Student set name=:stname ,city=:stcity where id=:stid");  
		q.setParameter("stname",student.getName()); 
		q.setParameter("stcity",student.getCity()); 
		q.setParameter("stid",id);  
		  
		q.executeUpdate();  
		
	}
  
  
}