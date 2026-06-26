package jp.ac.hal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class O_dai3 {

	public static void main(String[] args) throws IOException
	{
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("開始の整数を入力してください：");
		
		String str = br.readLine();
		int start = Integer.parseInt(str);
		
		System.out.print("終了の整数を入力してください：");
		
		String str2 = br.readLine();
		int end = Integer.parseInt(str2);
		
		int num= 0;
		int i = start;
		
		while(i <= end) {
			num = num + i;
			i++;
		}
		System.out.println(start + "～" + end + "の合計は" + num + "です。");
	}

}
