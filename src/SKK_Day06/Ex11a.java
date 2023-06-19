package SKK_Day06;

import java.util.Scanner;

public class Ex11a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1;
		Scanner kb = new Scanner(System.in);

		System.out.println("Input the number of line to print : ");
		num1 = kb.nextInt();

//		for (int i = 0; i < num1; i++) {
//			for (int j = i; j >= 0; j--) {   //it works but 'j' is dead code!!
//				for (int k = j; k >= 0; k--) {
//					System.out.print(num1 - k);
//				}
//				System.out.println();
//				break;
//			}
//
//		}


		for (int i = num1; i >= 1; i--) {
			for (int j = i; j <= num1; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		kb.close();

	}

}
