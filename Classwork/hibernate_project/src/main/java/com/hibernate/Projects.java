package com.hibernate;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Projects {
@Id
private int pid;
private String project_name;
@ManyToMany
private List<Employees> emps;
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getProject_name() {
	return project_name;
}
public void setProject_name(String project_name) {
	this.project_name = project_name;
}
public List<Employees> getEmps() {
	return emps;
}
public void setEmps(List<Employees> emps) {
	this.emps = emps;
}
public Projects(int pid, String project_name, List<Employees> emps) {
	super();
	this.pid = pid;
	this.project_name = project_name;
	this.emps = emps;
}
public Projects() {
	super();
	// TODO Auto-generated constructor stub
}

}
