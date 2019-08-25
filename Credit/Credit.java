package Credit;

import java.util.Arrays;
import java.util.Scanner;

public class Credit {
	static Scanner sc = new Scanner(System.in);
	String result ="";
	public static void main(String[] args) {
		 System.out.print("카드번호를 입력하세요 : ");
	 String input = sc.nextLine();
	 String Name ="";
	 char[] arr = new char[input.length()];
	 for(int i=0; i<input.length(); i++) { //한글자씩 저장
		 arr[i] = input.charAt(i);
	 }
		if(input.length()==15) {
			if(arr[0]=='3' && arr[1]=='4' || arr[0]=='3' && arr[1]=='7') {
				Name="American Express";
			}
		}
		else if(input.length()==13 || input.length()==16) {
			if(arr[0]=='4') {
				Name="Visa";
			}
		}
		else if(input.length()==16) { 
			if(arr[0]=='5' && arr[1]=='1' || arr[0]=='5' && arr[1]=='2' || arr[0]=='5' && arr[1]=='3'|| arr[0]=='5' && arr[1]=='4'|| arr[0]=='5' && arr[1]=='5') {
				Name="MasterCard";
			}
		}
		
		//sum1 -> 완성
		int sum1=0;
		for(int a=input.length()-2; a>=0; a=a-2) {
			int temp = Integer.parseInt(String.valueOf(arr[a]))*2;
			if((int)(Math.log10(temp)+1)!=1) {
				String u = Integer.toString(temp);
				int[] digits = new int[u.length()];
				for (int i = 0; i < u.length(); i++) {
				digits[i] = u.charAt(i) - '0';
				temp=digits[i];
				sum1=sum1+temp;
				}
				
				
			}
			else {
				sum1=sum1+temp;

			}
			
		}
		
		//sum2
		int sum2=0;
		for(int c=input.length()-1; c>=0; c=c-2) {
			int temp = Integer.parseInt(String.valueOf(arr[c]));
			if((int)(Math.log10(temp)+1)!=1) {
				String u = Integer.toString(temp);
				int[] digits = new int[u.length()];
				for (int i = 0; i < u.length(); i++) {
				digits[i] = u.charAt(i) - '0';
				temp=digits[i];
				sum2=sum2+temp;
				}
				
				
			}
			else {
				sum2=sum2+temp;

			}
			
		}
		
		if((sum1+sum2)%10==0) {
			System.out.print(Name+"의 ");
			System.out.println("유효한 카드번호 입니다.");
		}
		else {
			System.out.println("유효하지 않은 카드번호 입니다.");
			System.out.print(sum1+" "+sum2);

		}
		
		
	}}

















