package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

class calTest {
	calculator cal;
@BeforeAll
public static void beforeAll() {
	System.out.println("BeforeAll : this will execute before all test cases");
}
@AfterAll
public static void afterAll() {
	System.out.println("AfterAll : this will execute after all test cases");
}
@BeforeEach
void init() {
	System.out.println("Creating object");
	cal=new calculator();
}
@AfterEach
void cleanup() {
	System.out.println("cleaning up....");
	cal=null;
}
	@Test
	@DisplayName("Test case for Addition")
	public void testAdd() {

		assertEquals(30, cal.Addition(10, 20));
	}
	
	@Test
	@DisplayName("Test case for subtraction")
	public void testSub() {

		assertEquals(10, cal.subtraction(30, 20));
	}
	
	@Test
	@DisplayName("Test case for multiplication")
	@EnabledOnOs(value = {OS.WINDOWS,OS.LINUX})
	public void testmulti() {
		assertEquals(10,cal.multiplication(5, 2));
	}
	
	@Test
	
	@DisplayName("Test case for factorial")
	@DisabledOnOs(value= {OS.MAC})
	@EnabledForJreRange(min=JRE.JAVA_11,max=JRE.JAVA_17)
	@DisabledOnJre(value= {JRE.JAVA_18})
	public void testfact() {

		assertEquals(120, cal.factorial(5));
	}
}
