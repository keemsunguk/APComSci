package Lesson2;

import java.util.Scanner;

public class ArithmeticSeq {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//HW
		/*
		 * To create an arithmetic sequence and a series
		 * input:  the first term, a1, and the number of terms, n, and common difference, c ==>  need a Scanner
		 * 		a1 and n are both int 
		 * 
		 * Use for-loop to print
		 * arithmetic sequences:  1,3,5,7,9..., 19
		 * Arithmetic series: result of sum of all the sequences.
		 * 
		 * Ex:
		 * Enter the staring no: 
			1
			Enter the number of terms: 
			20
			Enter the common difference: 
			2
			The sequence is:
			1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39
		 * 
		 */
		
		int start=0;
		int end = 0;
		int d = 0;
		
		Scanner series = new Scanner(System.in);
		
		System.out.println("Enter the staring no: ");
		start = series.nextInt();
		
		System.out.println("Enter the number of terms: ");
		end = series.nextInt();

		System.out.println("Enter the common difference: ");
		d = series.nextInt();

		System.out.println("The sequence is:");	
		
		int sum = start;
		for(int i = 1; i < end; i++) {
			System.out.print(sum+", ");	
			sum = sum + d;
		}
		
		System.out.println(sum);	

	}

}
