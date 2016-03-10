package SmallProgram;

import java.util.Scanner;

public class whileLoop {

	/**
	 * @param args
	 */
	
	static Scanner series = new Scanner(System.in);
	static int start = 0;
	static int end = 0;

	public static void main(String[] args) {
		int sum = 0;
		
		GetNumbers();	//Read two numbers

		while( start != end) {
			System.out.println("Please enter the same numbers!");
			sum = GetSum(start, end);
			System.out.println("Their sum is "+sum);
			GetNumbers();
		}

		System.out.println("Finally!");
	}
	
	public static int GetSum(int x, int y) {
		int sum = 0;
		
		sum = x + y;
		
		return sum;
	}
	
	public static void GetNumbers() {
		System.out.println("Enter the staring no: ");
		start = series.nextInt();
		
		System.out.println("Enter the ending no: ");
		end = series.nextInt();
		
	}

	
	
}
