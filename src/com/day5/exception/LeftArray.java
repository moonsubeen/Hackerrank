package com.day5.exception;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class LeftArray {

	private static final Scanner scanner = new Scanner(System.in);
	
	public static void shift(int[] a)
	{
		for(int i = 0; i < a.length; i++)
		{
			if(i < a.length-1)
				a[i] = a[i+1];
		}
	}
	
	public static void main(String[] args) {
		 	String[] nd = scanner.nextLine().split(" ");

	        int n = Integer.parseInt(nd[0]);

	        int d = Integer.parseInt(nd[1]);

	        int[] a = new int[n];

	        String[] aItems = scanner.nextLine().split(" ");
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int i = 0; i < n; i++) {
	            int aItem = Integer.parseInt(aItems[i]);
	            a[i] = aItem;
	        }

	        scanner.close();
	        
//	        int ind = 0;
//	        for(int j = 0; j < d; j++)
//	        {
//	        	int raitem = a[ind];
//	        	for(int k = 0; k < n; k++)
//	        	{
//	        		if(k < n-1)
//	        			a[k] = a[k+1];
//	        	}
//	        	a[n-1] = raitem;
//	        }
	        
	        int dix = 0;
	        for(int j = 0; j < d; j++)
	        {
	        	int r = a[dix];
	        	shift(a);
	        	a[n-1] = r;
	        }
	        
	        
	        for(int m = 0; m < n; m++)
	        {
	        	System.out.print(a[m] + " ");
	        }

	}

}
