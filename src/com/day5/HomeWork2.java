package com.day5.exception;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HomeWork2 cal = new HomeWork2();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�� ���� �Է��ϼ���.");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		
		System.out.println("������ �Է��ϼ���.");
		String ao = scan.next();
		
		if(ao.equals("+"))
		{
			System.out.println("����� : " + cal.plus(n1, n2));
		}
		else if(ao.equals("-"))
		{
			System.out.println("����� : " + cal.minus(n1, n2));
		}
		else if(ao.equals("*"))
		{
			System.out.println("����� : " + cal.multi(n1, n2));
		}
		else if(ao.equals("/"))
		{
			System.out.println("����� : " + cal.divi(n1, n2));
		}
		else if(ao.equals("%"))
		{
			System.out.println("����� : " + cal.reminder(n1, n2));
		}
	}
	
	public int plus(int n1, int n2)
	{
		return n1 + n2;
	}
	
	public int minus(int n1, int n2)
	{
		return n1 - n2;
	}
	
	public int multi(int n1, int n2)
	{
		return n1 * n2;
	}
	
	public int divi(int n1, int n2)
	{
		return n1 / n2;
	}
	
	public int reminder(int n1, int n2)
	{
		return n1 % n2;
	}
}
