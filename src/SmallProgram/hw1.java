package SmallProgram;

import java.util.Scanner;

public class hw1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
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
