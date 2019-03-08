package hdfcCarLoan;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		int n = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integer number :");
		n = sc.nextInt();
		System.out.println("Table of " + n + " is :");
		for (int i = 1; i <= 10; i++) {
			System.out.println(n*i);
		}

	}

}
