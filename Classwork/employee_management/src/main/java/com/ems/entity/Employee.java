package com.ems.entity;

public class Employee {
		private long empId;
		private String name;
		private double EmpSalary;
		Address address; // has a relationship
		public Employee(long empId, String name, double empSalary, Address address) {
			super();
			this.empId = empId;
			this.name = name;
			EmpSalary = empSalary;
			this.address = address;
		}
		public long getEmpId() {
			return empId;
		}
		public String getName() {
			return name;
		}
		public double getEmpSalary() {
			return EmpSalary;
		}
		public Address getAddress() {
			return address;
		}
		
}
