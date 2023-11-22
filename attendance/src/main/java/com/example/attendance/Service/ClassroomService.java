package com.example.attendance.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.attendance.Entity.Attendance;
import com.example.attendance.Entity.Classroom;
import com.example.attendance.Entity.Student;
import com.example.attendance.Entity.Teacher;
import com.example.attendance.Repository.ClassroomRepository;

@Service
public class ClassroomService {

    @Autowired
    private ClassroomRepository classroomRepository;

    public List<Classroom> getAttendanceTable() {
        return classroomRepository.getAttendanceTable();
    }

    
    // You can add more service methods based on your requirements
}
