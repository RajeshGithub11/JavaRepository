package logicalPrograms;

public class FactorialOfNumber {

	public static void main(String[] args) 
	{
		int num=4;
		int fact=1;
		
		for(int i=num;i>=1;i--)
		{
			fact=i*fact;
		}
		System.out.println("Factorial of number is "+fact);
	}

}
