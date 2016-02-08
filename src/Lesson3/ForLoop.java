package Lesson3;

public class ForLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//for loop
		
		int sum = 0;
		
//		sum = sum + 1;	// sum is 1
//		sum = sum + 2;  // sum is 3
//		sum = sum + 3;  // sum is 6
//		sum = sum + 4;	// sum is 10
		
		//That is what loop does for you
		
		for(int i = 1; i<= 10; i++) {
			System.out.print(i+", ");
		}
		System.out.println();
		
		// for (initial value; condition; increment) { ....... }
		for(int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		System.out.println("Sum: "+sum);

		double x = 1;
		double base = 2;
		
	/*	x = x*base;
		x = x*base;
		x = x*base;
		x = x*base;
		x = x*base;
		x = x*base;
		x = x*base;
		x = x*base;
		x = x*base;
		x = x*base;  //that is dumb......  what if we want to computer 2 to the 100th?????
	*/
		for(int i = 0; i < 20; i++) {  
			x = x*base;
			System.out.println(x);
		}
		/*HW:  compute 2^20*/
		
		
		System.out.println("Exponential: "+x);
	}

}
