package L20190707;

public class Q3 {

	public static void main(String[] args) {
		String num = "01033675251"; //��ȭ��ȣ �Է�
		solution(num); //solution ȣ��
	}
	
	public static void solution(String num) {
		String back = num.substring(7,11); //7��°���� 11��° (�ڿ� �� �ڸ�)�� back�� ����
		System.out.println("*******"+back); //*�� back�� ���� ���
	}

}
