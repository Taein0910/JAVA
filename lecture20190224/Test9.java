package lecture20190224;

public class Test9 {

	public static void main(String[] args) {
		int num = 474;
		int sum = 0;
		while(num!=0){
            sum = sum+num%10;
            num = num/10;
        }
            System.out.println(sum);
        }

}
