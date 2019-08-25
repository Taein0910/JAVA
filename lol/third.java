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
		int b = (int) (Math.random() * 2);
		if (b == 1) {
			bb = "레드팀";
		} else {
			bb = "블루팀";
		}

		System.out.println("파티원의 수를 정해주세요 :");
		int n = scan.nextInt();
		if (n <= 5) {
			System.out.println("게임을 선택 하시오  1. 일반게임  2. 랭크게임  3. 우르프  4. 단일챔피언  5. AI");
			int scan_1 = scan.nextInt();
			if (scan_1 == 1) {
				cc = "일반게임";
			} else if (scan_1 == 2) {
				cc = "랭크게임";
			} else if (scan_1 == 3) {
				cc = "우르프";
			} else if (scan_1 == 4) {
				cc = "단일챔피언";
			} else if (scan_1 == 5) {
				cc = "AI";

			}
			for (i = 0; i < 4; i++) {
				member5[i] = r.toString();
			}
			if (n == 5) {
				dd = "파티원1";
				ee = "파티원2";
				ff = "파티원3";
				gg = "파티원4";
			} else if (n == 4) {
				dd = "파티원1";
				ee = "파티원2";
				ff = "파티원3";
				gg = "외부원1";
			} else if (n == 3) {
				dd = "파티원1";
				ee = "파티원2";
				ff = "외부원1";
				gg = "외부원 2";
			} else if (n == 2) {
				dd = "파티원1";
				ee = "외부원1";
				ff = "외부원2";
				gg = "외부원3";
			} else if (n == 1) {
				dd = "외부원1";
				ee = "외부원2";
				ff = "외부원3";
				gg = "외부원4";
			}
			System.out.println(cc + "을 선택했습니다. 일반게임을 매칭을 하겠습니다............");
			System.out.println("");
			System.out.println("게임이 매칭되었습니다.");
			System.out.println("팀진영은 " + bb + " 입니다.");
			System.out.println("페이커님의 포지션은" + aa);
			System.out.println(dd + "의 포지션은" + member1);
			System.out.println(ee + "의 포지션은" + member2);
			System.out.println(ff + "의 포지션은" + member3);
			System.out.println(gg + "의 포지션은" + member4);
		}

	}

}
