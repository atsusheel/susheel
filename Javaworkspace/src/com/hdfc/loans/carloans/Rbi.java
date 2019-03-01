package com.hdfc.loans.carloans;

public interface Rbi {
	   
	public void withdrawl();
	public void deposit();
	
	public static void main(String[] args) {
		
		Rbi obj;
		
		obj = new Icici();
		
		obj.deposit();
		obj.withdrawl();
		
		obj = new Hdfc();
		
		obj.deposit();
		obj.withdrawl();
	}
}
