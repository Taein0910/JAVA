package L20190707;

public class Q2 {

	public static void main(String[] args) {
		int a = 100; // a입력
		int b = 90; // b입력
		solution(a, b); // solution 호출
	}
	
	public static void solution(int a, int b) {
		int big = (a > b) ? a : b; // a와 b중에 더 큰 값 저장
		int small = (a < b) ? a : b; // a와 b중에 더 작은 값 저장
		for (int i = small; i < big; i++) { // 작은 수에서 큰 수까지 for
			System.out.println(i); // 가운데 정수 출력
		}
	}
}
