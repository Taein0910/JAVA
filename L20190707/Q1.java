package L20190707;

public class Q1 {

	public static void main(String[] args) {
		String st = "abcde"; //문자열 입력
		solution(st, ""); //solution 호출
	}

	public static void solution(String st, String result) {
		if (st.length() % 2 == 0) { //문자열 길이가 짝수면
			 result=st.substring(st.length()/2-1,(st.length()/2)+1); //가운데 두 자리
			
		}
		else {
			 result=st.substring(st.length()/2,(st.length()/2)+1); //가운데 한 자리
		}
		System.out.println(result); //출력
	}

}
