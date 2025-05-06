package com.test1;

import java.util.Scanner;

public class P1 {
	public static void main(String args[]) {
		System.out.println("Hello World");
		
		float res=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num1 = sc.nextInt();
		res = num1 *num1;
		System.out.println("the Square is"+ " "+ res);
	}
}
