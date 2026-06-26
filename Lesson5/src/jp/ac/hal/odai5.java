package jp.ac.hal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class odai5 {

	public static void main(String[] args) throws IOException
	{
		System.out.println("整数を入力してください。");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		int a = Integer.parseInt(str);
		
		int b = (a < 10) ? 10 : 20;
		
		
		System.out.println(a);
		System.out.println(b);

	}

}
