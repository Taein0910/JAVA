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
		System.out.println("�̸�: "+name);
		System.out.println("�հ�����: "+tot);
		System.out.println("�������: "+ava);

	}

}
