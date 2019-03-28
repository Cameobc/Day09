package com.sesung.mobile;

import java.util.Scanner;

public class MobileMain {
	public static void main(String[] args) {
		PhoneView pv = new PhoneView();
		Scanner sc = new Scanner(System.in);  //new 뒤에가 생성자
		
		Pad pad = new Pad("Apple", 200);
		Pad pad2 = new Pad();
		
		Phone p1 = new Phone();
		Phone p2 = new Phone(100);
		Phone p3 = new Phone(150, "Gold");
		Phone p4 = new Phone(80, "White", 10);
	
		pv.view(p1);
		pv.view(p2);
		pv.view(p3);
		pv.view(p4);
		
	}

}
