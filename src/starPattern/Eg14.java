package starPattern;

public class Eg14 {

	public static void main(String[] args) 
	{
		int star1=4;
		int space1=0;
	
		
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=space1;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star1;j++)
			{
				System.out.print("* ");
			}
			System.out.println();

			if(i<4) 
			{
			space1++;
			star1--;
			}
			else
			{
				space1--;
				star1++;
			}

			
		}
	}

}
