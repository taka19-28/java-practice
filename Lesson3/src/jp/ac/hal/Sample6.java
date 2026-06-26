package jp.ac.hal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample6 {

	public static void main(String[] args) throws IOException
	{
		System.out.println("整数と小数点数を入力してください。");
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		int num1 = Integer.parseInt(str1);
		double num2 = Double.parseDouble(str2);
		
		System.out.println("最初に" + num1 + "が入力されました。");
		System.out.println("次に " + num2 + "が入力されました。");
		

	}



}
