package Lecture20190505;

public class Method_Exam {

	public static int plus(int num1, int num2) {
		return num1 + num2;
	}

	public static int minus(int num1, int num2) {
		return num1 - num2;
	}

	public static int multi(int num1, int num2) {
		return num1 * num2;
	}

	public static double divi(int num1, int num2) {
		double result = num1 / num2;
		return result;
	}

	public static void main(String[] args) {
		// ������ ���� 2���� ������ ��Ģ������ ����Ͻÿ�
		int num1 = 10, num2 = 5;
		System.out.println(plus(num1, num2));
		System.out.println(minus(num1, num2));
		System.out.println(multi(num1, num2));
		System.out.println(divi(num1, num2));
	}

}
