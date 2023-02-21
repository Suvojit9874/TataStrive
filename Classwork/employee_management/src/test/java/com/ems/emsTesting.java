package com.ems;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.ems.entity.Employee;
import com.ems.exception.GlobalException;
import com.ems.service.EmployeeService;
@TestMethodOrder(value=org.junit.jupiter.api.MethodOrderer.OrderAnnotation.class)
class emsTesting {
	EmployeeService empService;
	@BeforeEach
	void init() {
		empService=new EmployeeService();
	}
	@AfterEach
	void cleaner() {
		empService=null;
		System.out.println("Garbage collected");
	}
	@Test
	@DisplayName("Test for Add Employee")
	@Order(1)
	public void addEmployeeTest(){
		empService.addEmployee(101,"Suvojit", 400000, "kolkata","india");
		empService.addEmployee(102,"Argha", 160000, "kolkata","india");
		assertEquals(2, empService.lengthOfList());
	}
	@Test
	@DisplayName("Test for Display Employee")
	@Order(value = 2)
	public void displayAllTest() {
		empService.addEmployee(101,"Suvojit", 400000, "kolkata","india");
		assertThat(empService.displayAll()).isNotNull();
	}
	@Test
	@DisplayName("Test for Display By Id")
	@Order(value = 3)
	public void displayByIDTest() throws GlobalException {
		empService.addEmployee(101,"Suvojit", 400000, "kolkata","india");
		Employee e =empService.displayById(101);
//		assertEquals(101, e.getEmpId());
		assertThat(e.getName()).isEqualTo("Suvojit");
	}
}
