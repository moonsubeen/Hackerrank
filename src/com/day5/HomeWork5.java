package com.day5.exception;

import java.util.Scanner;

public class HomeWork5 {

	public static void main(String[] args) {
		int[] person = new int[9];
		double[] avers = new double[3];
		
		input(person);
		aver(person, avers);
		output(avers);
	}
	
	public static void input(int[] person)
	{
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < person.length; i++)
		{
			if(i % 3 == 0)
				System.out.println(String.format("%d", i/3 + 1) + "��° ����� ������ �Է��ϼ���. ");
			person[i] = scan.nextInt();
			while(person[i] > 100)
			{
				System.out.println("������ 100�� ���� ������.");
				person[i] = scan.nextInt();
			}
		}
	}
	
	public static void aver(int[] person, double[] avers)
	{
		for(int i = 0; i < person.length; i++)
		{
			if(i % 3 == 2)
			{
				double aver = (person[i-2] + person[i-1] + person[i]) / 3.00;
				avers[i/3] = aver;
			}
		}
	}
	
	public static void output(double[] avers)
	{
		for(int i = 1; i < 4; i++)
			System.out.println(i + "��° ����� ����� " + String.format("%.2f", avers[i-1]) + "�Դϴ�.");
	}

}
