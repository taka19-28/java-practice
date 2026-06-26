package jp.ac.hal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class odai3 {

	public static void main(String[] args) throws IOException
	{
		System.out.println("年齢は?");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		int age = Integer.parseInt(str);
		
		if(!(age > 19)) {
			System.out.println("タバコはNG！");
		}
		
		System.out.println("end");

	}

}
