package com.task;

public class Task_Programs {
	public static void main(String[] args) {
		String s = "Hello Java Hello World  ";

		int full_length = s.length();
		int afterreplace = s.replace("o", "").length();

		int count = full_length - afterreplace;

		System.out.println(count);

	}

}
