package L20190707;

public class Q2 {

	public static void main(String[] args) {
		int a = 100; // a�Է�
		int b = 90; // b�Է�
		solution(a, b); // solution ȣ��
	}
	
	public static void solution(int a, int b) {
		int big = (a > b) ? a : b; // a�� b�߿� �� ū �� ����
		int small = (a < b) ? a : b; // a�� b�߿� �� ���� �� ����
		for (int i = small; i < big; i++) { // ���� ������ ū ������ for
			System.out.println(i); // ��� ���� ���
		}
	}
}
