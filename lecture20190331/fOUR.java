package lecture20190331;

import java.util.Scanner;

public class fOUR {

	public static void main(String[] args) {
		int count =0;
		int[] array = new int[100];
		for (int a=0; a<=100; a++) {
		Scanner sc = new Scanner(System.in);
		array[a] = sc.nextInt();
		count=count+1;
		if (array[a]==0) {
			for(int b=count-2; b>=0; b=b-1) {
				System.out.println(array[b]);
			}
		}
		}
	}


	

}
