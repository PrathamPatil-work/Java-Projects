package com.stack;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Second {
public static void main(String[] args) {
	//	HashSet<String> hs = new HashSet();
	//	hs.add("Kbp");
	//hs.add("Name");
	//hs.add("Hello");
	//System.out.println(hs); 
		
	/*
	 * Hash set wont give an ordered list in terms of strings so we use linkedHashSet here
	 * To preserve the given order of the items.
	*/
	LinkedHashSet<String> hs = new LinkedHashSet();
	hs.add("Kbp");
	hs.add("Name");
	hs.add("Hello");
	System.out.println(hs);
	
	/*
    HashSet uses a mechanism called "Hashing" to store the elements.
    It uses a hash table data structure to store the elements.
    It contains unique elements.
    It allows storing the null values.
    It is a non-synchronized class.
    It does not provide a mechanism to maintain the insertion order. 
    So the elements will be inserted based on the Hash code.
    It is a useful mechanism for the search operation.
    But default, it uses 16 as the initial size of the hash table.
    It extends AbstractSet class and implements the Set interface.
    It also implements the Clone able and Serializable interface.
	 */
	
	/*
    It contains unique elements.
    It uses a hash table & a doubly-linked list to store & maintain the elements.
    It can have null elements.
    It provides an option set operation.
    It is non-synchronized.
    It allows an easy way to maintain the insertion order.
	 */
} 
}
