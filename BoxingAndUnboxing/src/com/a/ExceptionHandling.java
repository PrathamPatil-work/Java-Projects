package com.a;

public class ExceptionHandling {
	public static void main(String[] args) {
////		System.out.println(5/0);
//	int a = 10;
//	int b =0;
//	int c = a/b;
//	System.out.println(c);
//	
//	try {
//		int c = a/b;
//		System.out.println(c);
//	}catch(ArrayIndexOutOfBoundsException e) {
//		System.out.println("ArrayIndexOutOfBounds");
//	}catch(Exception  e) {
//		System.out.println("Exceptions");
//	}
		int[] a = {10,20,30};
		
		try {
			System.out.println(a[0]);
			System.out.println(a[1]);
			System.out.println(a[2]);
			System.out.println(a[3]);
			System.out.println("Next Code 2");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds");
		}catch(Exception  e) {
			System.out.println("Exceptions");
		}finally {
			System.out.println("Next Code 1");
		}
		
	
//	The classes which directly extends Exception class are Compile time Exception.
//		The classes which extends RuntimeExceptions comes under Runtime Exceptions.

	
	//	Unreachable Code Exception
	/*
	try {
		int c = a/b;
		System.out.println(c);
	}catch(Exception e) {
		System.out.println("ArrayIndexOutOfBounds");
	}catch(ArrayIndexOutOfBoundsException  e) {
		System.out.println("Exceptions");
	}
	
	*/
	
	
	}
	
	
	
	
}
