package NYPC;

import java.util.Scanner;

public class Q8 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt(); //1
		int b = sc.nextInt(); //10
		int[] arr= new int[b-a]; //

		for(int i=a; i<b; i++) { //1 ~ 10
			arr[ii] = i; //하나씩 배열에 복사
		}
	
		
		int cnt =0;
		
		for(int i=a; i<b; i++) { //1~10
			for(int j=1; j<arr[i]; j++) { //1~1
				if (arr[i] % j == 0) { //1/1이 
			        cnt++; 

			    }
			}
			  
		}
		
		System.out.println(cnt);
	}
}
