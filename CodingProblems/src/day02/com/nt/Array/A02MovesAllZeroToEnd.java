package day02.com.nt.Array;

public class A02MovesAllZeroToEnd {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 0, 3, 4, 0, 5, 0, 6, 0 };

		int i = 0;
		// Move all non-zero elements to the front
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] != 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
			}
		}

		// Print the array
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

}
