
//How to sort an array and insert an element inside it?
import java.util.Arrays;
import java.util.Scanner;

public class Practice2 {
	public static void main(String args[]) {
		int i;
		int arr[] = new int[10];
		Scanner in = new Scanner(System.in);
		System.out.println("Enter array elements:");
		for (i = 0; i < arr.length - 1; i++) {
			arr[i] = in.nextInt();
		}
		System.out.println("Array elements are:");
		for (i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			System.out.print(" ");
		}
		System.out.println(" ");

		Arrays.sort(arr);
		System.out.println(" ");
		System.out.println("Sorted array is:");
		for (i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			System.out.print(" ");
		}
		System.out.println("Enter new element into the array:");
		arr[arr.length - 1] = in.nextInt();
		Arrays.sort(arr);
		System.out.println("New array is:");
		for (i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			System.out.print(" ");
		}

		in.close();
	}

}
