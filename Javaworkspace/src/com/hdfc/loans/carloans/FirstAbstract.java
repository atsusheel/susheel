package com.hdfc.loans.carloans;

public abstract class FirstAbstract {
	
	public void m1() {
		System.out.println("i am m1 concret from abstract class");
		
	}
   public abstract void m2();
   
	public static void main(String[] args) {
		FirstAbstract h1 = new ChildClass();
		h1.m1();
		h1.m2();

	}

}
