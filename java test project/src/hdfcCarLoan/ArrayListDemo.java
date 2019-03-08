package hdfcCarLoan;

import java.util.ArrayList;

public class ArrayListDemo 
{

	public static void main(String[] args)
	{
		ArrayList <Object> a = new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add("susheel");
		a.add(14.22f);
		a.add(20);
		a.add(14);
		
		System.out.println(a);
		System.out.println(a.get(2));
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		System.out.println(a.contains(14));
		a.add(1, 100);
		
		for(Object i:a)
		{
			System.out.println(i);
		}
	}
 
}
