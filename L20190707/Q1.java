package L20190707;

public class Q1 {

	public static void main(String[] args) {
		String st = "abcde"; //���ڿ� �Է�
		solution(st, ""); //solution ȣ��
	}

	public static void solution(String st, String result) {
		if (st.length() % 2 == 0) { //���ڿ� ���̰� ¦����
			 result=st.substring(st.length()/2-1,(st.length()/2)+1); //��� �� �ڸ�
			
		}
		else {
			 result=st.substring(st.length()/2,(st.length()/2)+1); //��� �� �ڸ�
		}
		System.out.println(result); //���
	}

}
