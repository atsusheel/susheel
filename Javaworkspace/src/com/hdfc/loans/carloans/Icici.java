package com.hdfc.loans.carloans;

public class Icici implements Rbi{

	public static void main(String[] args) {
		Icici in = new Icici();
		in.deposit();
		in.withdrawl();

	}

	@Override
	public void withdrawl() {
		System.out.println("i am over withdrawl method in icici");
		
	}

	@Override
	public void deposit() {
		System.out.println("i am over deposit method in icici");
		
	}

}
