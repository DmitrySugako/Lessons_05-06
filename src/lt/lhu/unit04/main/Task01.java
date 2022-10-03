package lt.lhu.unit04.main;

public class Task01 {

	public static void main(String[] args) {
		int a = 44, b = 55, c = 66;
		int max, min;
		max = maxnumber(a, b, c);
		min = minnumber(a, b, c);
		int sum = max + min;
		System.out.println("sum=" + sum);
	}

	public static int maxnumber(int a, int b, int c) {
		return Math.max(a, Math.max(b, c));
	}

	public static int minnumber(int a, int b, int c) {
		return Math.min(a, Math.min(b, c));
	}
}