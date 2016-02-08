package Lesson3;

import java.util.Scanner;

public class Calculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double x = 0;
		double y = 0;
		double b = 1;
		double exp = 1;
		int n = 0;
		
		double sum = 0;
		double diff = 0;
		double mul = 0;
		double div = 0;
		
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Enter 1st no: ");
		x = inp.nextDouble();	//to read from the console
		System.out.print("Enter 2nd no: ");
		y = inp.nextDouble();

		sum = x + y;
		diff = x - y;
		mul = x*y;
		div = x/y;

		String a = "Hello";
		String e = "World";
		String c = a+e;
		
		System.out.println(c);
		
//		System.out.println("Sum: "+sum+" Diff: "+diff);
		System.out.println("Sum: "+sum);
		System.out.println("Diff: "+diff);
		System.out.println("Prod: "+mul);
		System.out.println("Div: "+div);
		
		
		System.out.print("Enter base: ");
		b = inp.nextDouble();
		System.out.print("Enter exponent: ");
		n = inp.nextInt();
		
		sum = x + y;


		//exp = 1;
		for(int i = 0; i < n; i++) {	// i = 1; i <= n; i++
			exp = exp * b;
		}

		System.out.println("Exponential Result: "+exp);
		

		
	}

}
