package rnd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class LongestUniqueSubString {
	
	
	public String getSubString(String str) {
		int subStart;
		int subEnd;
		Map<String, Integer> m = new HashMap<String, Integer>();
		
		
		
		return str;
	}
	
    public int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0, max = 0;
        Set<Character> set = new LinkedHashSet<>();
//        Set<Character> setCpy = new LinkedHashSet<>();
        int startIndex=0;
//        int endIndex=s.length()-1;
        int endIndex=0;
        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
//            	int count = 0;
//            		System.out.println("Set contents: "+set.toString());
//            		System.out.println("Adding char to set: "+s.charAt(j));
                set.add(s.charAt(j++));
//                System.out.println("Set contents after addition: "+set.toString());

                
               // max = Math.max(max, set.size());
                if(max<set.size()) {
                	  startIndex=i;
                	  endIndex=j;
                	  max=set.size();
                }
				
//                System.out.println(max);
            } else {
                set.remove(s.charAt(i++));
//                System.out.println("Set contents after removal: "+set.toString());
            }
        }
        
        System.out.println(s.substring(startIndex, endIndex));
        //System.out.println(set.toString());
//        char[] c = null;
//        int k=0;
//        for (Character character : set) {
//			c[k++] = character;
//		}
//        System.out.println(Arrays.toString(c));
    
        return max;
    }
    
    
    static void longestSubstring(String inputString)
    {    
        
    	char[] charArray = inputString.toCharArray(); 
        
    	String longestSubstring = null;
        int longestSubstringLength = 0;
        
        LinkedHashMap<Character, Integer> charPosMap = new LinkedHashMap<Character, Integer>();
        
        for (int i = 0; i < charArray.length; i++) 
        {
            char ch = charArray[i];
            if(!charPosMap.containsKey(ch))
            {
                charPosMap.put(ch, i);
            }
            else
            {    
                i = charPosMap.get(ch);
                charPosMap.clear();
            }
             
            if(charPosMap.size() > longestSubstringLength)
            {
                longestSubstringLength = charPosMap.size();
                System.out.println(charPosMap.keySet().toString());                
                longestSubstring = charPosMap.keySet().toString();
            }
        }
         
        System.out.println("Input String : "+inputString);
         
        System.out.println("The longest substring : "+longestSubstring);
         
        System.out.println("The longest Substring Length : "+longestSubstringLength);
    }
    

	public static void main(String[] args) {
		
		LongestUniqueSubString l = new LongestUniqueSubString();
		
//		longestSubstring("axpblmnbcfghij");
		
//		System.out.println(l.lengthOfLongestSubstring("abcdbdabcabcdef"));
		System.out.println(l.lengthOfLongestSubstring("axpblmnbcfghij"));
		
		
	}

}
