package com.stack;

import java.util.Vector;

public class VectorCollection {
//vector is a legacy class
	
	public static void main(String[] args) {
		Vector<Integer> vc = new Vector<Integer>();
		Vector<Integer> vc1 = new Vector<Integer>();
		/*
		 * add() 	
		 * It is used to append the specified element 
		 * in the given vector.
		*/
		
		for(int i=1;i<=10;i++) {
			vc.addElement(i*10);
		}
		System.out.println(vc);
		
		int capBef = vc.capacity();
		System.out.println("Capacity before:: "+capBef);
		for(int i=11;i<=22;i++) {
			vc.addElement(i*10);
		}
		int capAft = vc.capacity();
		System.out.println(vc);
		System.out.println("Capacity After:: "+capAft);
		
		for(int i=23;i<=50;i++) {
			vc1.addElement(i*10);
		}
		vc.addAll(vc1);
		System.out.println(vc);
		System.out.println("Capacity After:: "+capAft);
		int size = vc.size();
		System.out.println(size);
		
		
	}
}
