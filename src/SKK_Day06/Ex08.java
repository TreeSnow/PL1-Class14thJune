package SKK_Day06;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int fTemp, cTemp; // Temperature units (Fahrenheit and Celcius degree)
		Scanner kb = new Scanner(System.in);

		System.out.println("Give me the temperature of Fahrenheit : ");
		fTemp = kb.nextInt();

//		(32F -32) x 5/9 = 0C

		cTemp = (fTemp - 32) * 5 / 9;

		System.out.printf("%dF is converted to %dC  %n", fTemp, cTemp);

		kb.close();

	}

}
