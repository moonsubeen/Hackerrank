package com.day5.exception;

import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class Code {
	public static void main(String[] args) {
//		// stack »ç¿ë¹ý
//				Stack<Integer> stack = new Stack<Integer>();
//				
//				stack.push(3);
//				stack.push(1);
//				stack.push(2);
//				int item = stack.peek();
//				System.out.println(item);
//				System.out.println("size: " + stack.size());
//				stack.pop();
//				stack.pop();
//				item = stack.peek();
//				System.out.println(item);
//				System.out.println("size: " + stack.size());
				
		Code obj = new Code();
		int [][] board = new int [][]
			{
				{0,0,0,0,0},
				{0,0,1,0,3},
				{0,2,5,0,1},
				{4,2,4,4,2},
				{3,5,1,3,1}
			};
//		int[] moves = new int[] {1,5,3,5,1,2,1,4};
		int[] moves = new int[] {1,4,1,4,5,5,5,2};
		int result = obj.solution(board, moves);
		System.out.println(result);
	}
	public int solution(int[][] board, int[] moves) {
		Stack<Integer> stack = new Stack<Integer>();
		int j;
		int items;
		int prepeek = 0;
		int answer = 0;
		for(int i=0; i<moves.length; i++)
		{
			j = moves[i] - 1;
			for(int k=0; k<board.length; k++)
			{
				if(board[k][j]!=0)
				{
					stack.push(board[k][j]);
					if(stack.size()>1)
					{
						int a = stack.pop();
						int b = stack.pop();
						if(a == b)
							answer = answer + 2;
						else
						{
							stack.push(b);
							stack.push(a);
						}
					}
					board[k][j]=0;
					break;
				}
			}
		}
//		System.out.println(stack);
//		System.out.println(stack.size());
        return answer;
    }
}

