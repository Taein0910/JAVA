package Lecture20190505;

public class Llecture02 {

	public static double cal(int a, int b, double tex) {
		return a + b - tex;
	}

	public static void main(String[] args) {
		int a = 1500000;
		int b = 55000;
		double tex = a * 0.1;
		System.out.println(Math.round(cal(a, b, tex)) + "¿ø");
	}

}
