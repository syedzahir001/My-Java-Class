package com.task;

public class Reverse_String {
	
	public static void main(String[] args) {
		
		String s = "ABCD";
		
		String r = "";
		
		int length = s.length();  // 4 
		
		for (int i = length-1 ; i >= 0 ; i--) { // 3 2 1 0 -1
			
			r = r+s.charAt(i); // DCBA
			
		} 
		System.out.println(r);
	}

}
