package logicalPrograms;

public class PrimeNo {

	public static void main(String[] args) 
	{
		int num=8;
		int count=0;
		
		for(int i=2;i<num;i++)
		{
			if(num %i==0)
			{
				count=count+1;
				break;
			}
		}
		if(count>0)
		{
			System.out.println("Given no is not a prime number");
		}
		else
		{
			System.out.println("Given no is prime number");
		}

	}

}
