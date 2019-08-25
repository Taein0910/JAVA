package Lecture20190512;

public class Bang {

	public static void main(String[] args) {
		int x, y; // int x, y ¼±¾ð
		int a = 2, b = 4, c = 10;
		System.out.println(a + "x+" + b + "y=" + c);
		for (x = 0; x <= 10; x++) {
			for (y = 0; y <= 10; y++) {
				if ((a * x) + (b * y) == c) {
					System.out.println("(" + x + "," + y + ")");
				}
			}
		}

	}

}
