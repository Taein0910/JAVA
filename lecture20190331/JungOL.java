package lecture20190331;

import java.util.Scanner;

public class JungOL {

	public static void main(String[] args) {
		String[] array = new String[10];
		for (int a=0; a<=9; a++) {
		Scanner sc = new Scanner(System.in);
		array[a] = sc.nextLine();
		//System.out.println(array[a]);
		}
		
		for (int b=0; b<=array.length-1; b++) {
        System.out.print(array[b]);
		}
	}

}
