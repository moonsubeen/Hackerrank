package com.day5.exception;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("두 수를 입력하세요.");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		
		System.out.println("연산자를 입력하세요.");
		String ao = scan.next();
		
		if(ao.equals("+"))
			plus(n1, n2);
		else if(ao.equals("-"))
			minus(n1, n2);
		else if(ao.equals("*"))
			multi(n1, n2);
		else if(ao.equals("/"))
			divi(n1, n2);
		else if(ao.equals("%"))
			reminder(n1, n2);
		
		
	}
	
	public static void plus(int n1, int n2)
	{
		System.out.println("결과값 : " + (n1+n2));
	}
	
	public static void minus(int n1, int n2)
	{
		System.out.println("결과값 : " + (n1-n2));
	}
	
	public static void multi(int n1, int n2)
	{
		System.out.println("결과값 : " + (n1*n2));
	}
	
	public static void divi(int n1, int n2)
	{
		System.out.println("결과값 : " + (n1/n2));
	}
	
	public static void reminder(int n1, int n2)
	{
		System.out.println("결과값 : " + (n1%n2));
	}
}
