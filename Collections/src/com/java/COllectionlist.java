package com.java;

import java.util.ArrayList;
import java.util.List;

public class COllectionlist {
	
	public static void main(String[] args) {
		
		List<Object> S = new ArrayList<Object>();
		List<Object> F = new ArrayList<Object>();
		
		
//		S.add(25);
//		S.add(35);
//		S.add(45);
//		S.add("Collect");
//		S.add(50);
//		
//		F.add(25);
//		F.add(34);
//		F.add(50);
		
//		F.addAll(S);
//		System.out.println(F);
//		
//		S.retainAll(F);
//		System.out.println(S);
//		
//		S.remove(F);
//		System.out.println(S);
		
		System.out.println(S);
		
		Object object = S.get(3);
		System.out.println(object);
		
		S.add(4, 60);
		System.out.println(S);
		
		
		 S.set(2, 40);
		System.out.println(S);
		
		S.remove(2);
		System.out.println(S);
		
		boolean contains = S.contains('e');
		System.out.println(contains);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
