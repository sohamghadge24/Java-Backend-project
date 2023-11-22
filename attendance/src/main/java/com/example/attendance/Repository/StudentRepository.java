package com.example.attendance.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.attendance.Entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
	 List<Student> findByName(String name);
	 void deleteByName(String name);
	 
}
