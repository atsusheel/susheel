package com.hdfc.loans.carloans;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsDemo
	{
		
		public static void s1() {
			try {
				BufferedReader s = new BufferedReader(new FileReader("d:\\sus.txt"));
			} catch (FileNotFoundException e) {
			
				e.printStackTrace();
			}
		}
	public static void main(String[] args) 
	{
		s1();

	}

}
