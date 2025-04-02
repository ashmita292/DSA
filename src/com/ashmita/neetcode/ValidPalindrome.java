package com.ashmita.neetcode;

/**
 * 
 * @author User 
 * Use two pointer approach 
 * TC: O(N) 
 * AS: O(1)
 *
 */

public class ValidPalindrome {

	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";
		Boolean ans = isPalindrome(s);
		System.out.println(ans);
	}

	private static Boolean isPalindrome(String s) {
		int left = 0;
		int right = s.length() - 1;
		while (left < right) {
			// moving the pointers forward if there is any special characters
			while (left < right && !Character.isLetterOrDigit(s.charAt(left)))
				left++;
			while (left < right && !Character.isLetterOrDigit(s.charAt(right)))
				right--;
			if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right)))
				return false;
			left++;
			right--;
		}
		return true;
	}

}
