package Jungol;

import java.util.Scanner;

public class P153 {

	public static void main(String[] args) {
		int sum = 0;
		Scanner sc= new Scanner (System.in);
		System.out.print("Enter the nubmer : ");
        int num = sc.nextInt();
        while(num!=0){
            //num을 10으로 나눈 나머지를 sum에 더한다.
            sum += num%10;
            //num을 10으로 나눈 값을 다시 num에 저장한다.
            num /= 10;
        }
System.out.println(sum);
	}

}
