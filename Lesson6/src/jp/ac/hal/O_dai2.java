package jp.ac.hal;

public class O_dai2 {

	public static void main(String[] args) 
	{
		int num = 0;
		int k = 0;
		int g = 0;
		for(int i = 0; i <= 10; i++) {
			num += + i;
			if(i % 2 == 0) {
				g = g + i;
			}else {
				k = k + i;
			}
		}
		System.out.println("総和" + num);
		System.out.println("奇数の合計" + k);
		System.out.println("偶数の合計" + g);
	}

}
