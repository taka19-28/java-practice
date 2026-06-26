package jp.ac.hal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example2 {

	public static void main(String[] args) throws IOException{
		
		System.out.println("整数を入力してください。");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		int test = Integer.parseInt(str);
		
		if(test % 2 == 0) {
			System.out.println(test + "は偶数です。");
		}else {
			System.out.println(test + "は奇数です。");
		}

	}

}
