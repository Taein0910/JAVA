package Monster;

import java.util.*;

public class monster {
	static Scanner sc = new Scanner(System.in);
	static Random random = new Random();
	public static void main(String[] args) {
		System.out.print("가로 : ");
		int a= sc.nextInt();
		System.out.print("세로 : ");
		int b= sc.nextInt();
	    String[][] map = new String[a][b]; //맵 생성
	     for(int j=0; j<b; j++) {
	    	for(int i=0; i<a; i++){
	    	   map[i][j] = sc.next();
	    	}
	    }
	     
		 //int[][] user_locate = new int [50][2];

	     int mon_count=0;
	     int user_count=0;
	     for(int j=0; j<b; j++) {
		    	for(int i=0; i<a; i++){
		    	   if(map[i][j]=="m") {
		    		   mon_count=mon_count+1;
		    	   }
		    	   else if(map[i][j]=="c") {
		    		   user_count=user_count+1;
		    		   
		    		   
		    	   }
		    	}
		    }
	     int mon_need=user_count*2;
	     
	     for(int c=0; c<mon_need; c++) {
	    	 int mon_re_x = random.nextInt(a);
	    	 int mon_re_y = random.nextInt(b);
		    	

	    	 
	    	 map[mon_re_x][mon_re_y]="m";

	     }
	     for(int j=0; j<b; j++) {
		    	for(int i=0; i<a; i++){
		    	   System.out.print(map[i][j]);
		    	  
		    	   }System.out.println("");
		    	}
		    	
	     System.out.println(mon_re_x+","+mon_re_y);
	     
	     
	     
	     
	

	}

}
