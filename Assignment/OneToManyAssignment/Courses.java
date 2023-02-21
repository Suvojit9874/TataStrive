package com.OneToManyAssignment;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Courses {
@Id
@Column(name = "course_id")
int courseId;
@Column(name = "course_name")
String courseName;
@ManyToOne						
Instructor instructor;
public int getCourseId() {
	return courseId;
}
public void setCourseId(int courseId) {
	this.courseId = courseId;
}
public String getCourseName() {
	return courseName;
}
public void setCourseName(String courseName) {
	this.courseName = courseName;
}
public Instructor getInstructor() {
	return instructor;
}
public void setInstructor(Instructor instructor) {
	this.instructor = instructor;
}
public Courses(int courseId, String courseName, Instructor instructor) {
	super();
	this.courseId = courseId;
	this.courseName = courseName;
	this.instructor = instructor;
}
public Courses() {
	super();
}

}
