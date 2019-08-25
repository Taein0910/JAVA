package NYPC;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int B = sc.nextInt();
        int[] buiNum = new int [M];
        int[] needUm = new int [M];
        int[] hasUmin =  new int[M];
        int count= 0;
        int buiNumTemp = 0;
        int needUmTemp = 0;
        
        for(int i=0; i<M; i++) {
        	buiNum[i] = sc.nextInt();
        	needUm[i] = sc.nextInt();
        }
        
        
        for(int i=0; i<M; i++) {
        	if(buiNumTemp ==0) {
        		switch(needUm[i]) {
            	case 0:
            		hasUmin[buiNum[i]-1]=0;
            		break;
            	
            	case 1:
            		if(hasUmin[buiNum[i]-1] == 1) {
            			hasUmin[buiNum[buiNum[i]-1]]=0;
            		}
            		else {
            			count=count+1;
            			hasUmin[buiNum[i]-1]=1;
                		
                		break;
            		}
        	}
        	}
        	else {
        		switch(needUm[i]) {
            	case 0:
            		hasUmin[buiNum[i]-1]=0;
            		break;
            	
            	case 1:
            		if(hasUmin[buiNumTemp-1] == 1) {
            			hasUmin[buiNum[buiNumTemp-1]]=0;
            		}
            		else {
            			count=count+1;
            			hasUmin[buiNum[i]-1]=1;
                		
                		break;
            		}
            		
            	}
            	buiNumTemp = buiNum[i];
            	needUmTemp = needUm[i];
            	
            }
        	}
        
        System.out.println(count);
    
        	
        
	}

}
