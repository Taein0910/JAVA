package Jungol;

import java.util.Scanner;

public class P149 {

	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner (System.in);
		System.out.print("정수를 하나 입력하시오 : ");
		int num = sc.nextInt();
		for (int i =1; i<=num; i++) {
		sum += i;	
		}
		System.out.println("1 부터 "+num+" 까지의 합은 "+sum);

	}

}
