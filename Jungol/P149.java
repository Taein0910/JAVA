package Jungol;

import java.util.Scanner;

public class P149 {

	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner (System.in);
		System.out.print("������ �ϳ� �Է��Ͻÿ� : ");
		int num = sc.nextInt();
		for (int i =1; i<=num; i++) {
		sum += i;	
		}
		System.out.println("1 ���� "+num+" ������ ���� "+sum);

	}

}
