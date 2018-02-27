
//How to remove an element of array?
import java.util.Scanner;

public class Practice7 {
	public static void main(String args[]) {
		int i, ele, j;
		int arr[] = new int[5];
		Scanner in = new Scanner(System.in);
		System.out.println("Enter array elements:");
		for (i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		System.out.println("Enter index of the element to remove:");
		ele = in.nextInt();
		for (i = 0; i < arr.length; i++) {
			if (i == ele - 1) {
				for (j = i; j < arr.length - 1; j++)
					arr[j] = arr[j + 1];
			}
		}
		System.out.println("After removing element:");
		for (i = 0; i < arr.length - 1; i++) {
			System.out.print(arr[i]);
			System.out.print(" ");
		}

		in.close();
	}
}