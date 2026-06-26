package jp.ac.hal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample5_1 {

	public static void main(String[] args) throws IOException
	{
		System.out.println("今日の体温は？:");
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		int num1 = Integer.parseInt(str);
		double num2 = Double.parseDouble(str);
		
		System.out.println("int: " + num1 + "℃");
		System.out.println("double: " + num2 + "℃");

	}


}
