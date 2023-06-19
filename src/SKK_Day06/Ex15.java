package SKK_Day06;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String grade;
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a grade (ie. E, V, G, A, F): ");
		grade = kb.next();

		if (grade.charAt(0) == 'a' || grade.charAt(0) == 'A') {
			System.out.println("You have chosen : Average.");
		} else if (grade.charAt(0) == 'e' || grade.charAt(0) == 'E') {
			System.out.println("You have chosen : Excellent.");
		} else if (grade.charAt(0) == 'v' || grade.charAt(0) == 'V') {
			System.out.println("You have chosen : Very Good.");
		} else if (grade.charAt(0) == 'g' || grade.charAt(0) == 'G') {
			System.out.println("You have chosen : Good.");
		} else if (grade.charAt(0) == 'f' || grade.charAt(0) == 'F') {
			System.out.println("You have chosen : Fail.");
		} else {
			System.out.println("There is no grade like that!!");
			
		}

		kb.close();

	}

}
