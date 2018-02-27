
//How to search the minimum and the maximum element in an array?
import java.util.Scanner;

public class Practice5 {
	public static void main(String args[]) {
		int i;
		int arr[] = new int[10];
		Scanner in = new Scanner(System.in);
		System.out.println("Enter array elements:");
		for (i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		System.out.println("Array elements are:");
		for (i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			System.out.print(" ");
		}
		System.out.println(" ");
		int min = arr[0];
		int max = arr[0];
		for (i = 0; i < arr.length; i++) {
			if (min > arr[i])
				min = arr[i];
			if (max < arr[i])
				max = arr[i];

		}
		System.out.println("Minimum value is:" + min);
		System.out.println("Minimum value is:" + max);

		in.close();
	}
}
