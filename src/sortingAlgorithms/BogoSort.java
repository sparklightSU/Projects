package sortingAlgorithms;

import java.util.Random;

public class BogoSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {9,8,7,6,5,4,3,2,1};
		sort(array);
		for(int i = 0; i < array.length; i++)
			System.out.println(array[i]);
	}
	public static void sort(int[] arr) {
		while(!sorted(arr))
			shuffle(arr);
	}
	public static boolean sorted(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i+1])
				return false;
		}
		return true;
	}
	public static void shuffle(int[] arr) {
		Random rnd = new Random();
		for(int i = 0; i < 1000; i++) {
			int r1 = rnd.nextInt(arr.length);
			int r2 = rnd.nextInt(arr.length);
			int temp = arr[r1];
			arr[r1] = arr[r2];
			arr[r2] = temp;
		}
	}

}
