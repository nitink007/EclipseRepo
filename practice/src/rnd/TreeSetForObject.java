package rnd;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetForObject {
	
	

	public static void main(String[] args) {
		Set<Object> tSet = new TreeSet<>();
		int a = 10;
		tSet.add(a);
		tSet.add("my");
		tSet.add(4.55);
		tSet.add(15);
		
		Iterator<Object> itr = tSet.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
