package L20190707;
import java.util.*;
class Q4_re {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3 }; // arr�迭
		solution(arr); // solutionȣ��
	}

	public static void solution(int[] arr) {
		ArrayList<Integer> result = new ArrayList<Integer>(); // ����� ����� arrayList�߰�
		if (arr.length == 1) System.out.println(-1); // arr�迭�� ũ�Ⱑ 1�̸� -1���
		for (int i = 0; i < arr.length; i++) {
			result.add(arr[i]);// result�̶� arr�̶� �Ȱ��� ���߱� (�� ����?)
		}
		result.remove(result.indexOf(Collections.min(result)));
		// result�迭���� ���� ���� ���� �ִ� ��ġ�� ã��, ����
		for (int i = 0; i < result.size(); i++) { // result �迭 ���
			System.out.println(result.get(i));
		}
	}
}