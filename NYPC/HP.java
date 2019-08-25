package NYPC;
import java.util.Scanner;
public class HP {

	public static void main(String[] args) {
		
				Scanner sc = new Scanner(System.in);
				int H = sc.nextInt();
				int T = sc.nextInt();
				int logType[] = new int[T];
				int hpChange[] = new int[T];
				int result=0;
				int currentTurn =1;

				for(int i=0; i<T; i++) {
					logType[i] = sc.nextInt();
					hpChange[i] = sc.nextInt();
				}
				
				int temp=0;
				int result_final = 0;

				for(int i=0; i<T; i++) {
					switch(logType[i]) {
					case 1:
						if(currentTurn==1) {
							result=H-hpChange[i];
						}
						else {
							result=temp-hpChange[i];
						}
						if(result>temp) {
							result_final=result;
						}
					
						temp = result;
						break;
						
					case 2:
						if(currentTurn==1) {
							result=H+hpChange[i];
						}
						else {
							result=temp+hpChange[i];
						}
						if(result>temp) {
							result_final=result;
						}
						temp = result;
						break;
						
					case 3:
						if(currentTurn==1) {
							result=H+hpChange[i];
						}
						else {
							result=temp+hpChange[i];
							result_final=result;
							
						}
						if(result>temp) {
							result_final=result;
						}
						temp = result;
						break;
					}
					currentTurn+=1;
				}
				
						
				System.out.println(result_final);

	}

}
