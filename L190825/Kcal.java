package L190825;

public class Kcal {
	public static void main(String[] args) {
		int pedo = 5000;
		double kcal = calculator(pedo);
		System.out.println("�Ҹ� Į�θ�: "+kcal+" kcal");

	}
	
	public static double calculator(int pedo) {
		return 0.02*pedo;
	}


}
