package Lesson3;

import java.util.Scanner;

public class IfElse {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		 Scanner series = new Scanner(System.in);
		 int no = 0;

		while( no != 6) {	//loop while (condition) is true
			System.out.print("Please enter a number: ");
			no = series.nextInt();
		
			if (no == 1) {
				System.out.println("one");
			} else if (no == 2) {
				System.out.println("two");
			} else if(no == 3) {
				System.out.println("treww");
			} else {
				System.out.println("A lot");
			}
		}	//end of while

		System.out.println("Exit!");
	}

}
