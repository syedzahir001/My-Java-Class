package com.java;

public class Nested1 {
	public static void main(String[] args) {
		int a = 6;
		int b = 2;
		for (int i = 4; i <= a; i++) {
			for (int j = 1; j <=b  ; j++ ) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
