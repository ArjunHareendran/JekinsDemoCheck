package com.deloitte.demo;

public class Calculator {

	public int sum(int a, int b) {
		return a + b;
	}

	public int mul(int a, int b) {
		return a * b;
	}

	
	public int sub(int a, int b) {

		if (a > b)
			return a - b ;
		else
			return b - a;
	}

}
