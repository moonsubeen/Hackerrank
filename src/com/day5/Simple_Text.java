package com.day5;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Simple_Text {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		File f2 = new File("C:\\Users\\삼성\\eclipse-workspace\\hackerrank\\TexT_output07.txt");
//		try {
//	    	scanner = new Scanner(f2);
//	    } catch (Exception e) {
//	    	e.printStackTrace();
//	    }
//		
//		ArrayList<Character> outList = new ArrayList<Character>();
//		while(scanner.hasNext()) {
//			String outStr = scanner.nextLine();
//			Character out = outStr.charAt(0);
//			outList.add(out);	
//		}
//		
//		// input
//		File f = new File("C:\\Users\\삼성\\eclipse-workspace\\hackerrank\\TexT_input07.txt");
//	    
//	    try {
//	    	scanner = new Scanner(f);
//	    } catch (Exception e) {
//	    	e.printStackTrace();
//	    }
//	    
	    
//		Scanner scan = new Scanner(System.in);
		
		Stack<String> stack = new Stack();
		Stack<Integer> stack2 = new Stack();
		String txt = null;
		String s = "";
		int m, k, j;
		
		int n = scanner.nextInt();
		String[] str = new String[n];
		
    	
		
		for(int i = 0; i < n; i ++)
		{
			m = scanner.nextInt();
			if(m == 1)
			{
				txt = scanner.next();
				s = s + txt;
				stack.push(txt);
				stack2.push(1);
			}
			if(m == 2)
			{
				k = scanner.nextInt();
				stack.push(s.substring(s.length() - k, s.length()));
				s = s.substring(0, s.length() - k);
				stack2.push(2);
			}
			if(m == 3)
			{
				j = scanner.nextInt();
				System.out.println(s.charAt(j - 1));
				
				
				//////
//				if(outList.get(i) != s.charAt(j - 1)) {
//		        	System.out.println("Error : " + i);
//		        }
			}
			if(m == 4)
			{
				if(stack2.peek() == 2)
				{
					stack2.pop();
					s = s + stack.peek();
					stack.pop();
					
				}
				else if(stack2.peek() == 1)
				{
					stack2.pop();
					s = s.replace(stack.peek(), "");
					stack.pop();
				}
			}

		}
		
		
	}
}
