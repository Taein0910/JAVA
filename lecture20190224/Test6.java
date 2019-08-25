package lecture20190224;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int mat = scan.nextInt();
		int tot = kor + eng + mat;
		int ava = tot/3;
		System.out.println("이름: "+name);
		System.out.println("합계점수: "+tot);
		System.out.println("평균점수: "+ava);

	}

}
