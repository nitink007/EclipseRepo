package rnd;

import java.util.ArrayList;

public class SumOfPair {
	
	public static ArrayList<Integer> getPair(int[] arr, int n) {
		int left = 0;
		int right = arr.length-1;
		ArrayList<Integer> pair = new ArrayList<>();
		int sum;
		
		while (left<right) {
			
			sum = arr[left]+arr[right];
			
			System.out.println(sum);
			
			int p1 = arr[left];
			int p2 = arr[right];
			if (sum==n) {
				pair.add(p1);
				pair.add(p2);
				left++;
				right--;
			} else if (sum<n) {
				left++;
			} else if (sum>n) {
				right--;
			}
			
		}
		return pair;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,5,9,16,27,34,35,56,78};
		ArrayList<Integer> pairs = 
		getPair(arr, 83);
		
		for (Integer p : pairs) {
			System.out.print(p.toString()+",");
		}

	}

}
