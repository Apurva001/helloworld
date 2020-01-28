package com.example.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void test_add() {
		Calculator calc = new Calculator();
		assertEquals(2, calc.add(1, 1), "The output should be the sum of the two arguments");
	}
	
	@Test
	void test_add1() {
		Calculator calc = new Calculator();
		assertEquals(-1, calc.add(0, -1), "The output should be the sum of the two arguments");
	}
	
	@Test
	void test_add2() {
		Calculator calc = new Calculator();
		assertEquals(-4, calc.add(-2, -2), "The output should be the sum of the two arguments");
	}
	
	@Test
	void test_multiply1() {
		Calculator calc = new Calculator();
		assertEquals(2, calc.multiply(1, 2), "The output should be the multiplication of the two arguments");
	}
	@Test
	void test_multiply2() {
		Calculator calc = new Calculator();
		assertEquals(-1, calc.multiply(1, -1), "The output should be the multiplication of the two arguments");
	}
	@Test
	void test_multiply3() {
		Calculator calc = new Calculator();
		assertEquals(1, calc.multiply(-1, -1), "The output should be the multiplication of the two arguments");
	}

}
