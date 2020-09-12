package com.day5;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Queue_using_two_stack2 {

	public static void main(String[] args) {
		Deque<Integer> de = new ArrayDeque<Integer>();
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		for(int i = 0; i < a; i++)
		{
			int j = scan.nextInt();
			if(j == 1)
			{
				int k = scan.nextInt();
				de.add(k);
			}
			else if(j == 2)
				de.poll();
			else
			{
				System.out.println(de.peek());
			}
		}
	}

}
