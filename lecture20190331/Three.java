package lecture20190331;

import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		String[] array = new String[10];
		for (int a=0; a<=9; a++) {
		Scanner sc = new Scanner(System.in);
		array[a] = sc.nextLine();
		//System.out.println(array[a]);
		}
		
System.out.print(array[0]+" ");
System.out.print(array[3]+" ");
System.out.print(array[6]);
	}


	

}
