package jp.ac.hal;

public class Sample10 {

	public static void main(String[] args) 
	{
		int[][] test;
		test = new int[2][5];
		
		test[0][0] = 80;
		test[0][1] = 60;
		test[0][2] = 22;
		test[0][3] = 50;
		test[0][4] = 75;
		test[1][0] = 90;
		test[1][1] = 55;
		test[1][2] = 68;
		test[1][3] = 72;
		test[1][4] = 58;
		
		int num = 0;
		int num2 = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.println((i + 1) + "番目の人の国語の点数は" + test[0][i] + "です。");
			num += test[0][i];
			System.out.println((i + 1) + "番目の人の算数の点数は" + test[1][i] + "です。");
			num2 += test[1][i];
		}
		System.out.println("国語の合計点数は" + num + "点、平均点数は" + (num / 5) + "点です。");
		System.out.println("算数の合計点数は" + num2 + "点、平均点数は" + (num2 / 5) + "点です。");
		
	}

}
