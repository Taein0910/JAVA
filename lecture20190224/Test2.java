package lecture20190224;

public class Test2 {

	public static void main(String[] args) {
		int money = 65430;
		int a = (int)(money/10000);
		int b = (money%10000)/1000;
		int c = (money%500)/100;
		int d = (money%50)/10;
		System.out.println(a); //만원
		System.out.println(b); //천원
		System.out.println(c); //백원
		System.out.println(d); //십원
	}

}
