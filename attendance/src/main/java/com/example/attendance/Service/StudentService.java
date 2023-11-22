package com.example.attendance.Service;

import java.util.List;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.attendance.Entity.Student;
import com.example.attendance.Repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
    private StudentRepository studentRepository;
	
	public StudentService() {}
	// TODO Auto-generated constructor stub
	
	//find all 
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
    
    
  //find by name 
    public List<Student> findStudentsByName(String name) {
        return studentRepository.findByName(name);
    }
    
    public Student findStudentsById(long Id) {
        return studentRepository.findById(Id).orElse(null);
    }
    
    //save 
    public Student saveStudent(Student student) {
    	return studentRepository.save(student);
	}

    //delete
    
    public void deleteStudentByName(long id) {
        studentRepository.deleteById(id);
    }
}
