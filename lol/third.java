package lol;

import java.util.Scanner;
import java.util.Random;

public class third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		int i;
		String aa;
		String bb;
		String cc = null;
		String dd = null;
		String ee = null;
		String ff = null;
		String gg = null;
		String member1 = null;
		String member2 = null;
		String member3 = null;
		String member4 = null;
		String member5[] = new String[10];
		int a = (int) (Math.random() * 3);
		if (a == 0) {
			aa = "����";

		} else if (a == 1) {
			aa = "ž";
		} else if (a == 2) {
			aa = "�̵�";
		} else if (a == 3) {
			aa = "����Ʈ";
		} else {
			aa = "����";
		}
		int b = (int) (Math.random() * 2);
		if (b == 1) {
			bb = "������";
		} else {
			bb = "�����";
		}

		System.out.println("��Ƽ���� ���� �����ּ��� :");
		int n = scan.nextInt();
		if (n <= 5) {
			System.out.println("������ ���� �Ͻÿ�  1. �Ϲݰ���  2. ��ũ����  3. �츣��  4. ����è�Ǿ�  5. AI");
			int scan_1 = scan.nextInt();
			if (scan_1 == 1) {
				cc = "�Ϲݰ���";
			} else if (scan_1 == 2) {
				cc = "��ũ����";
			} else if (scan_1 == 3) {
				cc = "�츣��";
			} else if (scan_1 == 4) {
				cc = "����è�Ǿ�";
			} else if (scan_1 == 5) {
				cc = "AI";

			}
			for (i = 0; i < 4; i++) {
				member5[i] = r.toString();
			}
			if (n == 5) {
				dd = "��Ƽ��1";
				ee = "��Ƽ��2";
				ff = "��Ƽ��3";
				gg = "��Ƽ��4";
			} else if (n == 4) {
				dd = "��Ƽ��1";
				ee = "��Ƽ��2";
				ff = "��Ƽ��3";
				gg = "�ܺο�1";
			} else if (n == 3) {
				dd = "��Ƽ��1";
				ee = "��Ƽ��2";
				ff = "�ܺο�1";
				gg = "�ܺο� 2";
			} else if (n == 2) {
				dd = "��Ƽ��1";
				ee = "�ܺο�1";
				ff = "�ܺο�2";
				gg = "�ܺο�3";
			} else if (n == 1) {
				dd = "�ܺο�1";
				ee = "�ܺο�2";
				ff = "�ܺο�3";
				gg = "�ܺο�4";
			}
			System.out.println(cc + "�� �����߽��ϴ�. �Ϲݰ����� ��Ī�� �ϰڽ��ϴ�............");
			System.out.println("");
			System.out.println("������ ��Ī�Ǿ����ϴ�.");
			System.out.println("�������� " + bb + " �Դϴ�.");
			System.out.println("����Ŀ���� ��������" + aa);
			System.out.println(dd + "�� ��������" + member1);
			System.out.println(ee + "�� ��������" + member2);
			System.out.println(ff + "�� ��������" + member3);
			System.out.println(gg + "�� ��������" + member4);
		}

	}

}
