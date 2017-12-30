package dataStructures.sorting;

public class Sorting {
	
	static int[] arr = {1,9,2,4,3,7};
	
	public static void bubbleSort(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-i-1; j++) {
				if (arr[j]>arr[j+1]) {
					int tmp;
					tmp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}
			}
		}
		
	}

	public static void selectionSort(int[] arr) {
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("before sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		bubbleSort(arr);
		System.out.println("\nAfter sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}

	}

}
