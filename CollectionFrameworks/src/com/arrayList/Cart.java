package com.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Cart {
	private ArrayList<Product> list;
	public Cart() {
		this.list = new ArrayList<>();
	}
	
	public void addItems(Product pd) {
		list.add(pd);
	}
	
	public void removeItems(Product pd) {
		list.remove(pd);
	}
	
	public void displayItem() {
		for (Product arr: list) {
			System.out.println("Product [productName=" + arr.getProductName().toLowerCase() + ", price=" + arr.getPrice() + "]");
		}
	}
	public void searchItemAndRemove(String name) {
		Iterator itr = list.iterator();
		Product pd = (Product) itr.next();
		while(itr.hasNext()) {
			if(name==pd.getProductName()) {	
				itr.remove();
			}
			
		}
		
	}
}
