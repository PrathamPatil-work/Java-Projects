package com.stack;

import java.util.ArrayList;
import java.util.HashSet;

public class Hashset {
	public static void main(String[] args) {
		ArrayList<Integer> as = new ArrayList<Integer>();
		as.add(100);
		as.add(200);
		as.add(300);
		as.add(400);
		as.add(500);
		as.add(null);
		as.add(null);
		System.out.println(as);
		
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(5);
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
//		hs.add(5);
//		hs.add(5);
		hs.add(null);
		hs.add(null);
		System.out.println(hs);
		
		hs.addAll(as);
		System.out.println(hs);
		hs.removeAll(as);
		System.out.println(hs.retainAll(as));
		System.out.println(hs);
		
		
		
	}
}
