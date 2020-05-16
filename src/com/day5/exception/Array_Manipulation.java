package com.day5.exception;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Array_Manipulation {

	// Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {
    	int[] value = new int[n];
    	int max = 0;
    	
    	// max °ª Ã£±â
    	for(int i = 0; i < queries.length; i++)
    	{
    		int j = queries[i][0] -1;
    		int k = queries[i][1];
    		value[j] = value[j] + queries[i][2];
    		if(k < n)
    			value[k-1] = value[k-1] - queries[i][2];
    	}
    	
    	for(int i = 1; i < n; i++)
    	{
    		value[i] = value[i] + value[i-1];
    		if(value[i] > max)
    			max = value[i];
    	}
    	
    	
    	return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }

        long result = arrayManipulation(n, queries);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }

}
