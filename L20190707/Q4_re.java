package L20190707;
import java.util.*;
class Q4_re {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3 }; // arr배열
		solution(arr); // solution호출
	}

	public static void solution(int[] arr) {
		ArrayList<Integer> result = new ArrayList<Integer>(); // 결과를 출력할 arrayList추가
		if (arr.length == 1) System.out.println(-1); // arr배열의 크기가 1이면 -1출력
		for (int i = 0; i < arr.length; i++) {
			result.add(arr[i]);// result이랑 arr이랑 똑같이 맞추기 (값 복사?)
		}
		result.remove(result.indexOf(Collections.min(result)));
		// result배열에서 가장 작은 값이 있는 위치를 찾고, 삭제
		for (int i = 0; i < result.size(); i++) { // result 배열 출력
			System.out.println(result.get(i));
		}
	}
}