package lecture20190224;

import java.util.Scanner;

public class Test12_1 {

	public static void main(String[] args) {
		int chan =0;
		int input = -1;
		int num = (int)(Math.random()*100);
		System.out.println("난수 몬스터의 숫자를 맞춰보세요");
		while (input != num) {
		Scanner scan = new Scanner(System.in);
		System.out.print("난수 숫자 입력: ");
		input = scan.nextInt();
		if (input==num) {
			System.out.println("난수 몬스터를 잡았다!!");
			System.out.println(chan+"번 만에 성공");
			scan.close();
		}
		else if (input > num) {
			chan ++;
			System.out.println("난수 몬스터의 숫자가 더 작습니다.\n");
		}
		else if (input < num) {
			System.out.println("난수 몬스터의 숫자가 더 큽니다.\n");
			chan++;
		}
		}
	}

}
