package com.sesung.mod;

public class Member {
	private String name;
	private int age;
	private double muge;
	private double ki;

	//생성자 두개. 하나는 디폴트 생성자. 회원정보를 매개변수로 받는 생성자.
	public Member() {}

	public Member(String name, int age, double muge, double ki) {
		if(age>0 && age<120) {
			this.age=age;
		}else {
			this.age=25;
		}
		this.name=name;
		this.ki=ki;
		this.muge=muge;	
	}

	public void setAge(int age) {
		if(age>0 && age<120) {
			this.age=age;
		}else {
			this.age=25;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMuge() {
		return muge;
	}

	public void setMuge(double muge) {
		this.muge = muge;
	}

	public double getKi() {
		return ki;
	}

	public void setKi(double ki) {
		this.ki = ki;
	}

	public int getAge() {
		if(age<0 && age>120) {
			this.age=25;
		}
		return this.age;		

	}


	public void check() {
		//자기 키-100 한 결과물에 *0.95 가 자기 몸무게보다 작다면 비만출력. 반대라면 저체중  같다면 표준
		double result = (this.ki-100)*0.95;
		if(result==this.muge) {
			System.out.println("표준");
		}else if(result<this.muge) {
			System.out.println("비만");
		}else {
			System.out.println("저체중");
		}

	}

}
