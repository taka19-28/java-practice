package jp.ac.hal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class odai6 {

	public static void main(String[] args) throws IOException
	{
		System.out.println("整数を２つ入力してください。");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		int x = Integer.parseInt(str1);
		int y = Integer.parseInt(str2);
		
		int L = (x > y) ? x : y;
		int S = (x > y) ? y : x;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(L);
		System.out.println(S);

	}

}
