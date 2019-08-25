package Lecture20190512;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		int menu = 0;
		int num = 0;
		Scanner sc = new Scanner(System.in);

		outer: while (true) { //outer라는 반복문 안에 => while 반복(계속 반복)
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.println("원하는메뉴(1~3)을 선택하세요. (종료:0)>");

			String tmp = sc.nextLine(); //tmp String으로 입력
			menu = Integer.parseInt(tmp); //menu에 tmp값을 int로 변환 저장

			if (menu == 0) { //menu 0이면 프로그램 종료
				System.out.println("프로그램을 종료합니다");
				break; //반복문 종료

			} else if (!(1 <= menu && menu <= 3)) { // !은 '아니면' 연산자 => 1이상 3이하가 아니면
				System.out.println("메뉴를 잘못 선택하셨습니다. (종료:0)"); //메뉴 잘못 선택 출력
				continue; //else if의 끝으로 이동 => 다음 반복으로 이동
			}

			for (;;) { //무한루프 => for문 조건없음
				System.out.print("계산할 값을 입력하세요 (계산 종료:0, 전체종료 : 99) >");
				tmp = sc.nextLine(); //tmp값 입력
				num = Integer.parseInt(tmp); //tmp값 num에 int로 바꿔서 저장
				
				if(num==0) //계산종료 => num=0이면
					break; //반복문 종료
				if(num==99) //프로그램 종료 => num이 99이면
					break outer; //반복문 전체(outer) 종료
				
				switch (menu) { //menu switch
				case 1: //menu가 1이면
					System.out.println("result=" + num * num); //제곱결과
					break; //swtich종료
				case 2:
					System.out.println("result=" + Math.sqrt(num)); //제곱근 결과 출력
					break;
				case 3:
					System.out.println("result=" + Math.log(num)); //자연로그?
					break;
				}
			}
		}

	}

}
