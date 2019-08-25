package Code190407;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		int even = 0;
		int odd = 0;
		int[] array = { 10, 20, 25, 66, 83, 7, 22, 90, 1, 100 };
		for (int a = 0; a < array.length; a++) {
			if (a % 2 == 0) {
				odd += array[a];
			} else {
				even += array[a];
			}
		}
		System.out.println("odd : " + odd);
		System.out.println("even : " + even);

	}

}
