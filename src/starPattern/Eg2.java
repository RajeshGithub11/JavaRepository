package starPattern;

public class Eg2 {

	public static void main(String[] args) 
	{
		int star=5;
		//i-->row=5 , j--.column=5
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			star--;
		}
	}

}
