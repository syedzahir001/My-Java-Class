package com.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Double {
	public static void main(String[] args) {
		String X = "what you think what you get ";

		String[] split = X.split(" ");

		Map<String, Integer> H = new HashMap<>();

		for (String a : split) {

			if (H.containsKey(a)) {
				Integer i = H.get(a);

				H.put(X, i + 1);

			}
			else {
				H.put(a, 1);
				
			}
			

		}
		Set<Entry<String, Integer>> entrySet = H.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			
			if (entry.getValue()>1) {
				System.out.println(entry);
				
			}
			
		}
		

	}

}
