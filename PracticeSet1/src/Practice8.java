
//How to compare two arrays?
import java.util.Arrays;
import java.util.Scanner;

public class Practice8 {
	public static void main(String args[]) {
		int i;
		boolean result;
		int arr[] = new int[5];
		int arrn[] = new int[5];
		Scanner in = new Scanner(System.in);
		System.out.println("Enter first array elements:");
		for (i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		System.out.println("Enter second array elements:");
		for (i = 0; i < arrn.length; i++) {
			arrn[i] = in.nextInt();
		}
		result = Arrays.equals(arr, arrn);
		if (result == true)
			System.out.println("Arrays match");
		else
			System.out.println("Arrays do not match");

		in.close();
	}
}
