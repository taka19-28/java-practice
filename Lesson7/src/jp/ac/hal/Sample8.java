package jp.ac.hal;

public class Sample8 {

	public static void main(String[] args) 
	{
		int[] test = {80,60,22,50,75,100};
		int sum = 0;
		
		for (int i = 0; i < test.length; i++) {
			System.out.println((i + 1) + "番目の人の点数は" + test[i] + "です。");
			sum += test[i];
		}
		
		System.out.println("テストの受験者は" + test.length + "人です。");
		System.out.println("点数の合計は" + sum + "点です。");
		System.out.println("平均点は" + (sum / test.length) + "点です。");
	}

}
