package com.first;

public class K {
public static void main(String[] args) {
	
	int marks = 35;
	if (marks > 75){
		System.out.println("Distinction");
	}else if(marks >= 60 && marks <75) {
		System.out.println("First Class");
	}else if(marks >= 50 && marks <60) {
		System.out.println("Second Class");
	}else if( marks >= 35 && marks < 50) {
		System.out.println("Pass");
	}else {
		System.out.println("Fail");
	}
	
}
}
