package com.java;

import java.util.ArrayList;
import java.util.List;

public class Collection1 {
	public static void main(String[] args) {
		List<Integer> a = new ArrayList<Integer>();
		a.add(50);
		a.add(25);
		a.add(45);
		a.add(55);
		System.out.println(a);

		System.out.println("Size");
		int size = a.size();
		System.out.println(size);

		System.out.println("Get");
		Integer integer = a.get(2);
		System.out.println(integer);

		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));

			System.out.println("integer");
			for (Integer B : a) {
				System.out.println(B);

			}

		}

	}

}
