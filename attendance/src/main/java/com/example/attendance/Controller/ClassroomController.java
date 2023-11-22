package com.example.attendance.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.attendance.Entity.Attendance;
import com.example.attendance.Entity.Classroom;
import com.example.attendance.Service.AttendanceService;
import com.example.attendance.Service.ClassroomService;

@RestController
@RequestMapping("/api/classrooms")
public class ClassroomController {

    @Autowired
    private ClassroomService classroomService;

    @GetMapping
    public ResponseEntity<List<Classroom>> getAttendanceTable() {
        List<Classroom> attendanceTable = classroomService.getAttendanceTable();
        return new ResponseEntity<>(attendanceTable, HttpStatus.OK);
    }
    
}
