package Lecture20190512;

public class TwoArray {

	public static void main(String[] args) {
		int [][] arr = {
				{5,5,5,5,5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
		};
		int total = 0;
		float average = 0.0f;
		for (int i=0; i<4; i++) {
		for (int j=0; j<5; j++) {
			total+=arr[i][j];
		}
		}
		average = total/20;
		System.out.println("total="+total);
		System.out.println("average="+average);

	}
	}

