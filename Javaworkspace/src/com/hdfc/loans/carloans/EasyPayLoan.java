package com.hdfc.loans.carloans;

public class EasyPayLoan {
	
	int a = 10, b = 20, c;
	
	public void add() {
		c = a+b;
		System.out.println("Addition of a & b is: "+c);
		
	}
	
	public void subtract() {
		
		c = a - b;
		
		System.out.println("Subtract af a & b is: "+c);
		
	}
	
	public static void main(String[] args) {
		
		EasyPayLoan obj = new EasyPayLoan();
		
		obj.add();
		
		obj.subtract();
		
		System.out.println("Hello welcome to car loans");
		
		EasyPayLoan sus = new EasyPayLoan();
		
		 sus.add();
		 
		 sus.subtract();
		 
		}
		
	}

