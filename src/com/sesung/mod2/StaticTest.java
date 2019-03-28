package com.sesung.mod2;

public class StaticTest {
	
	public int num = 10;  //멤버변수
	public static int num2 = 20;
	
	public void instanceMethod() {
		System.out.println("멤버메서드");
	}
	
	public static void staticMethod() {
		System.out.println("클래스 메서드");
	}

}
