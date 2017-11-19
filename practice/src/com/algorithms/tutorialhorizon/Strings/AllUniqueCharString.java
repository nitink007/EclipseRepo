package com.algorithms.tutorialhorizon.Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Timer;

public class AllUniqueCharString {

	
	private static boolean isUniqueCharString(String s) {
		
		boolean uniqueChars = false;
		
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			int counter=0;
			if (!m.containsKey(s.charAt(i))) {
				m.put(s.charAt(i), ++counter);
				uniqueChars = true;
			}
			else {
				uniqueChars = false;
			}
		}
		
		return uniqueChars;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "mynameiskhan";
		String s2 = "abcdef";
		
		System.out.println(isUniqueCharString(s));

	}

}
