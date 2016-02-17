package Lesson3;

import java.util.Scanner;

public class WhileLoopDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double x = 0;
		double y = 0;
		boolean done = false;

		Scanner inp = new Scanner(System.in);
		int selection  = 0;
		
		System.out.println("====== Caculator Menu ======");
		System.out.println("* 1: Addition              *");
		System.out.println("* 2: Subtraction           *");
		System.out.println("* 3: Multiplication        *");
		System.out.println("* 4: Division              *");
		System.out.println("* 5: Exponent              *");
		System.out.println("* 6: Exit                  *");
		System.out.println("* ======================== *");
		
		
		while( !done ) {
			System.out.print("Please enter your selection: ");
			
			selection = inp.nextInt();
			
			if(selection == 6) {
				System.out.println("Bye");
				done = true;
			} else if(selection == 1) {
				System.out.print("Enter 1st no: ");
				x = inp.nextDouble();	//to read from the console
				System.out.print("Enter 2nd no: ");
				y = inp.nextDouble();		
				double sum = x + y;				
				System.out.println(sum);
			} else if (selection == 2) {
				//call sub
				System.out.print("Enter 1st no: ");
				x = inp.nextDouble();	//to read from the console
				System.out.print("Enter 2nd no: ");
				y = inp.nextDouble();		
				double sub = x - y;
				System.out.println(sub);
			} else if (selection == 3) {
				//call mult function
				System.out.print("Enter 1st no: ");
				x = inp.nextDouble();	//to read from the console
				System.out.print("Enter 2nd no: ");
				y = inp.nextDouble();		
				double mult = x * y;			
				System.out.println(mult);
			} else if (selection == 4) {
				//call div function		
				System.out.print("Enter 1st no: ");
				x = inp.nextDouble();	//to read from the console
				System.out.print("Enter 2nd no: ");
				y = inp.nextDouble();		
				double div = x / y;
				System.out.println(div);
			} else if (selection == 5) {
				//call power function
				double exp = 1;
				double b = 0;
				double n = 0;
				System.out.print("Enter base: ");
				b = inp.nextDouble();
				System.out.print("Enter exponent: ");
				n = inp.nextDouble();

				exp = Math.pow(b, n);  
				System.out.println("Exponential Result: "+exp);
			} else {		
				System.out.println("Please enter an integer 1 ~ 6");
			}
		}
		inp.close();
	}

}
