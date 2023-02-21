package com.OneToManyAssignment;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Instructor {
@Id
@Column(name = "instructor_id")
int instructorId;
@Column(name = "instructor_name")
String instructorName;
@OneToMany(mappedBy = "instructor")
List<Courses> courses;

public int getInstructorId() {
	return instructorId;
}
public void setInstructorId(int instructorId) {
	this.instructorId = instructorId;
}
public String getInstructorName() {
	return instructorName;
}
public void setInstructorName(String instructorName) {
	this.instructorName = instructorName;
}
public List<Courses> getCourses() {
	return courses;
}
public void setCourses(List<Courses> courses) {
	this.courses = courses;
}

public Instructor() {
	super();
	// TODO Auto-generated constructor stub
}
public Instructor(int instructorId, String instructorName, List<Courses> courses) {
	super();
	this.instructorId = instructorId;
	this.instructorName = instructorName;
	this.courses = courses;
}
}
