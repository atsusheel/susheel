package com.hdfc.loans.carloans;

public class Employee 
	{
		int eno;
		String ename;
		float val;
		
		public Employee() 
		{
			System.out.println("I'm default constructor");
		}
		
	
	public Employee(int eno, String ename, float val) 
		{
			this.eno=eno;
			this.ename=ename;
			this.val=val;

		}


	public Employee(int eno, String ename)
		{
			this.eno=eno;
			this.ename=ename;
		
		}


	public Employee(int eno) 
		{
			this.eno=eno;
		}


	public static void main(String[] args)
	{
		Employee w1 = new Employee(1422,"susheel",2205.22f);
		System.out.println(w1.eno);
		System.out.println(w1.ename);
		System.out.println(w1.val);
		
		Employee w2 = new Employee(2214,"swat");
		System.out.println(w2.eno);
		System.out.println(w2.ename);
		System.out.println(w2.val);
		
		Employee w3 = new Employee(2214);
		System.out.println(w3.eno);
		System.out.println(w3.ename);
		System.out.println(w3.val);
		
		Employee w4 = new Employee();
		System.out.println(w4.eno);
		System.out.println(w4.ename);
		System.out.println(w4.val);

	}
}
