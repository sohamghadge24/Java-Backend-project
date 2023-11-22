package com.example.attendance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication

@EntityScan(basePackages = "com.example.attendance.Entity")
public class StudentAttendanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentAttendanceApplication.class, args);
	}

}
