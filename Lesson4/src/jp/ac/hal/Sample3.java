package jp.ac.hal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample3 {

	public static void main(String[] args) throws IOException
	{
		System.out.println("整数と小数点数を入力してください");
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		//文字列のままでは計算できないので型変換
		int int_num1 = Integer.parseInt(str1);
		double dbl_num2 = Double.parseDouble(str2);
		
		System.out.println("①int:" + int_num1);
		System.out.println("②double:" + dbl_num2);
		System.out.println("③int_num1+dbl_num2:" + (int_num1 + dbl_num2));
		

	}

}
