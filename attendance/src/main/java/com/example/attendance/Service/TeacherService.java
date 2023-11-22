package com.example.attendance.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.attendance.Entity.Teacher;
import com.example.attendance.Repository.TeacherRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherService {

	public TeacherService() {
		// TODO Auto-generated constructor stub
	}
	@Autowired
    private TeacherRepository teacherRepository;

   
    public List<Teacher> getAllTeachers() {
        return teacherRepository.findAll();
    }

    public Optional<Teacher> getTeacherById(Long id) {
        return teacherRepository.findById(id);
    }

    public Teacher createTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }
    
    public void deleteTeacher(Long id) {
        teacherRepository.deleteById(id);
    }
    
    public Teacher updateTeacher(Long id, Teacher updatedTeacher) {
        Optional<Teacher> existingTeacherOptional = teacherRepository.findById(id);

        if (existingTeacherOptional.isPresent()) {
            Teacher existingTeacher = existingTeacherOptional.get();
            existingTeacher.setName(updatedTeacher.getName());
      
            // You can update other fields as needed
            return teacherRepository.save(existingTeacher);
        } 
        
        return null;
    }
}