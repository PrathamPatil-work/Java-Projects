package com.first;

import java.util.Scanner;

public class V {
	
	public void addition(int i, int j) {
		System.out.println(i+j);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
public static void main(String[] args) {
	int i, j,k;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number:\n1.Addition\n2.Substraction\n3.Multiplication\n4.Division ");
	System.out.println("Operation to perform::  ");
	String op = sc.nextLine();
	System.out.print("Enter Number 1: ");
	i = sc.nextInt();
	System.out.print("Enter Number 2: ");
	j = sc.nextInt();
	switch(op) {
	case "+":
		
		break;
	case "-":
		k = i-j;
		System.out.print("The Subtraction of Numbers is: "+ k);
		break;
	case "*":
		k = i*j;
		System.out.print("The Multiplication of Numbers is: "+ k);
		break;
	case "/":
		k = i/j;
		System.out.print("The Division of Numbers is: "+ k);
		break;
	default:
		System.out.print("Please Enter Valid Number");
	}
}
}
