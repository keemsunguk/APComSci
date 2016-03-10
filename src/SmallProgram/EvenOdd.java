package SmallProgram;

import java.util.Scanner;

public class EvenOdd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 Scanner series = new Scanner(System.in);
		 int no = 1;
		 
		 int tmp = 5%2;
		 
		 System.out.println(tmp);

		 System.out.println("Welcome to Even/Odd");
		 System.out.println("Enter 0 to exit");
		 
		while( no != 0) {	//loop while (condition) is true
			System.out.print("Please enter a number: ");
			no = series.nextInt();
			
			if(no % 2 == 0) {
				System.out.println(no+" is an even number!");
			} else {
				System.out.println(no+" is an odd number!");	
			}
	}	//end of while

		System.out.println("Exit!");

		
	}

}
