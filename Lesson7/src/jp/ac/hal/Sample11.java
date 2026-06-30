package jp.ac.hal;

public class Sample11 {

	public static void main(String[] args) {
		int[][] test = {{80,60,22,50},{90,55,68,72},{33,75,63}};
		String kyo = "国語";
		
		for (int i = 0; i<test.length; i++) {
			int tmp = 0;
			System.out.println((i + 1) + "番目の配列要素の長さは" + test[i].length + "です。");
			for ( int j = 0; j < test[i].length;j++) {
				if (test[i][j] > tmp) {
					tmp = test[i][j];
				}
			}
			System.out.println(kyo + "最高点数:" + tmp);
			if (i == 0) {
				kyo = "算数";
			}else {
				kyo = "理科";
			}
		}

	}

}
