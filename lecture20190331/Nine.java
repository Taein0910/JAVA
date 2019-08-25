package lecture20190331;

import java.util.Scanner;

public class Nine {

	public static void main(String[] args) {
		//int max =-100000;
		int temp;
		int[] array = new int[10];
		for (int a =0; a<10; a++) {
		Scanner sc = new Scanner(System.in);
		array[a] = sc.nextInt();
		
		for (int i=0; i<10; i++) {
			for (int j=i+1; j<10; j++) {
		
		if (array[i] < array[j]) {
			  temp = array[i];
	          array[i] = array[j];
	          array[j] = temp;
		}
			}
		}
		}
		  for(int i = 0; i <10; i++)
		    {
		      System.out.print(array[i]+" "); 
		    }
	}

}
