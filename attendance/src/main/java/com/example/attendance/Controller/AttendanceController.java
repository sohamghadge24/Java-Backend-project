package com.example.attendance.Controller;

//package com.example.attendance.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.attendance.Entity.Attendance;
import com.example.attendance.Service.AttendanceService;

import java.util.List;


@RestController
@RequestMapping("/api/attendance")
public class AttendanceController {
    @Autowired
    private AttendanceService attendanceService;

    

    @PutMapping("/{name}")
    public ResponseEntity<String> updateStudent(
            @PathVariable String name,
            @RequestParam Boolean attendence,
            @RequestParam Long teacherId
            ) {
    	attendanceService.updateStudent(name,teacherId,attendence);
        return ResponseEntity.ok("Student updated successfully");
    }
    
    @PostMapping("/mark")
    public ResponseEntity<String> markAttendance(@RequestBody Attendance attendance) {
        try {
            attendanceService.markAttendance(attendance);
            return new ResponseEntity<>("Attendance marked successfully", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("Failed to mark attendance", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
}