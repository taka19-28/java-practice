package jp.ac.hal;

public class Sample9 {

	public static void main(String[] args)
	{
		int test[] = {22,57,80,66,50};
		
		for (int i = 0;i < test.length;i++) {
			for (int n = i + 1; n < test.length;n++) {
				if(test[i] < test[n]) {
					int tmp = test[n];
					test[n] = test[i];
					test[i] = tmp;
				}
			}
			System.out.println((i + 1) + "位:" + test[i] + "点");
			
		}
		

	}

}
