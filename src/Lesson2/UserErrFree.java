package Lesson2;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;	//input from console

public class UserErrFree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("This is Assignment 2");
				
				
		try {
			System.out.print("Enter 1st number:");
			
			double x1 = input.nextDouble();
			System.out.print("Enter 2nd number:");
			double x2 = input.nextDouble();
			
			double resultAdd = 0.0;
			double resultSub = 0.0;
			double resultMul = 0.0;
			double resultDiv = 0.0;
					
			resultAdd = x1 + x2;
			System.out.println(x1+" + "+x2+" = "+resultAdd);

			resultSub = x1 - x2;
			System.out.println(x1+" - "+x2+" = "+resultSub);
			
			resultMul = x1 * x2;
			System.out.println(x1+" x "+x2+" = "+resultMul);
					
			if( x2 != 0 ) {
				resultDiv = x1 / x2;
				System.out.println(x1+" / "+x2+" = "+resultDiv);
			} else {
				System.out.println(x1+" / "+x2+" : Divisor must be non-zero");				
			}
		} catch (InputMismatchException err) {		//When there is problem reading it, use the default.
			System.out.println(err);
			System.out.println("You must enter numeric as inputs");
		}
				
		input.close();

	}

}
