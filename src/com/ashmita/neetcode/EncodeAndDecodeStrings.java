package com.ashmita.neetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncodeAndDecodeStrings {

	public static void main(String[] args) {
		List<String> st = Arrays.asList("abc" , "ba", "ab");
		String encodeString = encode(st);
//		System.out.println(encodeString);
		List<String> decodeString = decode(encodeString);
		System.out.println(decodeString);
	}

	private static List<String> decode(String s) {
		if(s.equals(Character.toString((char)258)))
			return new ArrayList<>();
		String seperator = Character.toString((char)257);
		return Arrays.asList(s.split(seperator, -1));
	}

	private static String encode(List<String> strs) {
		if(strs.size()==0)
			return Character.toString((char)258);
		String seperator = Character.toString((char)257);
		StringBuilder sb = new StringBuilder();
		for(String str: strs) {
			sb.append(str);
			sb.append(seperator);
		}
		sb.deleteCharAt(sb.length()-1);
		return sb.toString();
	}

}
