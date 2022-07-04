package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Collection_set1 {
	public static void main(String[] args) {
		Set<Object> B = new TreeSet<Object>();
		
		
		List<Integer> A = new ArrayList<Integer>();
		Arra
		A.add(20);
		A.add(24);
		A.add(40);
		A.add(23);
		A.add(67);
		System.out.println(A);
		
		Collections.sort(A);
		System.out.println(A);
		
		Collections.sort(A, Collections.reverseOrder());
		System.out.println(A);
		
		
		
	}
	
	

}