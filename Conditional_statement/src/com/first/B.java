package com.first;

public class B {
// Switch Statement
	
	public static void main(String[] args) {
		System.out.println("# Block 1 #");
		switch(1) {
		case 1 : 
			System.out.println("Case 1"); 
			break;
		case 2:
			System.out.println("Case 2");
			break;
		default:
			System.out.println("Default");
		}
		System.out.println("# Block 2 #");
		System.out.println("#####################");
		switch (6) {
		case 6 :
			System.out.println("Case 1");
		case 5:
			System.out.println("Case 2");
			break;
		default:
			System.out.println("Default");
		}
		System.out.println("# Block 3 #");
		System.out.println("#####################");
		switch (7) {
		case 7 :
			System.out.println("Case 1");
		case 6:
			System.out.println("Case 2");
		default:
			System.out.println("Default");
		}
	}
}
