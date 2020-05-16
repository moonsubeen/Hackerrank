package com.day5.exception;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HomeWork6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		Set<String> keys = map.keySet();
		System.out.println("몇개의 수를 입력하겠습니까?");
		int n = scan.nextInt();
		System.out.println("합 : " + plus(calc(n), n));
	}
	
	public static HashMap calc(int n)
	{
		Scanner scan = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		int num1 = 10;
		for(int i = 0; i < n; i++)
		{
			map.put("num" + (i+1), scan.nextInt());
		}
		return map;
	}
	
	public static int plus(HashMap map, int n)
	{	
		return (int) map.get("num1") + (int) map.get("num2");
	}
}
