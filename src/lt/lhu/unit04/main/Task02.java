package lt.lhu.unit04.main;

public class Task02 {

	public static void main(String[] args) {
		int a = 48, b = 32;
		int nod = gcd(a, b);
		int nok = a * b / nod;
		System.out.println("NOD=" + nod + "\t " + "NOK=" + nok);
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
