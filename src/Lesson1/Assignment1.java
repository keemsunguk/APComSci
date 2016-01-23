package Lesson1;

import java.util.Scanner;	//input from console

public class Assignment1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("This is Assignment 1");
		
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
		
		resultDiv = x1 / x2;
		System.out.println(x1+" / "+x2+" = "+resultDiv);
		
		input.close();

	}

}
