package com.example.jenkins.jenkins;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestJavaCalcApp {

	@Test
	public void AddTest() {
		JavaCalcApp javacalcapp = new JavaCalcApp();
		assertEquals(10,javacalcapp.addNumbers(6, 4));
	}
	
	@Test
	public void subTest() {
		JavaCalcApp javacalcapp = new JavaCalcApp();
		assertEquals(10,javacalcapp.subtractNumbers(20, 10));
	}

}
