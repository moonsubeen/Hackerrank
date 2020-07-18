package com.day5.exception;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Game_of_two_Stack {

	static int twoStacks(int x, int[] a, int[] b) {
		int sum = 0;
		int count = 0;
		int maxcount;
		int ai;
		int bi;
		
		for(ai = 0; ai < a.length && sum + a[ai] <= x; ai++)
		{
			sum += a[ai];
			count++;
		}
		
		for(bi = 0; bi < b.length && sum + b[bi] <= x; bi++)
		{
			sum += b[bi];
			count++;
		}
		
		maxcount = count;
		
		for(; ai > 0; ai--)
		{
			sum -= a[ai - 1];
			count--;
			
			for(; bi<b.length && sum + b[bi] <= x; bi++)
			{
				sum += b[bi];
				count++;
			}
			maxcount = Math.max(count, maxcount);
		}
		
		return maxcount;
    }

//    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	Scanner scanner = null;
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    	File f2 = new File("C:\\Users\\삼성\\eclipse-workspace\\hackerrank\\Game_stack_output.txt");
		try {
	    	scanner = new Scanner(f2);
	    } catch (Exception e) {
	    	e.printStackTrace();
	    }
		
		ArrayList<Integer> outList = new ArrayList<Integer>();
		while(scanner.hasNext()) {
			String outStr = scanner.nextLine();
			int out = Integer.parseInt(outStr);
			outList.add(out);
		}
		
		// input
		File f = new File("C:\\Users\\삼성\\eclipse-workspace\\hackerrank\\Game_stack_input.txt");
	    
	    try {
	    	scanner = new Scanner(f);
	    } catch (Exception e) {
	    	e.printStackTrace();
	    }
    	
        int g = Integer.parseInt(scanner.nextLine().trim());

        for (int gItr = 0; gItr < g; gItr++) {
            String[] nmx = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nmx[0].trim());

            int m = Integer.parseInt(nmx[1].trim());

            int x = Integer.parseInt(nmx[2].trim());

            int[] a = new int[n];

            String[] aItems = scanner.nextLine().split(" ");

            for (int aItr = 0; aItr < n; aItr++) {
                int aItem = Integer.parseInt(aItems[aItr].trim());
                a[aItr] = aItem;
            }

            int[] b = new int[m];

            String[] bItems = scanner.nextLine().split(" ");

            for (int bItr = 0; bItr < m; bItr++) {
                int bItem = Integer.parseInt(bItems[bItr].trim());
                b[bItr] = bItem;
            }

            int result = twoStacks(x, a, b);
            if(outList.get(gItr) != result) {
            	System.out.println("Error : " + gItr);
            }

//            bufferedWriter.write(String.valueOf(result));
//            bufferedWriter.newLine();
        }

//        bufferedWriter.close();
    }

}
