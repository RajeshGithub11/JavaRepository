package starPattern;

public class Eg15 {

	public static void main(String[] args) 
	{
		int star1=4;
		int space1=0;
		
		int star2=4;
		int space2=0;
		
		int star3=4;
		int space3=0;
	
		
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
			for(int k=1;k<=space2;k++)
			{
				System.out.print(" ");
			}
			for(int l=1;l<=star2;l++)
			{
				System.out.print("* ");
			}
			for(int x=1;x<=space3;x++)
			{
				System.out.print(" ");
			}
			for(int y=1;y<=star3;y++)
			{
				System.out.print("* ");
			}
			

			if(i<4) 
			{
			star1--;
			space1++;
			
			star2--;
			space2=space2+2;
			
			star3--;
			space3=space3+2;
			}
			else
			{
				star1++;
				space1--;
				
				star2++;
				space2=space2-2;
				
				star3++;
				space3=space3-2;
			}
			System.out.println();
		}	

	}

}
