package com.day5.exception;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'dynamicArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY queries
     */

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
    	// Integer[][] 고정된 2차원 배열 -> 사이즈를 정해줘야한다
    	// 초기의 크기 : a[3][], 3개의 줌만 사용
    	// Lsit<List<Integer>> 가변크기의 2차원 배열 -> 크기가 안정해짐
    	// 초기의 크기 : a[0][0], 필요한 만큼 그때마다 추가해서 사용
    	
    	// 변수 부문
    	int lastAnswer = 0;
    	List<List<Integer>> seqlist = new ArrayList<List<Integer>>();
    	for(int i = 0; i < n; i++)
    	{
    		seqlist.add(new ArrayList<Integer>());
    	}
    	List<Integer> result = new ArrayList();
    	
    	// 처리 부문
    	for(int i = 0; i<queries.size(); i++)
    	{
    		if(queries.get(i).get(0) == 1)
        	{
    			seqlist.get(((queries.get(i).get(1) ^ lastAnswer) % n)).add(queries.get(i).get(2));
        	}
    		else if(queries.get(i).get(0) == 2)
        	{
    			lastAnswer = seqlist.get(((queries.get(i).get(1) ^ lastAnswer) % n)).get(queries.get(i).get(2) % seqlist.get(  (  (queries.get(i).get(1) ^ lastAnswer) % n)  ).size());
    			result.add(lastAnswer);
        	}
    	}
    	
    	return result;
    }

}

public class Dynamic_Array {
	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int q = Integer.parseInt(firstMultipleInput[1]);

        List<List<Integer>> queries = new ArrayList<>();

        IntStream.range(0, q).forEach(i -> {
            try {
                queries.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> result = Result.dynamicArray(n, queries);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
