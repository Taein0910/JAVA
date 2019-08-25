package lecture20190331;

import java.util.Scanner;

public class Eight {

	public static void main(String[] args) {
		int sum =0;
		int sum2 =0;
		double avg = 0;
		int even=0;
		int[] array = new int[10];
		for (int a=0; a<10; a++) {
		Scanner sc = new Scanner(System.in);
		array[a] = sc.nextInt();
		if (array[a]%2 ==0) {
			sum=sum+array[a];
			
		}
		if (array[a]%2!=0) {
			sum2=sum2+array[a];
			even=even+1;
		}
		}
		avg = sum2/even;
		System.out.println("sum : "+sum);
		System.out.println("avg : "+avg);
		
	}

}
