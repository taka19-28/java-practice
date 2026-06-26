package jp.ac.hal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class O_dai4 {

	public static void main(String[] args) throws IOException
	{
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("指定した範囲の整数を合計します。");
		System.out.print("整数を入力してください：");
		
		String str = br.readLine();
		int x = Integer.parseInt(str);
		
		System.out.print("整数を入力してください：");
		
		String str2 = br.readLine();
		int y = Integer.parseInt(str2);
		
		int num = 0;
		
		if (x < y) {
			for(int i = x; i <= y; i++) {
				num = num + i;
			}
			System.out.println(x + "～" + y + "の合計は" + num + "です。");
		}else {
			for(int i = y; i <= x; i++) {
				num = num + i;
			}
			System.out.println(y + "～" + x + "の合計は" + num + "です。");
		}
		
	}

}
