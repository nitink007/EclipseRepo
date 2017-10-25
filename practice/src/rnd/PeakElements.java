package rnd;

import java.util.*;

public class PeakElements {
	
	static int max=0;
	
	public static ArrayList<Integer> getPeaks(int[] arr) {
		int left, center, right;
		ArrayList<Integer> peaks = new ArrayList<>();
		
		for (int i = 1; i < arr.length-1; i++) {
			left = arr[i-1];
			center = arr[i];
			right = arr[i+1];
			
			if (center>left && center>right) {
				peaks.add(center);
				if (max<center) { 
					max = center;
				}
				i++;
			} else {

			}
		}
//		Collections.max(peaks);
		Map<Character, Character> m = new HashMap<>();
		Map<Character, Character> m2 = new HashMap<>(m);
		return peaks;
	}

	public static void main(String[] args) {
//		int[] arr = {2,5,3,2,9,6,77,2,7};
		int[] arr = {1,2,3,4,5,6,7};
		System.out.println(getPeaks(arr));
		System.out.println(max);
	}

}
