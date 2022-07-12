package logicalPrograms;

import java.util.Scanner;

public class OddEvenNo {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter Value A");
		int A = sc.nextInt();
		
		if(A%2==0)
		{
			System.out.println("The no is Even");
		}
		else
		{
			System.out.println("The no is odd");
		}

	}

}
