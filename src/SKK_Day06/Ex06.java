package SKK_Day06;

public class Ex06 {

	static int END = 300;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 0, b = 1, c = 0;

//		while (c <= END) {
//			System.out.print(c + " ");
//			a = b;
//			b = c;
//			c = a + b;
//		}

		for (; c <= END; c = a + b) {
			System.out.print(c + " ");
			a = b;
			b = c;
		}

	}

}
