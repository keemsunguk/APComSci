package SmallProgram;

public class IntegerMath {

	/*
	 * This class is going to implement many different math functions in JAVA.
	 * All of these functions will accept and output integers.
	 */
	
	public static int sum( int addend1, int addend2 ){
		/*
		 * This method will accept two integers and give back (return) an integer
		 * which is the sum of the two integers.
		 */
		return addend1 + addend2; //You will need to replace this return statement
	}
	
	public static int product( int factor1, int factor2 ){
		/*
		 * This method will accept two integers and return an integer which is the
		 * product of the two integers.
		 */
		return factor1 * factor2; //You will need to replace this return statement
	}
	
	public static int absoluteValue( int number ){
		/*
		 * This method will accept one integer input and will return the integer
		 * which is the absolute value of that number.  You will need to use if
		 * statements to perform this operation.
		*/
		
		if (number>=0){
			return number;
		} else if (number<0){
			return number * -1;
		}; //You will need to replace this return statement
		return number;
	
	}
	
	public static int power( int base, int exponent ){
		/*
		 * This method will accept two integer inputs and will return the integer
		 * which is the result of raising the first input to the power of the
		 * second input.  You will need to use a loop to perform this operation.
		 */
		
		int answer = 1;
		for (int i = 0; i<exponent; i++){
			answer *= base;
		}
		return answer;
	}
	
	public static int squareRoot( int number ){
		/*
		 * This method will accept one integer input and will return the largest
		 * integer which is less than or equal to the actual square root of that
		 * number.  If the input was a negative integer, then the method will
		 * print out an error statement.  You will need to use a loop and if 
		 * statements to perform this operation.  This is a challenging task. 
		 * Only do it if you have finished with the other methods.
		 */
		int answer = 0;
		for(int i = 1; i < number; i++){
			if (power(i,2)<=number){
				answer = i;
			}
		}
		return answer;
	}
	
	public static void main(String[] args){
		/*
		 * The main method is typically used to test the methods provided by a
		 * class such as this one which provides a library of tools for other
		 * programs to use.
		 */
		
		System.out.println("The sum of 3 and 8 is " + sum(3, 8));
		System.out.println("The product of 15 and 3 is " + product(15, 3));
		System.out.println("The absolute value of 4 is " + absoluteValue(4));
		System.out.println("The absolute value of -7 is " + absoluteValue(-7));
		System.out.println("The value of 3 raised to the 3 is " + power(3, 3));
		System.out.println("The square root of 9 is " + squareRoot(9));
		System.out.println("The square root of 8 is " + squareRoot(8));
		System.out.println("The square root of -4 is " + squareRoot(-4));
		System.out.println("Because the square root of a number is the opposite "
				+ "of raising that number to the power of 2, these operations should"
				+ " cancel out.  The square root of the value of 3 raised to the 2 "
				+ "is " + squareRoot( power(3, 2) ));
		System.out.println("In the world of only integers, the opposite direction "
				+ "only works if the number in question was originally a perfect"
				+ "square.  So, the number which is the square root of 16, when "
				+ "raised to the power 2, is " + power( squareRoot(16), 2 ));
		System.out.println("And, the number which is the square root of 10, when "
				+ "raised to the power 2, is " + power( squareRoot(10), 2 ));
		
	}
	
}

