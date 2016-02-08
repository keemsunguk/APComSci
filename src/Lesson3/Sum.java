package Lesson3;

import java.util.Scanner;


/*
 * receive two numbers:  arithmetic series
 * input:  starting no, end number
 * out is sum of each terms increased by 1
 * 
 * HW1:   Receive common difference and 
 * 
 *  a(n) = a(n-1) + d
 * 
 * 
 * HW2:  Idiot proof program
 *     If the starting no is smaller than the ending no, print out the message and ask again.
 *     
 * HW3:
 *    Menu driven calculator including +.-.x,/, power (1 for +, 2, for -....5 for power, 6 for exit
 *    while loop, function calls, if-else or switch
 * 
 */

public class Sum {
	
	public static void main(String[] args) {
		
		int start = 0;
		int end = -1;
		
		Scanner series = new Scanner(System.in);
		
		while (start > end) {
			System.out.println("Enter the staring no: ");
			start = series.nextInt();
		
			System.out.println("Enter the ending no: ");
			end = series.nextInt();
			
			if (start > end) {
				System.out.println("Starting number cannot be greater than the ending number!");
			} 
		}
		
		int sum = 0;
		for(int i = start; i <= end; i++) {
			sum = sum + i;
		}
		
		System.out.println("The sum of numbers from "+start+" to "+end+" is "+sum);	
	}
}
