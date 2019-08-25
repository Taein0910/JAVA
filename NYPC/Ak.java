package NYPC;

import java.util.Scanner;

public class Ak {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt(); 
		int b = sc.nextInt(); 
		
        int cnt = 0;         
        int sum = 0;
        if()
        for(int i=a;i<=b;i++)
        {
            for(int j=1;j<=i;j++) 
            {
                if(i%j==0)      
                {
                    cnt++;    
                }
            }
            sum = sum + cnt;
            cnt=0; 
            
        }
        
        System.out.println(sum);


	}

}
