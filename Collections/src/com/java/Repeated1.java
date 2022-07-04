package com.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repeated1 {

	public static void main(String[] args) {
		String U = "what is your name what is your country";

		String[] split = U.split(" ");

		Map<String, Integer> K = new HashMap<>();

		for (String b : split) {

			if (K.containsKey(b)) {
				Integer r = K.get(b);
				K.put(b, r + 1);

			} else {
				K.put(b, 1);

			}

		}
		Set<Entry<String, Integer>> entrySet = K.entrySet();
		for (Entry<String, Integer> entry : entrySet) {

			if (entry.getValue() > 1) {
				System.out.println(entry);
			}
		}

	}

}
