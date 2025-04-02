package com.ashmita.neetcode;
/**
 * 
 * @author User
 * TC: O(N) , where n is the length of the string
 * AS: O(1),since charCount array is of fixed size 26 and not gradually increasing
 *
 */
public class ValidAnagram {

	public static void main(String[] args) {
		String s ="rat", c="tar";
		boolean ans = validAnagram(s, c);
		if (ans)
			System.out.println("Valid Anagram");
		else
			System.out.println("Not Valid Anagram");
	}

	private static boolean validAnagram(String s, String c) {
		if(s.length() != c.length()) return false;
		int[] charCounts = new int[26];
		for(int i=0; i<s.length(); i++) {
			charCounts[s.charAt(i)-'a']++;
			charCounts[c.charAt(i)-'a']--;
		}
		
		for(int count : charCounts) {
			if(count != 0) {
				return false;
			}
		}
		return true;
	}

}
