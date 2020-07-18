package com.day5.exception;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.print("Hello World");
//		System.out.println("Hello World");
//		System.out.printf("%s", "Hello World");
		
//		for(int i = 2; i < 10; i++)
//		{
//			for(int j = 1; j < 10; j++)
//			{
//				System.out.println(i + " X " + j + " = " + i*j);
//			}
//		}
//		
//		int i = 2;
//		for(int j = 1; j < 10; j++)
//		{
//			System.out.println(i + " X " +  j + " = " + i*j);	
//			if(j == 9 && i < 9)
//			{
//				j = 0;
//				i++;
//				
//			}		
//		}
//		Scanner scan = new Scanner(System.in);
		
//		System.out.println("숫자를 2개 입력하세요.");
//		int num1 = scan.nextInt();
//		int num2 = scan.nextInt();
//		
//		System.out.println("연산자를 입력하세요.");
//		char ao = scan.next().charAt(0);
//		String ao = scan.next();
		
//		switch(ao)
//		{
//			case '+' : System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
//					   break;
//			case '-' : System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
//					   break;
//			case '*' : System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
//					   break;
//			case '/' : System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
//					   break;
//			case '%' : System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
//					   break;
//			default : System.out.println("연산자를 제대로 입력하세요.");
//					  break;
//		}
		
//		switch(ao)
//		{
//			case "+" : System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
//					   break;
//			case "-" : System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
//					   break;
//			case "*" : System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
//					   break;
//			case "/" : System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
//					   break;
//			case "%" : System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
//					   break;
//			default : System.out.println("연산자를 제대로 입력하세요.");
//					  break;
//		}
		
//		if(ao.equals("+"))
//		{
//			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
//		}
//		else if(ao.equals("-"))
//		{
//			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
//		}
//		else if(ao.equals("*"))
//		{
//			System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
//		}
//		else if(ao.equals("/"))
//		{
//			System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
//		}
//		else if(ao.equals("%"))
//		{
//			System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
//		}
		
//		System.out.println("첫번째 사람의 국어,수학,영어 점수를 입력하세요.");
//		int name1_na = scan.nextInt();
//		int name1_ma = scan.nextInt();
//		int name1_en = scan.nextInt();
//		while(name1_na > 100 || name1_ma > 100 || name1_en > 100 )
//		{
//			System.out.println("100보다 큰 점수를 입력하지 마세요.");
//			name1_na = scan.nextInt();
//			name1_ma = scan.nextInt();
//			name1_en = scan.nextInt();
//		}
//		double aver1 = (name1_na + name1_ma + name1_en) / 3.00;
//		System.out.println("첫번째 사람의 평균은 " + String.format("%.2f", aver1) + " 입니다.");
//		
//		System.out.println("두번째 사람의 국어,수학,영어 점수를 입력하세요.");
//		int name2_na = scan.nextInt();
//		int name2_ma = scan.nextInt();
//		int name2_en = scan.nextInt();
//		while(name2_na > 100 || name2_ma > 100 || name2_en > 100 )
//		{
//			System.out.println("100보다 큰 점수를 입력하지 마세요.");
//			name2_na = scan.nextInt();
//			name2_ma = scan.nextInt();
//			name2_en = scan.nextInt();
//		}
//		double aver2 = (name2_na + name2_ma + name2_en) / 3.00;
//		System.out.println("두번째 사람의 평균은 " + String.format("%.2f", aver2) + " 입니다.");
//		
//		System.out.println("세번째 사람의 국어,수학,영어 점수를 입력하세요.");
//		int name3_na = scan.nextInt();
//		int name3_ma = scan.nextInt();
//		int name3_en = scan.nextInt();
//		while(name3_na > 100 || name3_ma > 100 || name3_en > 100 )
//		{
//			System.out.println("100보다 큰 점수를 입력하지 마세요.");
//			name3_na = scan.nextInt();
//			name3_ma = scan.nextInt();
//			name3_en = scan.nextInt();
//		}
//		double aver3 = (name3_na + name3_ma + name3_en) / 3.00;
//		System.out.println("세번째 사람의 평균은 " + String.format("%.2f", aver3) + " 입니다.");
		
//		System.out.println("몇영의 사람인지 입력하세요");
//		int n = scan.nextInt();
//		int[] array = new int[n*3];
//		System.out.println("순서대로 국어,수학,영어의 점수를 입력하세요.");
//		for(int i = 0; i<array.length; i++)
//		{
//			array[i] = scan.nextInt();
//			while(array[i] > 100)
//			{
//				System.out.println("점수는 100을 넘지 마세요.");
//				array[i] = scan.nextInt();
//			}
//			if(i % 3 == 2)
//			{
//				double aver = (array[i-2] + array[i-1] + array[i]) / 3.00;
//				System.out.println(String.format("%d", i/3 + 1) + "번째 사람의 평균은 " + String.format("%.2f", aver) + "입니다.");
//			}
//		}
		int[][] queries = new int[5][3];
		System.out.println(queries.length);
	}

}
