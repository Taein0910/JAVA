package Lecture20190512;

public class Lecture01 {

	public static void main(String[] args) {
		int number = 12321;
		int tmp = number;
		int result = 0;
		while (tmp != 0) {
			result = result * 10 + tmp % 10;
			tmp = tmp / 10;

			/*
			 * 코드 원리?
			 * 4357을 뒤집으면
			 * 7534 = ( 7 * 1000 )+( 5 * 100 ) + ( 3 *10 ) + (4 * 1)
			 */
		}

		if (number == result)
			System.out.println(number + "는 회문수입니다.");	
		else
			System.out.println(number + "는 회문수가 아닙니다.");

	}

}
