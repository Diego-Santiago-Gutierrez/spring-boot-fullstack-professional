package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//@SpringBootTest
class DemoApplicationTests {

	Calculator underTest = new Calculator();
	@Test
	void contextLoads() {
		int num1 = 30;
		int num2 = 20;

		int expected = 50;

		int sum = underTest.addNumbers(30,20);

		assertThat(expected).isEqualTo(sum);
	}

	static class Calculator{
		public int addNumbers(int a, int b){
			return a+b;
		}
	}
}
