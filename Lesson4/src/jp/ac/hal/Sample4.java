package jp.ac.hal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample4 {

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		//四則演算
		System.out.println("num1とnum2にいろいろな演算を行います。" );
		System.out.println("num1+num2は" + (num1 + num2) + "です。");
		System.out.println("num1-num2は" + (num1 - num2) + "です。");
		System.out.println("num1*num2は" + (num1 * num2) + "です。");
		System.out.println("num1/num2は" + (num1 / num2) + "です。");
		System.out.println("num1%num2は" + (num1 % num2) + "です。");
		//文字列連結
		System.out.println("あいう" + "ABC");
		System.out.println(123 + 456);
		System.out.println("ABC" + 123);
		System.out.println("123" + 456);
		//単項演算子
		System.out.println("プラスは" +(+num1) + "です。");
		System.out.println("マイナスは" +(-num1) + "です。");
	}

}
