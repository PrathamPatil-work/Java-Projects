package com.arrayList;

import java.util.Iterator;
import java.util.Scanner;

public class Operations {
public static void main(String[] args) {
	Product pd = new Product("Apple",100);
	Product pd1 = new Product("Mango",200);
	Product pd2 = new Product("Banana",300);
	Product pd3 = new Product("Pear",400);
	Product pd4 = new Product("Watermelon",500);
	Product pd5 = new Product("Kiwi",1000000);
	Cart ca = new Cart();
	ca.addItems(pd);
	ca.addItems(pd1);
	ca.addItems(pd2);
	ca.addItems(pd3);
	ca.addItems(pd4);
	ca.addItems(pd5);
	ca.displayItem();
	ca.searchItemAndRemove("apple");
	ca.displayItem();
	
	
   }
}