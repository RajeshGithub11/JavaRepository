package logicalPrograms;

import java.util.Scanner;

public class PalindromeNo {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter String to be reversed");
		String org = sc.next();
		String rev="";
		
		for(int i=org.length()-1;i>=0;i--)
		{
			rev=rev+org.charAt(i);
		}
		
			System.out.println("The Original String is: "+org);
			System.out.println("The Reverse Strig is: "+rev);
			
		if(org.equals(rev))
		{
			System.out.println("Given string is Palindrome");
		}
		else
		{
			System.out.println("Given String is not palindrome");
		}
	}

}
