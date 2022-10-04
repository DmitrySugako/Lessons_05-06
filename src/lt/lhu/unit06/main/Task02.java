package lt.lhu.unit06.main;

import java.util.Scanner;
import java.math.BigInteger;

public class Task02 {

	public static void main(String[] args) {
		BigInteger a = new BigInteger(add());
		BigInteger b = new BigInteger(add());
		System.out.println("a+b= " + a.add(b) + "\n" + "a-b= " + a.subtract(b) + "\n" + "a/b= " + a.divide(b) + "\n"
				+ "a*b= " + a.multiply(b));
	}

	public static String add() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		String x = sc.nextLine();
		return x;
	}
}
