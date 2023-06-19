package SKK_Day06;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1, num2 = 1, sum = 0;
		Scanner kb = new Scanner(System.in);

		System.out.println("Input number of terms : ");
		num1 = kb.nextInt();

//		cubeNum = num1 * num1 * num1;

		for (int i = 1; i <= num1; i++) {

			System.out.printf("%d + ", num2);
			sum += num2;
			num2 = num2 * 10 + 1;

		}

		System.out.println();
		System.out.printf("The Sum is : %d %n", sum);

		kb.close();

	}

}
