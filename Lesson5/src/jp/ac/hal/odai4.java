package jp.ac.hal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class odai4 {

	public static void main(String[] args) throws IOException
	{
		System.out.println("年齢は?");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		int age = Integer.parseInt(str);
		
		if(age >= 60) {
			System.out.println("シルバー割引あり");
		}else if(age <18) {
			System.out.println("こども割引あり");
		}else {
			System.out.println("割引なし");
		}
		
		System.out.println("end");

	}

}
