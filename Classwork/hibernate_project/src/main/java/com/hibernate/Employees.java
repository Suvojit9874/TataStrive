package com.hibernate;

import javax.persistence.Entity;
import java.util.List;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Employees {
	@Id
	private int eid;
	private String name;
	@ManyToMany
	private List<Projects> pros;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Projects> getPros() {
		return pros;
	}
	public void setPros(List<Projects> pros) {
		this.pros = pros;
	}
	public Employees(int eid, String name, List<Projects> pros) {
		super();
		this.eid = eid;
		this.name = name;
		this.pros = pros;
	}
	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
