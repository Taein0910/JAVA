package Jungol;

import java.util.Scanner;

public class P153 {

	public static void main(String[] args) {
		int sum = 0;
		Scanner sc= new Scanner (System.in);
		System.out.print("Enter the nubmer : ");
        int num = sc.nextInt();
        while(num!=0){
            //num�� 10���� ���� �������� sum�� ���Ѵ�.
            sum += num%10;
            //num�� 10���� ���� ���� �ٽ� num�� �����Ѵ�.
            num /= 10;
        }
System.out.println(sum);
	}

}
