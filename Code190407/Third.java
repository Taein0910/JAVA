package Code190407;

public class Third {

	public static void main(String[] args) {
		double sum =0;
		double[] data = {23.2, 39.6, 66.4,50.0, 45.6, 48.0};
		for (int a=0; a<6; a++) {
			sum += data[a];
		}
System.out.println((double)sum/6.0);
	}

}
