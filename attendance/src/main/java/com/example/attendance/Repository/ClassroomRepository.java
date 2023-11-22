package com.example.attendance.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.attendance.Entity.Classroom;

@Repository
public interface ClassroomRepository extends JpaRepository<Classroom, Long> {

   
	@Query("SELECT new com.example.attendance.Entity.Classroom(t.name, s.name, c.present, c.date) FROM Teacher t JOIN Classroom c ON t.id = c.teacher.id JOIN Student s ON c.student.id = s.id JOIN Attendance a ON c.attendance.id = a.id")
	List<Classroom> getAttendanceTable();


}