package SKK_Day06;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mark;
		char grade;
		Scanner kb = new Scanner(System.in);

		System.out.println("Input your mark : ");
		mark = kb.nextInt();

		if (mark < 25) {
			grade = 'F';
		} else if (mark <= 45) {
			grade = 'E';
		} else if (mark <= 50) {
			grade = 'D';
		} else if (mark <= 60) {
			grade = 'C';
		} else if (mark <= 80) {
			grade = 'B';
		} else {
			grade = 'A';
		}

		System.out.printf("Base on the mark %d => Your grade is %s !! %n", mark, grade);

		kb.close();
	}

}
