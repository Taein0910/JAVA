package Code190407;

import java.util.Scanner;

public class Sixth {

	public static void main(String[] args) {
				int sum = 0;
				int count =0;
				int c =0;
				int[] arr = new int[100];
				Scanner scan = new Scanner(System.in);
				for (int i = 0; i < 100; i++) {
					int a = scan.nextInt();
					arr[i] = a;
					sum += a;
					count+=1;
				if (a%5==0) {
					c+=1;
				}
	
					if (a ==0) {
						System.out.println("Multiples of 5 : "+c);
						System.out.println("sum : "+sum);
						System.out.println("avg : "+sum/count);
					}
				}

			


	}

}
