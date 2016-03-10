package Lesson4;

import java.util.Scanner;

public class RunMyPower {

	static MyPower power1;
//	static MyPower power2 = new MyPower();
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		
		power1 = new MyPower();
		boolean inputOK = false;

		// LOOP 
		System.out.print("Please enter the base number:");
		double b2 = inp.nextDouble();
		
		int noLoop = 0;
		while(!inputOK) {
			System.out.print("Please enter the exponent:");
			double ex2 = inp.nextDouble();
		
			inputOK = power1.CheckExponent(ex2);
			
			if( inputOK ) { 
				double res2 = power1.Run(b2,ex2);
				System.out.println("Res2 is "+res2);
			} else {
				switch (noLoop) {
				case 0:
					System.out.println("I don't know how to handle a non-integer exponent.  Please try again.");
					break;
				case 1:
					System.out.println("I said don't know how to handle a non-integer exponent.  Try again.");
					break;
				case 2:
					System.out.println("This is the last warning.  Enter an integer exponent.");
					break;
				default:
					System.out.println("You are hopeless.  I quit.");
					inputOK = true;
					break;
				}
			}
			noLoop++;
		}
	}

}
