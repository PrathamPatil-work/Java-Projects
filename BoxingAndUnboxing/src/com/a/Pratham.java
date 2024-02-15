package com.a;

public class Pratham extends RuntimeException {
	/*
	 * This class is used to 
	 * 
	 * 
	 * */
	Pratham(String message){
		super(message);
		
	}
	Pratham(){
		throw new ArithmeticException();
	}
}
