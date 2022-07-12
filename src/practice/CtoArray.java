package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class CtoArray {

	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		
		al.add("Pune");
		al.add("Bengaluru");
		al.add("Mumbai");
		al.add("Delhi");
		
		int ss = al.size();
		System.out.println(ss);
		
		//Conversion from collection to array
		String[] aa = new String[ss];
		
		al.toArray(aa);
		
		for(String obj:aa)
		{
			System.out.println(obj);
		}
		
		
		System.out.println("=================");
		//conversion from array to collection
		String[] demo={"abc","xyz","jkl"};
		
		ArrayList al2 = new ArrayList<>(Arrays.asList(demo));
		System.out.println(al2);
	}

}
