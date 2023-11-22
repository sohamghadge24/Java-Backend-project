package com.example.attendance.Service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.attendance.Entity.Attendance;
import com.example.attendance.Entity.Classroom;
import com.example.attendance.Entity.Student;
import com.example.attendance.Entity.Teacher;
import com.example.attendance.Repository.AttendanceRepository;

import jakarta.transaction.Transactional;

@Service
public class AttendanceService {
	@Autowired
    private AttendanceRepository attendanceRepository;

    public List<Attendance> getAllAttendances() {
        return attendanceRepository.findAll();
    }
    
    

    public void updateStudent(String name,Long teacherId,Boolean attendence) {
        // Find the student by 
        List<Attendance> students = attendanceRepository.findByStudentName(name);

        // Update each student found
        for (Attendance attendancestudent : students) {
        	attendancestudent.setName(name);
        	attendancestudent.setTeacherId(teacherId);
        	attendancestudent.setPresent(attendence);
        	attendancestudent.setDate(LocalDate.now());
        	
            // Save the updated student attendance
        	attendanceRepository.save(attendancestudent);
        }
    }
    public void markAttendance(Attendance attendance) {
        // Perform any necessary validation or business logic here

        // Create an Attendance object and save it to the database
        Classroom classroom = new Classroom();
        classroom.setTeacher(new Teacher(attendance.getTeacherId()));
        classroom.setStudent(new Student(attendance.getStudentId()));
        classroom.setPresent(attendance.isPresent());
        classroom.setDate(attendance.getDate());

        attendanceRepository.save(classroom);
    }
    
//    @Transactional
//    public void updateAttendanceByName(String name, boolean present) {
//        attendanceRepository.updateAttendanceByName(name, present);
//    }
    
    
    public void deleteAttendance(Long id) {
        attendanceRepository.deleteById(id);
    }
    
    
    public Attendance createAttendance(Attendance attendance) {
        return attendanceRepository.save(attendance);
    }
    
    public Attendance getAttendanceById(Long id) {
        return attendanceRepository.findById(id).orElse(null);
    }
    
    
    
}


