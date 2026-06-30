package jp.ac.hal;

public class Sample4 {

	public static void main(String[] args) {
		int[] test = {80,60,22,50,75};
		int sum = 0;
		for (int i=0; i<5; i++) {
			System.out.println((i+1) + "番目の人の人数は" + test[i] + "です。");
			sum += test[i];
		}

	System.out.println("合計点数:" + sum);
	}

}
