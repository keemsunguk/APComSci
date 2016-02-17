package Lesson3;

public class ForEach {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [] a = {6,9,3,4,5};
		
		for (int i = 0; i < 5;i++) {
			System.out.println(a[i]);
		}

		for(int  val : a) {
			System.out.println(val);
		}
	}

}
