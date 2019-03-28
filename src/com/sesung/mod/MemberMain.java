package com.sesung.mod;

public class MemberMain {
	

	public static void main(String[] args) {
		Member member = new Member("suzy", 225, 88.2, 168.5);
		member.check();
		//관리 후
		
		member.setAge(1200);
		int age = member.getAge();
		System.out.println(age);
		
		
	}

}
