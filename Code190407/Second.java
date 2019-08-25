package Code190407;

import java.util.Scanner;

public class Second {

	public static void main(String[] args) {
		int count=0;
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[100];
		for (int i =0; i<100; i++) {
			arr[i] = sc.nextInt();
			count +=1;
			if (arr[i]==-1) {
				if (count<=3) {
					System.out.println(arr[0]);
					System.out.println(arr[1]);
				}
				else {
				System.out.println(arr[count-4]);
				System.out.println(arr[count-3]);
				System.out.println(arr[count-2]);
				}
			}

	    
		}

	}

}
