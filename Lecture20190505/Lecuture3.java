package Lecture20190505;

import java.util.Scanner;

public class Lecuture3 {

	public static int cal(int input, char type) {
		double result = 0;
		if (input == 1) {
			result = (type == 's') ? (8000 * 0.1 + 6000) : 6000 * 0.1 + 6000;
		} else if (input == 2) {
			result = (type == 's') ? (8000 * 0.1 + 6000) : 6000 * 0.1 + 6000;
		} else if (input == 3) {
			result = (type == 's') ? (12000 * 0.1 + 10000) : 10000 * 0.1 + 10000;
		} else if (input == 4) {
			result = (type == 's') ? (5000 * 0.1 + 3000) : 3000 * 0.1 + 3000;
		} else if (input == 5) {
			result = (type == 's') ? (4000 * 0.1 + 2000) : 2000 * 0.1 + 2000;
		}
		return (int) result;
		
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("메뉴판\n1.big\n2.sang\n3.gold\n4.wing\n5.che\n\n: ");
		int put = sc.nextInt();

		System.out.println("세트 : " + cal(put, 's'));

		System.out.println("단품 : " + cal(put, 'o'));

	}

}
