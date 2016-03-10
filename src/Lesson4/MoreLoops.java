/**
 * 
 */
package Lesson4;

/**
 * @author S Keem
 *
 */
public class MoreLoops {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i;
		int sum = 0;
		// sum the numbers through 5
		for(i = 1; i <= 5; sum += i++) {
			System.out.println("Sum is "+sum);
		}
		System.out.println("Sum is " + sum);
		
//		for(i = 1; i <= 5; i++) {
//			System.out.print(i);
//			System.out.println("Done");
//		}		
		
		int j;
		sum = 100;
		for(j =15; j > 0; j--) {
			sum -= j;
		}
		System.out.println("Show the result: "+ sum);
		
	
		sum = 100;
		j = 0;
		while (sum > 0) {
			j++;
			sum -=j;
		}
		System.out.println("Show the result: "+ sum +" at j is "+j);
		
		sum = 0;
		int fact = 1;
		
//		for( i = 1; i <= 5; i++) {
//			sum += i; // i is known throughout the loop
//			fact *= i; //fact = fact*i
//		}
		
		i = 1;
		while( i <= 5) {
			i++;
			fact *= i; //fact = fact*i
		}
		System.out.println("5! = "+ fact);
	
	}
}
