package com.day5.exception;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Balanced_Stack {
	// Complete the isBalanced function below.
    static String isBalanced(String s) {
    	char[] s_word;
    	s_word = s.toCharArray();
    	Stack<Character> stack = new Stack<>();
    	int count = 0;
    	
    	String result = null;
    	
    	if(s_word.length % 2 != 0)
    	{
    		result = "NO";
    	}
    	for(int i = 0; i < s_word.length; i++)
    	{
    		if(stack.size() == 0)
    			stack.push(s_word[i]);
    		else if(s_word[i] == '}' && stack.peek() == '{')
    			stack.pop();
    		else if(s_word[i] == ']' && stack.peek() == '[')
    			stack.pop();
    		else if(s_word[i] == ')' && stack.peek() == '(')
    			stack.pop();
    		else
    			stack.push(s_word[i]);
    	}
    	if(stack.size() == 0)
    		result = "YES";
    	else
    		result = "NO";
    
		return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();

            String result = isBalanced(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
