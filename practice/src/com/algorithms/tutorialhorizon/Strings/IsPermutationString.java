package com.algorithms.tutorialhorizon.Strings;

import java.util.HashMap;
import java.util.Map;

public class IsPermutationString {
	
	private static boolean chkForRotation(String given, String pattern) {
		given = given.concat(given);
		return given.contains(pattern);
	}
	
	private static boolean chkForPermutation(String given, String pattern) {
		
		boolean isPermutation = false;
		Map<Character, Integer> m = new HashMap<>();

		if (given.length()==pattern.length()) {
			
			for (int i = 0; i < given.length(); i++) {
				char l = given.charAt(i);
				if (!m.containsKey(l)) {
					m.put(l, 1);
				} else {
					int count = m.get(l);
					m.put(l, ++count);
				}	
			}
			
			for (int i = 0; i < pattern.length(); i++) {
				char l = pattern.charAt(i);
				if (!m.containsKey(l)) {
					System.out.println("Not Permutation");
					return false;
				} else {
					int count = m.get(l);
					m.put(l, --count);
				}	
			}
			
			for (Integer value : m.values()) {
				if (value.equals(0)) {
					isPermutation = true;
				}
				else {
					isPermutation = false;
				}
			}
			
		}
				
		return isPermutation;
	}
	

	public static void main(String[] args) {
		
		String s = "abc4defffz";
		String s2 = "fza5dbfecf";
		
		System.out.println(chkForPermutation(s, s2));

	}

}
