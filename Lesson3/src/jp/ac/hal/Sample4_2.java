package jp.ac.hal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample4_2 {

	public static void main(String[] args) throws IOException
	{
		System.out.println("昨日と今日の体温は？");
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		System.out.println("昨日の体温は" + str1 + "℃");
		System.out.println("今日の体温は" + str2 + "℃");

	}

}
