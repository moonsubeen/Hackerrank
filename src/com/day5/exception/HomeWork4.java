package com.day5.exception;

import java.util.Scanner;

public class HomeWork4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("µÎ ¼ö¸¦ ÀÔ·ÂÇÏ¼¼¿ä.");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		
		int[] cal = calcul(n1, n2);
		System.out.println("Ãâ·Â°ªÀÌ Â÷·Ê´ë·Î µ¡¼À, »¬¼À, °ö¼À, ³ª´°¼À ÀÔ´Ï´Ù.");
		for(int i = 0; i < cal.length; i++)
			System.out.println(cal[i]);
	}
	
	public static int[] calcul(int n1, int n2)
	{
		int[] cal = {n1+n2, n1-n2, n1*n2, n1/n2};
		return cal;
	}
	
}
