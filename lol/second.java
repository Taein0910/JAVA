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
					 aa = "원딜";
				} else if (a == 1) {
					 aa = "탑";
				} else if (a == 2) {
					 aa = "미드";
				} else if (a == 3) {
					 aa = "서포트";
				} else {
					 aa = "정글";
				}
				int b = (int)(Math.random() * 2);
				if(b == 1) {
					 bb = "레드팀";
				}else {
					 bb = "블루팀";
				}
				System.out.println("게임을 선택 하시오  1. 일반게임  2. 랭크게임  3. 우르프  4. 단일챔피언  5. AI");
				int scan_1 = scan.nextInt();
				if(scan_1 == 1) {
					System.out.println("일반게임을 선택했습니다. 일반게임을 매칭을 하겠습니다............");
					System.out.println("");
					System.out.println("게임이 매칭되었습니다.");
					System.out.println("페이커님의 포지션은 " + aa + " 이고 " + bb + "입니다.");
				}else if(scan_1 == 2) {
					System.out.println("랭크게임을 선택했습니다. 일반게임을 매칭을 하겠습니다............");
					System.out.println("");
					System.out.println("게임이 매칭되었습니다.");
					System.out.println("페이커님의 포지션은 " + aa + " 이고 " + bb + "입니다.");
				}else if(scan_1 == 3) {
					System.out.println("우르프을 선택했습니다. 일반게임을 매칭을 하겠습니다............");
					System.out.println("");
					System.out.println("게임이 매칭되었습니다.");
					System.out.println("페이커님의 포지션은 " + aa + " 이고 " + bb + "입니다.");
				}else if(scan_1 == 4) {
					System.out.println("단일챔피언을 선택했습니다. 일반게임을 매칭을 하겠습니다............");
					System.out.println("");
					System.out.println("게임이 매칭되었습니다.");
					System.out.println("페이커님의 포지션은 " + aa + " 이고 " + bb + "입니다.");
				}else if(scan_1 == 5) {
					System.out.println("AI을 선택했습니다. 일반게임을 매칭을 하겠습니다............");
					System.out.println("");
					System.out.println("게임이 매칭되었습니다.");
					System.out.println("페이커님의 포지션은 " + aa + " 이고 " + bb + "입니다.");
				}
				
			}

		
	}

	
