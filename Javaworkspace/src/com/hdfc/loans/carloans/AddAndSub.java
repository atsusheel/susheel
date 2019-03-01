package com.hdfc.loans.carloans;

public class AddAndSub 
		{
		int a,b,c;
		
		public void Add() 
		{
			c = a + b;
			System.out.println("Add :" + c);
		}
		
		public void sub() 
		{
			c = a - b;
			System.out.println("Sub :" + c);
		}
		
		public AddAndSub(int a, int b) 
		{
			this.a=a;
			this.b=b;
		}
		
		public static void main(String[] args) 
		{
			AddAndSub w = new AddAndSub(22,14);
			w.Add();
			w.sub();
			
		}
}
