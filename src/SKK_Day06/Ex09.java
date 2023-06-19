package SKK_Day06;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double mins, hr, day, year, minRemain, dayRemain, hrRemain;
		Scanner kb = new Scanner(System.in);

		System.out.println("Give me the number of minutes : ");
		mins = kb.nextDouble();

		hr = mins / 60;
		day = hr / 24;
		year = day / 365;
		minRemain = mins % 60;
		hrRemain = hr % 24;
		dayRemain = day % 365;

//		if (minRemain == 0) {
//		
//			System.out.printf("%.0f min(s) => %.0f year(s) %.0f day(s) %n", mins, year, dayRemain);
//		}else {
//			System.out.printf("%.0f min(s) => %.0f year(s) %.0f day(s) and %.0f Min(s)  %n", mins, year, dayRemain,
//					minRemain);
//		}
		System.out.printf("%.0f min(s) => %.0f year(s) %.0f day(s) %.0f hr(s) and %.0f Min(s)  %n", mins, year,
				dayRemain, hrRemain, minRemain);
		kb.close();
	}

}
