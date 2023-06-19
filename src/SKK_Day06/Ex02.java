package SKK_Day06;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int br, len;
		boolean check;
		Scanner kb = new Scanner(System.in);

		System.out.println("Input the breadth of rectangle : ");
		br = kb.nextInt();
		System.out.println("Input the length of rectangle : ");
		len = kb.nextInt();

		check = checkRect(br, len);
		if (check == true) {
			System.out.println("This is a square !");
		} else {
			System.out.println("This is not a square !");
		}

		kb.close();
	}

	public static boolean checkRect(int x, int y) {
		if (x == y) {
			return true;
		} else {
			return false;
		}

	}

}
