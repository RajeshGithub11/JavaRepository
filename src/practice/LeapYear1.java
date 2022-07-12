package practice;

public class LeapYear1 {

	public static void main(String[] args) 
	{
		int year=2011;
		if((year%400==0) || (year%4==0 && year%100!=100))
		{
			System.out.println("leap year");
		}
		else
		{
			System.out.println("not a leap year");
		}
		

	}

}
