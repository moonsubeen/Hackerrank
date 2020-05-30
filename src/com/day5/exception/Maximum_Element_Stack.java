package com.day5.exception;

import java.io.*;
import java.util.*;

public class Maximum_Element_Stack {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Stack<Myobject> stack = new Stack<Myobject>();
		
		int n = scan.nextInt();
		int max = 0;
		
		for(int i = 0; i < n; i++)
		{
			int q = scan.nextInt();
			if(q ==1)
			{
				int j = scan.nextInt();
				if(max < j)
					max = j;
				stack.push(new Myobject(j, max));
			}
			else if(q==2)
			{
				stack.pop();
				if(!stack.isEmpty())
					{
						max = stack.peek().max;
					}
				else
					max = 0;
			}
			else if(q==3)
			{
				System.out.println(stack.peek().max);
			}
		}
	}
	
	private static class Myobject
	{
		int value;
		int max;
		
		Myobject(int value, int max)
		{
			this.value = value;
			this.max = max;
		}
	}
}
