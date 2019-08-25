package lecture20190224;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		//°¡°ÝÇ¥
		int big = 6000;
		int sang = 6000;
		int gol = 10000;
		int mac = 3000;
		int ch = 2000;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("¸Þ´º¸¦ ÀÔ·ÂÇÏ¼¼¿ä :");
		String input = scan.nextLine();
		
		if (input == "1") {
			System.out.println("ºò¸Æ : "+big*0.1+big);
		}
		else if (input == "1¹ø¼¼Æ®") {
			System.out.println("ºò¸Æ : "+(big+2000)*0.1+big);
		}

	}

}
