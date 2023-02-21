package com.ems.service;

import java.util.ArrayList;
import java.util.List;
import com.ems.entity.Address;
import com.ems.entity.Employee;
import com.ems.exception.GlobalException;

public class EmployeeService {
		private List<Employee> emp=new ArrayList<>();
	    public void addEmployee(long empId,String name,double salary,String city,String country) {
			Address ads=new Address(city, country);
			emp.add(new Employee(empId, name, salary, ads));
		}
	    
	    public int lengthOfList() {
	    	return emp.size();
	    }
	    public Employee displayById(long Id) throws GlobalException {
			int i;
			for(i=0;i<emp.size();i++) {
				if(emp.get(i).getEmpId()==Id) {
					return emp.get(i);
				}
			}if(i==emp.size()) {
				throw new GlobalException("Employee not found");
			}
	    	return null;
	    }
	    public List<Employee> displayAll(){
	    	return emp ;
	    }
 }
