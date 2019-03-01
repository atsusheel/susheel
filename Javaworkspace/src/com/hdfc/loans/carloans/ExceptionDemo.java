package com.hdfc.loans.carloans;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		int nr, dr, result;
	   Scanner sc = new Scanner(System.in);
	   
	   while (true) 
	   {
		  System.out.print("Enter the neminator value");
		  nr = sc.nextInt();
		  System.out.print("Enter the denominator value");
		  dr = sc.nextInt();
		try 
		{
			result = nr / dr;
			System.out.print(result);
			break;
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			//System.out.println(e);
			//System.out.println("denominator value should be greater than zero.....");
			
		} 
	}
	   
	   }
	}

