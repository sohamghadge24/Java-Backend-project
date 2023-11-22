package com.example.attendance.Entity;


import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String Name;
    private LocalDate date;
    private Long studentId;
    private Long teacherId;
    private boolean present;

  //constructor 
    public Attendance() {}
    
	 public Attendance(Long id, String Name,LocalDate date,Long teacherId,Long studentId,boolean present) {
	    	this.Name=Name;
	    	this.id=id;
	    	this.studentId=studentId;
	    	this.teacherId=teacherId;
	    	this.present=present;
	    	this.date=date;
	    }
 

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public Long getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(Long teacherId) {
		this.teacherId = teacherId;
	}

	public boolean isPresent() {
		return present;
	}

	public void setPresent(boolean present) {
		this.present = present;
	}
    
    // getters and setters
    
}