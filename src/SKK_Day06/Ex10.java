package SKK_Day06;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double num1, num2, num3, avg;

		Scanner kb = new Scanner(System.in);

		System.out.println("Input the first number : ");
		num1 = kb.nextDouble();
		System.out.println("Input the second number : ");
		num2 = kb.nextDouble();
		System.out.println("Input the third number : ");
		num3 = kb.nextDouble();

		avg = (num1 + num2 + num3) / 3;

		System.out.printf("Average is %.2f", avg);

		kb.close();
	}

}
