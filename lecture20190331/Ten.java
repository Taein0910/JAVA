package lecture20190331;

import java.util.Scanner;

public class Ten {

	public static void main(String[] args) {
		String[] array = new String[10];
		for (int a=0; a<10; a++) {
		Scanner sc = new Scanner(System.in);
		array[a] = sc.nextLine();
		}
		
		for(int b=9; b>=0; b=b-1) {
			System.out.print(array[b]+" ");
	}
	}

}
