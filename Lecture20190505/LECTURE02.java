package Lecture20190505;

public class LECTURE02 {

	public static int cal(int n1, int n2, char type) {
		int result = 0;
		if (type == 'p') {
			result = n1 + n2;
		} else if (type == 'm') {
			result = n1 - n2;
		} else if (type == 't') {
			result = n1 * n2;
		} else if (type == 'd') {
			result = n1 / n2;
		}
		return result;
	}

	public static void main(String[] args) {
		int n1 = 20, n2 = 10;
		System.out.println(cal(n1, n2, 'p'));
		System.out.println(cal(n1, n2, 'm'));
		System.out.println(cal(n1, n2, 't'));
		System.out.println(cal(n1, n2, 'd'));

	}

}
