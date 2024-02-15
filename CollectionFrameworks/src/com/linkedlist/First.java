package com.linkedlist;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class First {
public static void main(String[] args) {
	LinkedList<Integer> ab = new LinkedList<>();
	
	ab.add(100);
	ab.add(200);
	ab.add(300);
	ab.add(400);
	ab.add(500);
	
//	System.out.println(ab);
	
	Random rn = new Random();
	int index = rn.nextInt(ab.size());
	System.out.println(ab.get(index));
	
//	Collection is an interface but when we use collections it is a class.
	Collections.shuffle(ab,rn);
	System.out.println(ab);
	
//	OTP
	int otp = rn.nextInt(10000,99999);
	System.out.println(otp);
	
	
	
}
}
