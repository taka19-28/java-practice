package jp.ac.hal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exanple5 {

	public static void main(String[] args) throws IOException{
		System.out.println("成績を入力してください。");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		int lank = Integer.parseInt(str);
		
		if(lank == 1) {
			System.out.println("もっとがんばりましょう。");
		}else if(lank == 2) {
			System.out.println("もう少しがんばりましょう。");
		}else if(lank == 3) {
			System.out.println("さらに上をめざしましょう。");
		}else if(lank == 4) {
			System.out.println("たいへんよくできました。");
		}else if(lank == 5){
			System.out.println("たいへん優秀です。");
		}else {
			System.out.println("1～5の数字を入力してください。");
		}

	}

}
