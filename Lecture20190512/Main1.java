package Lecture20190512;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		int menu = 0;
		int num = 0;
		Scanner sc = new Scanner(System.in);

		outer: while (true) { //outer��� �ݺ��� �ȿ� => while �ݺ�(��� �ݺ�)
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.println("���ϴ¸޴�(1~3)�� �����ϼ���. (����:0)>");

			String tmp = sc.nextLine(); //tmp String���� �Է�
			menu = Integer.parseInt(tmp); //menu�� tmp���� int�� ��ȯ ����

			if (menu == 0) { //menu 0�̸� ���α׷� ����
				System.out.println("���α׷��� �����մϴ�");
				break; //�ݺ��� ����

			} else if (!(1 <= menu && menu <= 3)) { // !�� '�ƴϸ�' ������ => 1�̻� 3���ϰ� �ƴϸ�
				System.out.println("�޴��� �߸� �����ϼ̽��ϴ�. (����:0)"); //�޴� �߸� ���� ���
				continue; //else if�� ������ �̵� => ���� �ݺ����� �̵�
			}

			for (;;) { //���ѷ��� => for�� ���Ǿ���
				System.out.print("����� ���� �Է��ϼ��� (��� ����:0, ��ü���� : 99) >");
				tmp = sc.nextLine(); //tmp�� �Է�
				num = Integer.parseInt(tmp); //tmp�� num�� int�� �ٲ㼭 ����
				
				if(num==0) //������� => num=0�̸�
					break; //�ݺ��� ����
				if(num==99) //���α׷� ���� => num�� 99�̸�
					break outer; //�ݺ��� ��ü(outer) ����
				
				switch (menu) { //menu switch
				case 1: //menu�� 1�̸�
					System.out.println("result=" + num * num); //�������
					break; //swtich����
				case 2:
					System.out.println("result=" + Math.sqrt(num)); //������ ��� ���
					break;
				case 3:
					System.out.println("result=" + Math.log(num)); //�ڿ��α�?
					break;
				}
			}
		}

	}

}
