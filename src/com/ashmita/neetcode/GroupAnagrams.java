package com.ashmita.neetcode;
/**
 * TC: O(N)
 * AS: O(N)
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

	public static void main(String[] args) {
		String[]  in = {"abc", "bca", "eat", "ate", "cba", "bat"};
		List<List<String>> res = groupAnagram(in);
		for(List<String> r : res) {
			System.out.println(r);
		}
		
	}

	private static List<List<String>> groupAnagram(String[] strs) {
		if(strs.length == 0)return null;
		Map<String, List> hmap = new HashMap<>();
		int[] count = new int[26];
		for(String str : strs) {
			Arrays.fill(count, 0);
			for(char ch : str.toCharArray()) {
				count[ch-'a']++;
			}
			StringBuilder sb = new StringBuilder();
			for(int i=0; i<26; i++) {
				sb.append("#");
				sb.append(count[i]);
			}
			String key = sb.toString();
			if(!hmap.containsKey(key)) {
				hmap.put(key, new ArrayList<>());
			}
			hmap.get(key).add(str);
		}
		return new ArrayList(hmap.values());
	}

}
