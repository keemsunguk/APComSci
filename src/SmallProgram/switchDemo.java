package SmallProgram;

import java.util.Scanner;
import java.lang.Math;

public class switchDemo {

	/**
	 * @param args
	 */
	static double x = 0;
	static double y = 0;

	static Scanner inp = new Scanner(System.in);
	
	public static void main(String[] args) {

		int selection  = 0;
		
		System.out.println("====== Caculator Menu ======");
		System.out.println("* 1: Addition              *");
		System.out.println("* 2: Subtraction           *");
		System.out.println("* 3: Multiplication        *");
		System.out.println("* 4: Division              *");
		System.out.println("* 5: Exponent              *");
		System.out.println("* 6: Exit                  *");
		System.out.println("* ======================== *");
		
		
		while( selection != 6) {
			System.out.print("Please enter your selection: ");
			
			selection = inp.nextInt();
			
			switch(selection) {
			case 1:
				//call addition function
				ReadInputs();
				double sum = x + y;				
				System.out.println(sum);
				break;
			case 2:
				//call sub
				ReadInputs();
				double sub = x - y;
				System.out.println(sub);
				break;
			case 3:
				//call mult function
				ReadInputs();				
				double mult = x * y;			
				System.out.println(mult);
				break;
			case 4:
				//call div function		
				ReadInputs();
				double div = x / y;
				System.out.println(div);
				break;
			case 5:
				//call power function
				double exp = RunExponent();
				System.out.println("Exponential Result: "+exp);
				break;
			case 6:
				System.out.println("Bye");
				break;
				
			default:
				System.out.println("Please enter an integer 1 ~ 6");
				break;
			}
			
		}
	}
	
	static void ReadInputs() {
		System.out.print("Enter 1st no: ");
		x = inp.nextDouble();	//to read from the console
		System.out.print("Enter 2nd no: ");
		y = inp.nextDouble();		
	}
	
	static double RunExponent() {
		double exp = 1;
		double b = 0;
		double n = 0;
		System.out.print("Enter base: ");
		b = inp.nextDouble();
		System.out.print("Enter exponent: ");
		n = inp.nextDouble();

		exp = Math.pow(b, n);  
		
		return exp;
	}

}
