package com.algorithms.tutorialhorizon.Strings;

public class BracketCheck {
	
	public boolean chkBrackets(String s) {
		int result=0;
		result = s.charAt(0);
		for (int i = 1; i < s.length(); i++) {
			result = result ^ s.charAt(i);
		}
		System.out.println(result);
		System.out.println('}'^'{'^'}'^'{');
		
		return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "{}";
		String a2 ="{{}}{}";
		String x1 = "{{{{}}}}{}{}{}{}{}{}{}{}{}{}{{{}}}";
		String x2 = "{{{{}}}}{}{}{}{{}{}{}{}{}{}{}{{{}}}";
		String x3 = "{}{";
		String x4 = "}{";
		String x5 = "{{{{{{{{}}}}}}}}";
		
		BracketCheck b = new BracketCheck();
		
		b.chkBrackets(a2);

	}

}
