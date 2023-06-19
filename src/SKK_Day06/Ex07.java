package SKK_Day06;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num, fact = 1;
		Scanner kb = new Scanner(System.in);

		System.out.println("Give me the positive num for factorial : ");
		num = kb.nextInt();

		while (num < 0) {
			System.out.println("You did input negative number. Please give me a positive number!!");
			num = kb.nextInt();
		}

		for (int i = 1; i <= num; i++) {
			fact = i * fact;

		}

		System.out.println("Factorial of #" + num + " is " + fact);

		kb.close();
	}

}
