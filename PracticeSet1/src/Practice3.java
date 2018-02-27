
//How to reverse an array?
import java.util.Scanner;

public class Practice3 {
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
		System.out.println("The reversed array is:");

		for (i = 0; i < arr.length / 2; i++) {
			int temp = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = arr[i];
			arr[i] = temp;
		}

		for (i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			System.out.print(" ");
		}
		System.out.println(" ");

		in.close();
	}
}
