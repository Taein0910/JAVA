package lol;

import java.util.Scanner;

public class second {

	public static void main(String[] args) {
				// TODO Auto-generated method stub
				@SuppressWarnings("resource")
				Scanner scan = new Scanner(System.in);
				String aa;
				String bb;
				int a = (int) (Math.random() * 4);
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
				int b = (int)(Math.random() * 2);
				if(b == 1) {
					 bb = "������";
				}else {
					 bb = "�����";
				}
				System.out.println("������ ���� �Ͻÿ�  1. �Ϲݰ���  2. ��ũ����  3. �츣��  4. ����è�Ǿ�  5. AI");
				int scan_1 = scan.nextInt();
				if(scan_1 == 1) {
					System.out.println("�Ϲݰ����� �����߽��ϴ�. �Ϲݰ����� ��Ī�� �ϰڽ��ϴ�............");
					System.out.println("");
					System.out.println("������ ��Ī�Ǿ����ϴ�.");
					System.out.println("����Ŀ���� �������� " + aa + " �̰� " + bb + "�Դϴ�.");
				}else if(scan_1 == 2) {
					System.out.println("��ũ������ �����߽��ϴ�. �Ϲݰ����� ��Ī�� �ϰڽ��ϴ�............");
					System.out.println("");
					System.out.println("������ ��Ī�Ǿ����ϴ�.");
					System.out.println("����Ŀ���� �������� " + aa + " �̰� " + bb + "�Դϴ�.");
				}else if(scan_1 == 3) {
					System.out.println("�츣���� �����߽��ϴ�. �Ϲݰ����� ��Ī�� �ϰڽ��ϴ�............");
					System.out.println("");
					System.out.println("������ ��Ī�Ǿ����ϴ�.");
					System.out.println("����Ŀ���� �������� " + aa + " �̰� " + bb + "�Դϴ�.");
				}else if(scan_1 == 4) {
					System.out.println("����è�Ǿ��� �����߽��ϴ�. �Ϲݰ����� ��Ī�� �ϰڽ��ϴ�............");
					System.out.println("");
					System.out.println("������ ��Ī�Ǿ����ϴ�.");
					System.out.println("����Ŀ���� �������� " + aa + " �̰� " + bb + "�Դϴ�.");
				}else if(scan_1 == 5) {
					System.out.println("AI�� �����߽��ϴ�. �Ϲݰ����� ��Ī�� �ϰڽ��ϴ�............");
					System.out.println("");
					System.out.println("������ ��Ī�Ǿ����ϴ�.");
					System.out.println("����Ŀ���� �������� " + aa + " �̰� " + bb + "�Դϴ�.");
				}
				
			}

		
	}

	
