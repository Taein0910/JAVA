package lecture20190331;

import java.util.Scanner;

public class Seven {

	public static void main(String[] args) {
		int max = -1;
		int min = 100000;
		int[] array = new int[10];
		for (int a=0; a<10; a++) {
			Scanner sc = new Scanner(System.in);
			array[a] = sc.nextInt();
			if (array[a] <100) {
				if (array[a] > max) {
					max = array[a];
				}
			}
		    
			if (array[a] > 100) {
				if(array[a] < min) {
					min = array[a];
				}
			}
		}
		if (max==-1) {
			max = 100;
		}
		if (min==100000) {
			min = 100;
		}
		System.out.println(max+" ");
		System.out.print(min);
		

	}

}
