package practice;

public class LeapYear {

				//4,400  //100!--> leap year.
	public static void main(String[] args) 
	{
			int year=2018;
			if(year%4==0)
			{
				if(year%100==0)
				{
					if(year%400==0)
					{
						System.out.println("the year is leap year");
					}
					else
					{
						System.out.println("not a leap year");
					}
	
				}
				else
				{
					System.out.println(" leap year");
				}
			}
			else
			{
				System.out.println("not a leap year");
			}

	}

}
