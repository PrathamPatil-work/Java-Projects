package com.stack;

import java.util.Stack;

public class StackCollection {

	
	public static <E> void main(String[] args) {
	Stack<Integer> st = new Stack();
	for(int i = 1;i<=21;i++) {
		st.push(i*10); // Used to add element 
	}
	
	System.out.println(st);
	st.pop();
	System.out.println(st); //removes the last element in the array.
	System.out.println("Top:: " +st.peek()); // returns the top most element in stack.
	
	/*
	 * public int search(Object o)
	 * Returns the 1-based position where an object is on this stack. 
	 * If the object o occurs as an item in this stack, 
	 * this method returns the distance from the top of the stack of the occurrence nearest the top of the stack;
	 *  the topmost item on the stack is considered to be at distance 1. 
	 *  The equals method is used to compare o to the items in this stack.
	 *  Parameters:
	 *  o - the desired object.
	 *  Returns:
	 *  the 1-based position from the top of the stack where the object is located; 
	 *  the return value -1 indicates that the object is not on the stack. 
	 * */
	System.out.println(st.search(40)); 
	
	System.out.println(st.capacity());
	
	st.empty();// tests if the stack is empty
	System.out.println(st);
	}
}
