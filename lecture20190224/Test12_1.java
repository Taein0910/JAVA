package lecture20190224;

import java.util.Scanner;

public class Test12_1 {

	public static void main(String[] args) {
		int chan =0;
		int input = -1;
		int num = (int)(Math.random()*100);
		System.out.println("���� ������ ���ڸ� ���纸����");
		while (input != num) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���� ���� �Է�: ");
		input = scan.nextInt();
		if (input==num) {
			System.out.println("���� ���͸� ��Ҵ�!!");
			System.out.println(chan+"�� ���� ����");
			scan.close();
		}
		else if (input > num) {
			chan ++;
			System.out.println("���� ������ ���ڰ� �� �۽��ϴ�.\n");
		}
		else if (input < num) {
			System.out.println("���� ������ ���ڰ� �� Ů�ϴ�.\n");
			chan++;
		}
		}
	}

}
