package com.ashmita.string;

/*
 * 
 * Form a hashmap where 
 * key = hash of each word (same words have the same hash key) 
 * value = index of the res arrayList where to insert the group of words
 * 
 * Solution: 
 * The idea is to that if two strings are anagrams of each other, 
 * then the frequency of all characters in both strings will always 
 * be the same. So, we can maintain a hash map with the count of 
 * characters as keys and the index of the anagram group in the 
 * result array as the value. For each word, we can first construct 
 * a frequency array of size 26 to store the frequency of each 
 * character in the word. Then, we can append the frequency of each 
 * character separated by a delimiter, say ‘$’ to form the key for hash map. 
 * 
 * TC: O(N*K) where n is the number of words and k is the maximum length of a word
 * AS: O(N*K)
 * 
 */
import java.util.ArrayList;
import java.util.HashMap;

public class GroupAnagram {
	public static final int MAX_CHAR = 26;

	public static void main(String[] args) {
		String[] arr = { "act", "god", "cat", "dog", "tac" };
		ArrayList<ArrayList<String>> res = groupAnagram(arr);
		for (ArrayList<String> group : res) {
			for (String word : group) {
				System.out.print(word + " ");
			}
			System.out.println();
		}
	}

	private static ArrayList<ArrayList<String>> groupAnagram(String[] arr) {
		ArrayList<ArrayList<String>> res = new ArrayList<>();
		HashMap<String, Integer> hmap = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			String key = getHash(arr[i]);
			if (!hmap.containsKey(key)) {
				hmap.put(key, res.size());
				res.add(new ArrayList<>());
			}
			res.get(hmap.get(key)).add(arr[i]);
		}
		return res;
	}

	private static String getHash(String word) {
		StringBuilder hash = new StringBuilder();
		int[] freq = new int[MAX_CHAR];
		for (char ch : word.toCharArray()) {
			freq[ch - 'a']++;
		}
		for (int i = 0; i < MAX_CHAR; i++) {
			hash.append(freq[i]);
			hash.append("$");
		}
		return hash.toString();
	}

}
