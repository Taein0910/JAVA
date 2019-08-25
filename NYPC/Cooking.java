package NYPC;

import java.util.Scanner;

public class Cooking {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n > 100) {
			System.out.println(0);
		} else {
			int hasEle[] = new int[n];
			int needEle[] = new int[n];
			for (int i = 0; i < n; i++) {
				hasEle[i] = sc.nextInt();
			}
			for (int i = 0; i < n; i++) {
				needEle[i] = sc.nextInt();
			}

			int result = 0;
			int temp = 0;
			for (int i = 0; i < n; i++) {

				if (needEle[i] == 0) {
					result = 0;
				}

				else {

					if (i == 0) {
						temp = hasEle[i] / needEle[i];
					}

					result = hasEle[i] / needEle[i];
					if (result > temp) {
						result = temp;
					}
					temp = result;
				}

			}

			if (result != 0) {

				System.out.println(result);
			} else {
				System.out.println(0);
			}

		}

	}

}
