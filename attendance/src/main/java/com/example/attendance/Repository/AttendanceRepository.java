package com.example.attendance.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.attendance.Entity.Attendance;
import com.example.attendance.Entity.Classroom;

@Repository
public interface AttendanceRepository extends JpaRepository<Attendance, Long> {
	 @Query("SELECT a FROM Attendance a WHERE a.Name = :studentName")
	    List<Attendance> findByStudentName( String studentName);

	void save(Classroom classroom);
	 
	 
//	 
//	 @Query("UPDATE Attendance a SET a.present = :present WHERE a.Name = :studentName")
//	    void updateAttendanceByName(@Param("name") String name, @Param("present") boolean present);
//	
	 }
