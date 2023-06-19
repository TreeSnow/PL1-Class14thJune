package SKK_Day06;

import java.util.Scanner;

public class Ex11d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1;
		Scanner kb = new Scanner(System.in);

		System.out.println("Input the lagest number of '*' of line to print pattern: ");
		num1 = kb.nextInt();

		for (int i = 0; i < num1; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}

			for (int k = num1; k > i; k--) {
				System.out.print("* ");
			}
			System.out.println();
		}

		kb.close();

	}

}
