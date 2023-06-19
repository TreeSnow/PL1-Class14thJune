package SKK_Day06;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num1, num2, num3, num4, biggest, big1, big2;
		Scanner kb = new Scanner(System.in);

		System.out.println("Input first number to compare : ");
		num1 = kb.nextInt();
		System.out.println("Input second number to compare : ");
		num2 = kb.nextInt();
		System.out.println("Input third number to compare : ");
		num3 = kb.nextInt();
		System.out.println("Input fourth number to compare : ");
		num4 = kb.nextInt();

//		[ Approach #1 ]
		if (num1 > num2) { // 1st compare group
			big1 = num1;
		} else {
			big1 = num2;
		}

		if (num3 > num4) { // 2nd compare group
			big2 = num3;
		} else {
			big2 = num4;
		}

		if (big1 > big2) { // last compare to decide greatest number
			biggest = big1;
		} else {
			biggest = big2;
		}

//		[ Approach #2 ]
//		if (num1 > num2) {
//			if (num2 > num3) {
//				if (num3 > num4) {
//					biggest = num1; 
//				} else if (num2 > num4) {
//					biggest = num1;
//				} else if (num1 > num4) {
//					biggest = num1;
//				} else {
//					biggest = num4;
//				}
//			} else if (num1 > num3) {
//				if (num3 > num4) {
//					biggest = num1;
//				} else if (num1 > num4) {
//					biggest = num1;
//				} else {
//					biggest = num4;
//				}
//
//			} else if (num3 > num4) {
//				biggest = num3;
//			} else {
//				biggest = num4;
//			}
//
//		} else if (num2 > num3) {
//			if (num3 > num4) {
//				biggest = num2;
//			} else if (num2 > num4) {
//				biggest = num2;
//			} else {
//				biggest = num4;
//			}
//		} else if (num3 > num4) {
//			biggest = num3;
//		} else {
//			biggest = num4;
//		}

		System.out.println("Greatest number is " + biggest);

		kb.close();

	}

}
