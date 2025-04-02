package com.ashmita.hashing;

import java.util.HashMap;
import java.util.Map;

public class TraverseAHashMap {

	public static void main(String[] args) {
		HashMap<String, Integer> hmap = new HashMap<>();
		hmap.put("gfg", 10);
		hmap.put("ide", 11);
		hmap.put("courses", 12);

		for (Map.Entry<String, Integer> m : hmap.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		if (hmap.containsKey("ide")) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		hmap.remove("ide");
		System.out.println(hmap.size());

	}

}
