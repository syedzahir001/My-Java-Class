package com.java;

import java.util.ArrayList;
import java.util.List;

public class COllection2 {
	public static void main(String[] args) {
		List<Object> A = new ArrayList<>();

		A.add(25);
		A.add(2.5);
		A.add("Hello");
		A.add('S');
		A.add(25);
		A.add(35);

		System.out.println(A);
		
		Object object = A.get(4);
		System.out.println(object); 
		
		A.add(2, 4.5);
		System.out.println(A);
		
		int indexOf = A.indexOf(35);
		System.out.println(indexOf);
		
		int lastIndexOf = A.lastIndexOf(25);
		System.out.println(lastIndexOf);
		
		A.remove(3);
		System.out.println(A);
		
		boolean contains = A.contains(25);
		System.out.println(contains);
		
		A.clear();
		System.out.println(A);
		
		int size = A.size();
		System.out.println(size);
		
		
		
		

	}

}
