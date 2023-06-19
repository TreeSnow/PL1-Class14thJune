package SKK_Day06;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1, cubeNum;
		Scanner kb = new Scanner(System.in);

		System.out.println("Input number of terms : ");
		num1 = kb.nextInt();

//		cubeNum = num1 * num1 * num1;

		for (int i = 1; i <= num1; i++) {
			cubeNum = i * i * i;
			System.out.printf("Number is : %d and cube of the %d is : %d %n", i, i, cubeNum);
		}

		kb.close();

	}

}
