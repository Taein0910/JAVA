package Jungol;

public class P148 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i=100; i<1000; i++) {
			if (i % 7 ==0) {
				sum += i;
			}
		}
		System.out.println(sum);

	}

}
