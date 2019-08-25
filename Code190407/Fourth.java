package Code190407;

import java.util.Scanner;

public class Fourth {

	public static void main(String[] args) {
		int result = -1;
		String[] arr = { "J", "U", "N", "G", "O", "L" };
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		for (int i = 0; i < 6; i++) {
			/*
			System.out.println(i);
			System.out.println(result);
			*/
			if (arr[i].equals(a)==true) {
				result = i;
				System.out.println(result);
			}

		}
		if (result == -1) {
			System.out.println("none");
		}
	}

}
