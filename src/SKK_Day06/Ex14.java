package SKK_Day06;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double num1 = 1, sum = 0, avg, cnt = 0;
		Scanner kb = new Scanner(System.in);

		System.out.println("Until you enter the number '0', you can enter a number to calculate.");

		do {
			System.out.println("Enter a number : ");
			num1 = kb.nextDouble();
			sum += num1;
			if (num1 != 0) {
				cnt++;
			}
		} while (num1 != 0);

		if (cnt == 0) {
			System.out.println("There is no valid input to calculate!!");

		} else {
			avg = sum / cnt;

			System.out.printf("The Sum is : %.2f %n", sum);
			System.out.printf("The Average is : %.2f %n", avg);
		}

		kb.close();

	}

}
