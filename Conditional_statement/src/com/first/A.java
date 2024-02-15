package com.first;

public class A {
	public static void main(String[] args) {
		// Block 1
		int i =10;
		if (++i == 10) {
			System.out.println("Inside if");
		}else if((i=20)<30) {
			System.out.println("Inside else if");
		}else {
			System.out.println("Inside else");
		}
		
		// Block 2
		int j = 11;
		if (j++ < 20) {
			System.out.println("Inside If");
		}else if (j < 30) {
			System.out.println("Inside Else if");
		}else {
			System.out.println("Inside Else");
		}
		
		// Block 3
		int k = 10;
		if (k<20) {
			System.out.println("Inside if");
			
		}else if ( k<20) {
			System.out.println("Inside else if");
		}else {
			System.out.println("Inside Else");
		}
	}
}
