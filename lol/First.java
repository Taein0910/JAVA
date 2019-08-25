package lol;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("게임을 시작하시겠습니까? 1)예/(2)아니오 : ");
		int choose = sc.nextInt();
		
		if(choose ==1) {
			System.out.println("\n예, 매칭을 시작하겠습니다.\n\n게임이 매칭되었습니다.");
		     String Names[] = { "탑","서포터","미드","정글","원딜" };
		     int position = (int)(Math.random()*4);   
			 System.out.println("당신의 포지션은 "+Names[position]+"입니다.");
		}
		else
		{
			
		}

	}

}
