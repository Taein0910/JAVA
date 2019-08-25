package Code190407;

import java.util.Scanner;

public class Seventh {

	public static void main(String[] args) {
		int count = 0;
		int[] arr = new int[100];
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 100; i++) {
			int a = scan.nextInt();
			arr[i] = a;
			count += 1;
			if (a % 2 == 0) {
				arr[i] = a / 2;
			}
			if (a%2!=0) {
				arr[i] = a*2;
			}

			if (a == 0) {
				System.out.println(count - 1);
				for (int j =0; j<count-1; j++) {
					System.out.print(arr[j]+" ");
				}
			}
		}

	}

}
