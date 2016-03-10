package Lesson4;

public class ArrayDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//create double array
		
		double [] no = new double [200];	//array of size 200
		
		for(int i = 0; i <200; i++) {
			no[i] = i*2;
		}
		
		
		for(int i = 0; i < 10; i++) {
			System.out.println(no[i]);
		}
	}

}
