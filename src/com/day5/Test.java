package com.day5.exception;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test {
	public static void main(String[] args) {
			Test dd = new Test();
			dd.func();
	}
	
	public void func() {
		try {
			File f = new File("test.txt");
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			
			String line = "";
			while(true) {
				line = br.readLine();
				if(line == null)
					break;
				else
					System.out.println(line);
			}
			
			br.close();
			fr.close();
		}catch(IOException e) {
			System.out.println("파일 관련된 에러가 발생");
			e.printStackTrace();
		}
		
	}
}
