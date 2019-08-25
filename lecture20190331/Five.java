package lecture20190331;

import java.util.Scanner;

public class Five {

	public static void main(String[] args) {
		double[] array = {85.6, 79.5 ,83.1, 80.0, 78.2, 75.0};
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		double n1 = array[num-1];
		int num2 = sc.nextInt();
		double n2 = array[num2-1];
		System.out.println((n1+n2));
	}

}
