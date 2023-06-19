package SKK_Day06;

import java.util.Scanner;

public class Ex11g {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2 = 1;
		Scanner kb = new Scanner(System.in);

		System.out.println("Input the line number to print pattern: ");
		num1 = kb.nextInt();

		for (int i = 1; i <= num1; i++) {
			for (int j = i; j > 0; j--) {
				System.out.print(num2++);
				System.out.print(" ");

			}
			System.out.println();
		}

		kb.close();

	}

}
