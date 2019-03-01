package com.hdfc.loans.carloans;

public class Hdfc implements Rbi {
	
      public static void main(String[] args) {
		
    	  Hdfc pro = new Hdfc();
  		pro.deposit();
  		pro.withdrawl();
  		
	}
      
	@Override
	public void withdrawl() {
		
		System.out.println("i am over withdrawl method in hdfc");
	}

	@Override
	public void deposit() {
		System.out.println("i am over deposit method in hdfc");
		
	}

}
