package com.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collections {
	
	public static void main(String[] args) {
		List<Integer> a = new ArrayList<Integer>();
			a.add(20);
			a.add(35);
			a.add(45);
			a.add(56);
		System.out.println(a);	
		
		System.out.println("a.size()");
		int size = a.size();
		System.out.println(size);
		
		System.out.println("a.get(3)" );
		Integer integer = a.get(3);
		System.out.println(integer);
		
		
		for (int i = 0; i < a.size() ; i++) {
			
			System.out.println(a.get(i));
			
			for (Integer  integer2 : a) {
				System.out.println(integer2);
				
			}
			
			
		}
				
	}
	

}
