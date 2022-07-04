package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Ittrator {

	public static void main(String[] args) {
		List<Object> X = new ArrayList<>();

		X.add(25);
		X.add(30);
		X.add(40);
		X.add("hello");
		System.out.println(X);

		ListIterator list = X.listIterator();

		Object next = list.next();
		System.out.println(next);

		Object next2 = list.next();
		System.out.println(next2);

		while (list.hasNext()) {
			System.out.println(list.next());
		}
		
		while (list.hasPrevious()) {
			System.out.println(list.previous());
		}
	}
	
	

}
