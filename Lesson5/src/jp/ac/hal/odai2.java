package jp.ac.hal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class odai2 {

	public static void main(String[] args) throws IOException
	{
		System.out.print("年齢は?:");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		int age = Integer.parseInt(str);
		
		if(age < 20 || age > 29) {
			System.out.println("20代じゃない！？");
		}
		
		System.out.println("end");

	}

}
