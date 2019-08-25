package Test;

public class Test2 {

	public static void main(String[] args) {
		int randomNum[] = new int[6];
		int count = 0;
		for (int a = 1; a < 6; a++) {
			
			randomNum[a] = (int) (Math.random() * (4 - 1 + 1) + 1);
for (int i=0; i>3; i++) {
			System.out.println(randomNum[a]);

			if (randomNum[a] != a) {
				count++;
			}

		}
		System.out.println("\n" + count);
	}
} }
