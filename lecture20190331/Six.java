package lecture20190331;

import java.util.Scanner;

public class Six {

	public static void main(String[] args) {
		int min = 1000;
		int[] array = new int[10];
		for (int a =0; a<=9; a++) {
		Scanner sc = new Scanner(System.in);
		array[a] = sc.nextInt();
		if (array[a] < min) {
			min = array[a];
		}
		}
		System.out.println(min);
	}

}
