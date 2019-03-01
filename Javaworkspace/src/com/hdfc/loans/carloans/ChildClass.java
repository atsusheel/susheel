package com.hdfc.loans.carloans;

public class ChildClass extends FirstAbstract {

	public static void main(String[] args) {
		
		ChildClass w1 = new ChildClass();
		
		w1.m1();
		w1.m2();

	}

	public void m1() {
		System.out.println("i am m1 override from child class");
		
	}
	@Override
	public void m2() {
		System.out.println("i am override to m2 in child class");
		
	}

}
