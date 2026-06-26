package jp.ac.hal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class O_dai6 {

	public static void main(String[] args) throws IOException
	{
		System.out.println("テストの点数を入力してください。");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		int num = 0;
		int i = 0;
		
		while (num >= 0) {
			String str = br.readLine();
			
			if (Integer.parseInt(str) == -1) {
				break;
			}
			
			num = num + Integer.parseInt(str);
			i++;
		}
		
		System.out.println("合計点は" + num + "です。");
		System.out.println("平均点は" + (num / i) + "です。");

	}

}
