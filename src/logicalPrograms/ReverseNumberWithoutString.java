package logicalPrograms;

public class ReverseNumberWithoutString {

	public static void main(String[] args) 
	{
		int Num=456;
		int revNum=0;
		
		for(int i=Num;i>0;i=i/10)//456,45,4
		{
			int rem = i%10;//6,5,
			revNum=revNum*10+rem;
			//0+6=6
			//60+5=65
			//650+4=654
		}
		
		System.out.println("The orginal number:"+Num);
		System.out.println("The Reverse number:"+revNum);


	}

}
