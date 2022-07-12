package practice;

public class DuplicateChar 
{

	public static void main(String[] args) 
	{
		String str="mashukrajeshakshayswapnil";
		char[]ar=str.toCharArray();      //convert string into character array.
		for(int i=1;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(ar[i]==ar[j]) 
				{
					System.out.println("duplicate characters are :"+ar[j]);
					break;
				}
			}
		}

	}

}
