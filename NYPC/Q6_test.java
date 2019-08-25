package NYPC;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q6_test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String EMAIL_PATTERN = "^[--.0-9@-@A-Za-z]*$";

		
		String[] adress = new String[n];
		String[] local = new String[n];
		String[] domain = new String[n];


		
		for (int i = 0; i < n; i++) {
			adress[i] = sc.next();
			if(adress[i].contains("@")) {
				
			      String[] forCount = new String[n];
	               int count = 0;
	               for(int j = 0; j<adress[i].length(); j++){
	                       if(forCount[i]=="@"){
	                              count=+1;
	                       }

	               }
	               System.out.println(count);
		
				
				
				
				
				int idx = adress[i].indexOf("@"); 
		        local[i] = adress[i].substring(0, idx);
		        
		        domain[i] = adress[i].substring(idx+1);
		
			}
			
			else{
				System.out.println("No");

			}
				
		}
		
		Pattern p = Pattern.compile(EMAIL_PATTERN);
		for (int i = 0; i < n; i++) {
			if(adress[i].contains("@")) {
				Matcher m = p.matcher(adress[i]);

				
				if(local[i].length()>100 || domain[i].length()>100) {
					System.out.println("No");
				}
				else {
					if (m.find()) {
					    System.out.println("Yes");
					 }
				else {
					System.out.println("No");
				}
				}
				
				
				
			}
			
			
			
			
		}
		}
			  
		
		
	
	
	

}
