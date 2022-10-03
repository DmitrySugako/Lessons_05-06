package lt.lhu.unit06.main;

import java.util.Arrays;
import java.util.Random;

public class Task05 {

	public static void main(String[] args) {
		int[] lock = new int[10];
		int i = 0;
		lock[0] = add();
		lock[1] = add();
		while (i <= 7) {
			if (lock[i] + lock[i + 1] >= 4 & lock[i] + lock[i + 1] <= 9) {
				lock[i + 2] = 10 - (lock[i] + lock[i + 1]);
				i++;
			} else {
				lock[0] = add();
				lock[1] = add();
			}
		}
		System.out.println("Key:" + Arrays.toString(lock));
	}

	public static int add() {
		Random rand = new Random();
		int x = rand.nextInt(6) + 1;
		return x;
	}
}