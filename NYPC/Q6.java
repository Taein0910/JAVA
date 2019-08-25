package NYPC;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt() + 1;
		String pattern = "^[--.0-9@-@A-Za-z]*$";
		boolean d;

		String email[] = new String[t];
		String a[][] = new String[t][];
		char localPart, domainPart;
		for(int i = 0; i < t; i++)
		{
		email[i] = sc.nextLine();
		}
		for(int i = 1; i < t; i++)
		{
		a[i] = email[i].split("@");
		localPart = email[i].charAt(0);
		domainPart = email[i].charAt(email[i].length() -1);
		if(a[i].length != 2 || localPart == '@' || domainPart == '@')
		{
		System.out.println("No");
		continue;
		}
		d = Pattern.matches(pattern, email[i]);
		if(d == true)
		{
		System.out.println("Yes");
		}
		else
		{
		System.out.println("No");
		}
		}
		
	}
}