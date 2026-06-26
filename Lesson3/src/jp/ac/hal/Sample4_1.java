package jp.ac.hal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample4_1 {

	public static void main(String[] args) throws IOException
	{
		System.out.print("今日の体温は？:");
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		System.out.println("今日の体温は" + str + "℃");

	}

}
