package rnd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> l1 = new ArrayList<>();
		List<String> l2 = new ArrayList<>();
		
		l1.add("pikachu");
		l1.add("vimal");
		l1.add("nitin");
		
		l2.add("vimal");
		l2.add("nitin");
		l2.add("pikachu");
		
		System.out.println(l1.equals(l2));
		
		Collections.sort(l1);
		Collections.sort(l2);
		
		System.out.println(l1.equals(l2));
		
		
	}

}
