package lt.lhu.unit06.main;

public class Task01 {

	public static void main(String[] args) {
		int a = 13, b = 5, c = 7;
		if (gcd(a, b) + gcd(b, c) + gcd(a, c) == 3) {
			System.out.println("Числа взаимопростые");
		} else {
			System.out.println("Числа не взамопростые");
		}
	}

	public static int gcd(int a, int b) {
		int c;
		if (b > a) {
			c = b;
			b = a;
			a = c;
		}

		while (b != 0) {
			c = a % b;
			a = b;
			b = c;
		}
		return a;
	}
}