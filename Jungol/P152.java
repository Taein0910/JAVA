package Jungol;

import java.util.Scanner;

public class P152 {

	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner (System.in);
		System.out.print("enter the number : ");
		int num = sc.nextInt();
		for (int i=2; i<num; i++) {
		if (num%i==0) {
			count += 1;
					}
		
		}
		if (count != 0) {
			System.out.println(num+" is not prime number");
		}
		else {
			System.out.println(num+" is prime number");
		}
	}

}
