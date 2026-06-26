package jp.ac.hal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SampleP3 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("あなたは何歳ですか？");
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		int age = Integer.parseInt(str);
		
		System.out.println("あなたは" + age + "歳です。");
		

	}

}
