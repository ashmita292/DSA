package com.ashmita.neetcode;
/**
 * TC: O(N)
 * AS: O(N)
 * 
 * One approach is Sorting => TC: O(nlogn)
 * Excepted approach: Hashing
 */
import java.util.HashSet;

public class ContainsDuplicate {

	public static void main(String[] args) {
		int[] nums = { 1, 4, 3, 5, 4};
		boolean ans = containsDuplicate(nums);
		if (ans)
			System.out.println("Duplicates present");
		else
			System.out.println("Duplicates not present");
	}

	private static boolean containsDuplicate(int[] nums) {
		HashSet<Integer> hset = new HashSet<>();
		for (int num: nums) {
			if (hset.contains(num))
				return true;
			hset.add(num);
		}
		return false;
	}

}
