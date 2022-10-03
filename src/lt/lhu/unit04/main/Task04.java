package lt.lhu.unit04.main;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Task04 {

	public static void main(String[] args) {
		int[] array = new int[6];
		Random rand = new Random();
		for (int i = 0; i <= 5; i++) {
			array[i] = rand.nextInt(1000);
		}
		System.out.println(Arrays.toString(array));
		sum(array);
	}

	public static void sum(int x[]) {
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter item number (0-5)");
		i = sc.nextInt();
		if (i >= 0 & i <= 3) {
			int s = x[i] + x[i + 1] + x[i + 2];
			System.out.println("Sum= " + s);
		} else if (i == 4) {
			int s = x[i] + x[i - 1] + x[i + 1];
			System.out.println("Sum= " + s);
		} else if (i == 5) {
			int s = x[i] + x[i - 1] + x[i - 2];
			System.out.println("Sum= " + s);
		} else {
			System.out.println("incorrect value");
			return;
		}
	}
}
