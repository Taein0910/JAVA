package lecture20190331;

import java.util.Scanner;

public class Eleven {

	public static void main(String[] args) {
		int[] array = new int[5];
		for (int a=0; a<5; a++) {
		Scanner sc = new Scanner(System.in);
		array[a] = sc.nextInt();
		}
		System.out.println(array[0]+array[2]+array[4]);
	}

}
