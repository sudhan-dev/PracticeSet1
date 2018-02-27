
//How to sort an array and search an element inside it?

import java.util.Arrays;
import java.util.Scanner;

public class Practice1 {
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
		Arrays.sort(arr);
		System.out.println("Sorted array is:");
		for (i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			System.out.print(" ");
		}

		System.out.println("\nEnter the element to be searched");
		int temp = in.nextInt();
		boolean flag = false;
		for (i = 0; i < arr.length; i++) {
			if (temp == arr[i]) {
				flag = true;
				break;
			}
		}
		if (flag == true)
			System.out.println("Element found");
		else
			System.out.println("Element not found");

		in.close();

	}

}
