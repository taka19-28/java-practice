package jp.ac.hal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample6 {

	public static void main(String[] args) throws IOException
	{
		System.out.println("整数を３つ入力してください。");
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		String str3 = br.readLine();
		
		int sum = 0;
		sum += Integer.parseInt(str1);
		sum += Integer.parseInt(str2);
		sum += Integer.parseInt(str3);
		
		System.out.println("3つの数の合計は" + sum + "です。");
		System.out.println();
		
		// インクリメント
		int a = 1;
		int b = 0;
		b = ++a; // 前方：a+1してからbに代入
		System.out.println("前方a:" + a);
		System.out.println("前方b:" + b);
		int c = 1;
		int d = 0;
		d = c++; // 後方：dに代入してからcに代入
		System.out.println("後方c:" + c);
		System.out.println("後方d:" + d);

	}

}
