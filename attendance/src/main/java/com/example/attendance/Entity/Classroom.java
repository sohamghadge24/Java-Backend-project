package com.example.attendance.Entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.time.LocalDate;

@Entity
public class Classroom {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@ManyToOne
    private Teacher teacher;

    @ManyToOne
    private Student student;

    @ManyToOne
    private Attendance attendance;

    private Boolean present;
    private LocalDate date;

    // Constructors, getters, and setters

    public Classroom(Teacher teacher,Student student,Attendance attendance, boolean present, LocalDate date) {
        this.teacher = teacher;
        this.student = student;
        this.attendance = attendance;
        this.present = present;
        this.date = date;
    }
	

	 public Classroom() {
	        // default constructor
	    }


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Teacher getTeacher() {
		return teacher;
	}


	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}


	public Student getStudent() {
		return student;
	}


	public void setStudent(Student student) {
		this.student = student;
	}


	public Attendance getAttendance() {
		return attendance;
	}


	public void setAttendance(Attendance attendance) {
		this.attendance = attendance;
	}


	public Boolean getPresent() {
		return present;
	}


	public void setPresent(Boolean present) {
		this.present = present;
	}


	public LocalDate getDate() {
		return date;
	}

	public void setDate( LocalDate date) {
		this.date = date;
	}


	


	   
}
