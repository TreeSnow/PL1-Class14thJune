package SKK_Day06;

import java.util.Scanner;

public class Ex11h {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1;
		Scanner kb = new Scanner(System.in);

		System.out.println("Input the number to print pattern: ");
		num1 = kb.nextInt();

		for (int i = 1; i <= num1; i++) {

			for (int j = 1; j <= num1 - i; j++) {
				System.out.print(" ");
			}

			for (int k = i; k > 0; k--) {
				System.out.print(k);

			}

			for (int k = 1; k < i; k++) {
				System.out.print(k + 1);
			}

			System.out.println();
		}

		for (int i = 1; i < num1; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}

			for (int k = num1 - i; k >= 1; k--) {
				System.out.print(k);
			}

			for (int k = 1; k < num1 - i; k++) {
				System.out.print(k + 1);
			}

			System.out.println();

		}

		kb.close();

	}

}
