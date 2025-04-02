package com.ashmita.neetcode;
/**
 * Sliding window + 2 pointer approach
 * TC: O(N)
 * AS: O(N)
 */
import java.util.HashSet;

public class LongestSubStringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		String s = "abcabcbb";
		int ans = lengthOfLongestSubstring(s);
		System.out.println(ans);
	}

	private static int lengthOfLongestSubstring(String s) {
		if(s==null || s.isEmpty()) return 0;
		if(s.length()==1) return 1;
		int left =0 ;
		int right =0;
		int ans = 0;
		HashSet<Character> hset = new HashSet<>();
		while(right< s.length()) {
			char c = s.charAt(right);
			while(hset.contains(c)) {
				hset.remove(s.charAt(left));
				left++;
			}
			hset.add(c);
			ans = Math.max(ans, right-left+1);
			right++;
		}
		return ans;
	}

}
