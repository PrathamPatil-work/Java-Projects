package com.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class A {
public static void main(String[] args) {

	/* 
	 * Insertion in arrayList is harder as for eg default capacity of 
	 * arraylist is 10 if we need to add 11th element the list of 10 elements
	 * is copied to a new array and then the array size is increased by 10.
	 * That is why when inserting an element it becomes time consuming so we dont 
	 * use arrayList.
	*/
	char str = ' ';
	
	ArrayList<Integer> list = new ArrayList<Integer>();
	for(int i = 1;i<=20;i++) {
		list.add((i*i));
	}
//	System.out.println(list);
//	list.remove(0);
//	System.out.println("Removing Element at index 0:: "+list);
//	list.set(0, 20);
//	System.out.println(list);
//	//	Array list uses dynamic array.
//	//	In Array list we can store any type of dat+a.
//	//	We can also store a whole array inside an arrayList
//	/*
//	ArrayList a1 = new ArrayList();
//	a1.add(true);
//	a1.add(false);
//	a1.add(1);
//	a1.add(2);
//	
//	
//	list.add(a1);
//	System.out.println(list);
//	*/
	ArrayList list2 = new ArrayList(); // This is a non generic collection
	ArrayList<Integer> list3 = new ArrayList<Integer>(); // This is a generic collection. 
//	We can add null values inside a null values;
	
	
	
	Iterator itr = list.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
	ListIterator li = list.listIterator();
	while(li.hasPrevious()) {
		System.out.print(li.previous()+" ");
	}
}
}
