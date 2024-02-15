package com.a;

public class Throw {
public static void main(String[] args) {
//	throw new ArithmeticException();
//	If we want to intentionally throw an exception we use throw keyword.
//	How can we handle this exception
	try {
		throw new Pratham("message");
	}catch(RuntimeException e) {
		System.out.println("Handling Exception");
	}
}
}
