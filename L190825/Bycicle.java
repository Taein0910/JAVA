package L190825;

public class Bycicle {
	String name;
	double weight;
	int price;

	public static void main(String[] args) {
		Bycicle one = new Bycicle();
		one.setName("�ε��� ������");
		one.setWeight(7.25);
		one.setPrice(327000);
		System.out.println(one.name+"\n"+one.weight+"\n"+one.price);
		move();
		horn();

	}

		
		public void setName(String name) {
			this.name = name;
		}
		
		public void setWeight(double weight) {
			this.weight = weight;
		}
		
		public void setPrice(int price) {
			this.price = price;
		}
		
		public static void move() {
			System.out.println("�����Ű� ����մϴ�");
		}
		
		public static void horn() {
			System.out.println("������");
		}


}
