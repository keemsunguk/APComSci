/**
 * 
 */
package Lesson1;

import java.util.Scanner;
/**
 * @author S Keem
 *
 */
public class GetInput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		
		System.out.print("Enter number:");
		double x = num.nextDouble();
		System.out.println("You entered "+x);
		
		num.close();
	}

}
