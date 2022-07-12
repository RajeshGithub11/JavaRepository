package practice;

import java.util.Scanner;

public class ScannerMethod {

	public static void main(String[] args) 
	{
		Scanner ss=new Scanner(System.in);
		
		System.out.println("Enter Name:");
		String name=ss.next();
		
		System.out.println("Enter Gender:");
		char gender=ss.next().charAt(0);
		
		System.out.println("Enter Age:");
		int age=ss.nextInt();
		
		System.out.println("Enter Phone No:");
		long Mob=ss.nextLong();
		
		System.out.println("tha name is:"+name);
		System.out.println("tha grade is:"+gender);
		System.out.println("tha age is:"+age);
		System.out.println("tha Mob is:"+Mob);
		
	}

}
