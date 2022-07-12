package practice;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) 
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter first No.");
		int a=ss.nextInt();

		System.out.println("Enter second No.");
		int b=ss.nextInt();

		System.out.println("Select Symbol(+,-,*,/)");
		String sym=ss.next();
		int result;
		switch(sym)
		{
		 case "+":result=a+b;
		 System.out.println("Addition is:"+result);
		 break;
		
		 case "-":result=a-b;
		 System.out.println("substraction is:"+result);
		 break;

		 case "*":result=a*b;
		 System.out.println("Multiplication is:"+result);
		 break;

		 case "/":result=a/b;
		 System.out.println("division is:"+result);
		 break;
		
		 default :System.out.println("Invalid Symobol");
		 break;
		}
	}

}
