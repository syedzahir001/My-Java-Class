package com.java;

public class Stry {
	public static void main(String[] args) {
		String a = "hello every one ";
		int length = a.length();
		System.out.println(length);
		
		boolean equals = a.equals("Hello every one ");
		System.out.println(equals);
		
		boolean equalsIgnoreCase = a.equalsIgnoreCase("Hello");
		System.out.println(equalsIgnoreCase);
		
		String upperCase = a.toUpperCase();
		System.out.println(upperCase);
		
		String lowerCase = a.toLowerCase();
		System.out.println(lowerCase);
		
		char charAt = a.charAt(4);
		System.out.println(charAt);
		
		boolean startsWith = a.startsWith(lowerCase);
		System.out.println(startsWith);
		
		boolean endsWith = a.endsWith(lowerCase);
		System.out.println(endsWith);
		
		boolean contains = a.contains(lowerCase);
		System.out.println(contains);
		
		
		
	}

}
