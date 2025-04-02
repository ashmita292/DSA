package com.ashmita.goldmannSachs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 
 * @author User
 * abcabd => a2b2cd
 * TC: O(N)
 * AS: O(N)
 *
 */
public class RemoveRepeatedCharacterFromString {

	public static void main(String[] args) {
		String input = "abcabd";
		String ans = compressString(input);
		System.out.println(ans);
	}

	private static String compressString(String input) {
		Map<Character, Integer> charCount = new LinkedHashMap<>();
		for(char ch : input.toCharArray()) {
			charCount.put(ch, charCount.getOrDefault(ch, 0)+1);
		}
		StringBuilder result = new StringBuilder();
		for(Map.Entry<Character, Integer> entry :charCount.entrySet()) {
			if(entry.getValue()>1)
				result.append(entry.getKey()).append(entry.getValue());
			else
				result.append(entry.getKey());
		}
		return result.toString();
	}

}
