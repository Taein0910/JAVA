package L20190707;

public class Q3 {

	public static void main(String[] args) {
		String num = "01033675251"; //전화번호 입력
		solution(num); //solution 호출
	}
	
	public static void solution(String num) {
		String back = num.substring(7,11); //7번째에서 11번째 (뒤에 네 자리)를 back에 저장
		System.out.println("*******"+back); //*과 back을 합쳐 출력
	}

}
