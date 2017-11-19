package com.algorithms.tutorialhorizon.Strings;

public class ReplaceSpace {
	
	public static String replaceSpaceWith(String str, String replacement) {
		return str.replaceAll(" ", replacement);
	}
	
	public static String replaceSpaceWith(String str, String replacement, String core) {
		char str1[] = str.toCharArray();
		
		for (int i = 0; i < str1.length; i++) {
			if (str1[i]==' ') {
//				str1[i]= replacement;
			}
			
		}
		return str1.toString();
	}

	public static void main(String[] args) {
		String s = "this is my world";
		System.out.println(replaceSpaceWith(s,"%20"));

	}

}
