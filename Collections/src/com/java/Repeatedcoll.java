package com.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repeatedcoll {
	public static void main(String[] args) {

		String A = "what you think what you become";
		String[] split = A.split(" ");

		Map<String, Integer> X = new HashMap<>();
		for (String a : split) {
			if (X.containsKey(a)) {
				Integer w = X.get(a);
				X.put(a, w + 1);

			} else {
				X.put(a, 1);

			}

		}

		Set<Entry<String, Integer>> entrySet = X.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println(entry);

			}

		}

	}

}
