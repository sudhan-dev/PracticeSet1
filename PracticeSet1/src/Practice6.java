
//How to merge two arrays?
import java.util.Scanner;

public class Practice6 {
	public static void main(String args[]) {
		int i, len, j;
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
		len = arr.length + arrn.length;
		int arrm[] = new int[len];
		for (i = 0; i < arr.length; i++)
			arrm[i] = arr[i];
		j = arr.length;
		for (i = 0; i < arrn.length; i++) {
			arrm[j] = arrn[i];
			j++;
		}
		System.out.println("The merged array is:");
		for (i = 0; i < arrm.length; i++) {
			System.out.print(arrm[i]);
			System.out.print(" ");
		}

		in.close();
	}
}