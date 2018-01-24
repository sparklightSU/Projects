package sortingAlgorithms;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {9,8,7,6,5,4,3,2,1};
		sort(array);
		for(int i = 0; i < array.length; i++)
			System.out.println(array[i]);

	}
	public static void sort(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			int index = i;
			
			//Find smallest element in array
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[j] < arr[index])
					index = j;
					
			}
			//Swap minimum element with first
			int temp = arr[index];
			arr[index] = arr[i];
			arr[i] = temp;
		}
	}

}
