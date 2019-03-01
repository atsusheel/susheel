package com.hdfc.loans.carloans;

public class Employee2 
	{
		int eno;
		String ename;
		float val;
		
		/*public Employee2() 
		{
			System.out.println("I'm default constructor.......!");
		}*/
		
	
	public Employee2(int eno, String ename, float val) 
		{
			this(2214,"swat");
			this.eno=eno;
			this.ename=ename;
			this.val=val;
			
			System.out.println(eno);
			System.out.println(ename);
			System.out.println(val);
		}


	public Employee2(int eno, String ename)
		{
			this(1422);
			this.eno=eno;
			this.ename=ename;
			
			System.out.println(eno);
			System.out.println(ename);
			System.out.println(val);

		
		}


	public Employee2(int eno) 
		{
			//this();
			this.eno=eno;
			
			System.out.println(eno);
			System.out.println(ename);
			System.out.println(val);

		}


	public static void main(String[] args)
	{
		Employee2 w1 = new Employee2(1422,"susheel",2205.22f);
		

	}
}
