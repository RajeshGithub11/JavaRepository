package logicalPrograms;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter Value A");
		int A = sc.nextInt();
		
		System.out.println("Please Enter Value B");
		int B = sc.nextInt();
		
		int sum=A+B;
		System.out.println("The Addition of A and B is: "+sum);
		
	}

}
