package com.java;

public class String_Builder {
	public static void main(String[] args) {
		
		StringBuilder a = new StringBuilder("Hello");
		System.out.println(a);
		System.out.println(System.identityHashCode(a));
		
		StringBuilder a1 = new StringBuilder("Hello");
		System.out.println(a1);
		System.out.println(System.identityHashCode(a1));
		
		StringBuilder append = a.append(a1);
		System.out.println(append);
		System.out.println(System.identityHashCode(append));
		
		
	}

}
