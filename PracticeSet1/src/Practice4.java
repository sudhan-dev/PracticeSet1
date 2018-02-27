
//How to write an array of strings to the output console?
import java.util.Scanner;

public class Practice4 {
	public static void main(String args[]) {

		int i;
		Scanner in = new Scanner(System.in);
		String[] str = new String[3];
		System.out.println("Enter three strings: ");

		for (i = 0; i < str.length; i++) {
			str[i] = in.nextLine();
		}

		System.out.println("Entered strings are: ");
		for (i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}

		in.close();

	}

}
