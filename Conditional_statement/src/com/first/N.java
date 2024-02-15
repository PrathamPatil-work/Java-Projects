package com.first;

public class N {
	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		for (i=0 ; i<=20;i++) {
			if (i % 2== 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}
}
