package jp.ac.hal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample4 {

	public static void main(String[] args) throws IOException{
		
		System.out.println("テストの点数を入力してください。");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		int test = Integer.parseInt(str);
		
		if(test < 45) {
			System.out.println("もっと頑張りましょう");
		}else if(test<60) {
			System.out.println("不合格です泣");
		}else if(test == 100){
			System.out.println("満点");
		}else {
			System.out.println("合格です笑");
		}
		
		System.out.println("end");

	}

}
