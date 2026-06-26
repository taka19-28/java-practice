package jp.ac.hal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class O_dai5 {

	public static void main(String[] args) throws IOException
	{
		System.out.println("テストの点数を5回入力してください。");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		int num = 0;
		
		for (int i = 0; i < 5; i++) {
			String str = br.readLine();
			num = num + Integer.parseInt(str);
		}
		
		System.out.println("合計点は" + num + "です。");
		System.out.println("平均点は" + (num / 5) + "です。");
	}

}
