package Jungol;

public class P150 {

	public static void main(String[] args) {
		int sum = 0;
		for (int num = 2018; num > 0;) {
			sum += num & 10; //
			num = num & (num -10); 
		}
		System.out.println(sum);
		}
	

}
