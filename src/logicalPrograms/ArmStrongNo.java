package logicalPrograms;

public class ArmStrongNo {

	public static void main(String[] args) 
	{
		//123=1^3+2^3+3^3=1+8+27=36
		//153=1^3+5^3+3^3=1+125+27=153
		
		int orgNum=153;
		int armNum=0;
		
		for(int i=orgNum;i>0;i=i/10)//153,15,1
		{
			int rem = i%10;//3,5,1
			armNum=armNum+(rem*rem*rem);//27,152,153
		}
			
		if(orgNum==armNum)
		{
			System.out.println("Given No "+orgNum+" is Armstrong Number");
		}
		else
		{
			System.out.println("Given No"+orgNum+"is not Armstrong Number");
		}

	}

}
