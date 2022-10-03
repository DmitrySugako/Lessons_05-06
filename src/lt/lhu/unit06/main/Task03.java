package lt.lhu.unit06.main;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		long a = sc.nextInt();
		System.out.println("Armstrong numbers:");
		for (long x = 1; x <= a; x++) {
			long b = counter(x);
			long c = sum(x, b);
			if (x == c) {

				System.out.println(x);
			}
		}
	}

	public static long counter(long a) {
		long n = 0;
		while (a != 0) {
			a = a / 10;
			n++;
		}
		return n;
	}

	public static long sum(long a, long b) {
		long i = 0;
		while (a != 0) {
			i = i + (long) Math.pow(a % 10, b);
			a = a / 10;
		}
		return i;
	}

}
