package Jungol;

public class Exam146 {

	public static void main(String[] args) {
		for (int i =1; ; i++) {
			if(i >= 3 && i <= 8) {
				continue;
			}
			else if (i==13) {
				System.out.println("we find 13");
				break;
			}
			System.out.println(i);
			}
		}

	}


