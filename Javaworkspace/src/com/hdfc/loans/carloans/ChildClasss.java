package com.hdfc.loans.carloans;

public class ChildClasss extends Employee2
	{
		int x;
		
	public ChildClasss(int x)
	{
			super(14,"swat",14.22f);
			this.x=x;
			System.out.println(this.x);
	}

	public static void main(String[] args)
	{
		ChildClasss s1 = new ChildClasss(1422);
		
	}

}
