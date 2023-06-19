package SKK_Day06;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double principle = 1000, interestRate = 0.0625, profit, totProfit = 0, newPrinciple;
		int numOfYears = 5;
//		int numOfYears = 8;

		newPrinciple = principle;

		for (int i = 1; i <= numOfYears; i++) {
			if (i == 1) {
				profit = principle * interestRate;
				newPrinciple = principle * (1 + interestRate);
				totProfit += profit;
			} else {
				profit = newPrinciple * interestRate;
				newPrinciple = newPrinciple * (1 + interestRate);
				totProfit += profit;
			}

		}

		System.out.println("Investment period : " + numOfYears + " Year(s)");
		System.out.printf("Total profit of investment : %.2f", totProfit);

	}

}
