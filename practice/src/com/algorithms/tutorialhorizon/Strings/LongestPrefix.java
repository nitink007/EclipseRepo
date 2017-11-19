package com.algorithms.tutorialhorizon.Strings;

import java.util.LinkedList;
import java.util.List;

public class LongestPrefix {
	
	private void longestPrefixString(String s) {
		String str[] = s.split(" ");
		int prefixLength=0;
		
		String prefix = new String(str[0]);
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str[0].length(); j++) {
				if (prefix.charAt(j)==str[j].charAt(j)) {
					prefixLength++;
				}
				
			}
			
		}
		
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
