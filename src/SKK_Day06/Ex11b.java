package SKK_Day06;

import java.util.Scanner;

public class Ex11b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1;
		Scanner kb = new Scanner(System.in);

		System.out.println("Input the number of line to print : ");
		num1 = kb.nextInt();

		for (int i = 1; i <= num1; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(num1 - j);
			}
			System.out.println();
		}

		kb.close();

	}

}
