package com.linkedlist;

import java.util.ArrayList;
import java.util.Random;

public class Second {
public static void main(String[] args) {
	ArrayList list = new ArrayList();
	list.add("TV");
	list.add("AC");
	list.add("Mobile");
	list.add("Better Luck Next Time");
	Random rn = new Random();
	int ind = rn.nextInt(list.size());
	System.out.println(list.get(ind));
}
}
