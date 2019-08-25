package L190825;

public class Food {
	String color;
	int price;
	public static void main(String[] args) {
		
		Food Apple  = new Food();
		Food Orange = new Food();
		Apple.setPrice(50);
		Apple.setColor("red");
		Orange.setPrice(100);
		Orange.setColor("orange");
		

	}
	
	public void setPrice(int price) {
		this.price = price;
		System.out.println(this.price);
	}
	
	public void setColor(String color) {
		this.color = color;
		System.out.println(this.color);
	}

}
