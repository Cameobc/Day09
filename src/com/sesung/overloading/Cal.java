package com.sesung.overloading;

public class Cal {
	
	public int plus(int a, int b, int c) {
		int sum = a+b+c;
		return sum;
	}
	
	public int plus(int a, int b) {  //method
		int sum = a+b;
		return sum;
	}
	
	public float plus(int a, float b) {
		float sum = a+b;
				return sum;
	}
	
	public float plus(float a, float b) {
		return a+b;
	}

}
