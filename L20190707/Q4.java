package L20190707;

public class Q4 {

	public static void main(String[] args) {
		int arr[] = {4, 3, 2, 1};
		solution(arr);

	}
	
	
	public static void solution(int[] arr) {
		int min = 1000000;
		for(int i=0;i<arr.length; i++) {
		    if(min>arr[i]) {
			//min의 값보다 array[i]이 작으면 min = array[i]
			min = arr[i];
		    }
		}
		
		
		
		
	}

}
