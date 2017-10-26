package rnd;

import java.util.LinkedHashSet;
import java.util.Set;

public class LongestSubstringFinal {
	

	
	public String getLongestSubstring(String s) {
		int i=0, j=0, max=0;
		Set<Character> set = new LinkedHashSet<>();
		int start=0;
		int end=0;
		
		while (j < s.length()) {
			if (!set.contains(s.charAt(j))) {
				set.add(s.charAt(j++));
				if (max<set.size()) {
					start = i;
					end = j;
					max = set.size();
				}
			} else {
				set.remove(s.charAt(i++));
			}
		}
		System.out.println(max);
		return s.substring(start, end);
		
	}
	

	public static void main(String[] args) {
		
		LongestSubstringFinal l = new LongestSubstringFinal();
		String lSubstring = l.getLongestSubstring("axpblmnbc");
		System.out.println(lSubstring);

	}

}
