package jp.ac.hal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample2_2 {

	public static void main(String[] args) throws IOException
	{
		System.out.println("文字数を入力してください。");

		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int num = Integer.parseInt(str);
		
		String[] test;
		test = new String[5];
		
		System.out.println("人数分の点数を入力してください。");
		
		for (int i=0; i<num; i++) {
			str = br.readLine();
			test[i] = str;
		}
		
		for (int i=num - 1; i>= 0; i--) {
			System.out.println(test[i]);
		}

	}

}
