package lt.lhu.unit04.main;

public class Task03 {

	public static void main(String[] args) {
		int a = 111555511;
		int b = 111;
		int c = counter(a);
		int n = counter(b);
		if (c > n) {
			System.out.println("Число" + a + "содержит больше цифр");
		} else {
			System.out.println("Число" + b + "число содержит больше цифр");
		}
	}

	public static int counter(int x) {
		int n = 0;
		while (x != 0) {
			x = x / 10;
			n++;
		}
		return n;
	}
}