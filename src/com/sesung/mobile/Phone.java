package com.sesung.mobile;

public class Phone {
	
	String brand="Samsung";  //디폴트인데 표기생략한거임
	int price;
	String color;
	int size;
	
	public Phone() {
		//디폴트 생성자 or 빈생성자 or 기본생성자->매개변수가 없는 생성자
		//클래스내에 생성자가 하나라도 없으면 컴파일러가 디폴트생성자를 하나 생성함.
		this(200);
	
	}
	
	public Phone(int price) {
		this(price, "Red");
	}
	
	public Phone(int price, String color) {  //생성자의 이름을 맘대로 바꿀 수 없기에 오버로딩 개념이 들어감.
		this(price, color, 15);
	}
	
	public Phone(int price, String color, int size) {
		this.brand="LG";
		this.price=price;
		this.color=color;
		this.size=size;
	}
	
	public void info() { //멤버메서드
		System.out.println("Phone~~");
	}
	

}
