package lol;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �����Ͻðڽ��ϱ�? 1)��/(2)�ƴϿ� : ");
		int choose = sc.nextInt();
		
		if(choose ==1) {
			System.out.println("\n��, ��Ī�� �����ϰڽ��ϴ�.\n\n������ ��Ī�Ǿ����ϴ�.");
		     String Names[] = { "ž","������","�̵�","����","����" };
		     int position = (int)(Math.random()*4);   
			 System.out.println("����� �������� "+Names[position]+"�Դϴ�.");
		}
		else
		{
			
		}

	}

}
