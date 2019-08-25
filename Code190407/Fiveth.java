package Code190407;

import java.util.Scanner;

public class Fiveth {

	public static void main(String[] args) {
		int max = -1000;
		int min = 1000;
		int[] arr = new int[100];
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 100; i++) {
			int a = scan.nextInt();
			arr[i] = a;
			if (a > max) {
				max = a;
			}
			if (a < min) {
				min = a;
			}
			if (a == 999) {
				System.out.println("max : " + max);
				System.out.println("min : " + min);
			}
		}

	}

}
