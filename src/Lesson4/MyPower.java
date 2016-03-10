/**
 * 
 */
package Lesson4;

/**
 * @author S Keem
 *
 */
public class MyPower {
	private double base;
	private double exponent;
	
	MyPower() {;};		//default constructor
	
	MyPower(double x, double y) {  //param constructor
		base = x;
		exponent = y;
	}
	
	/////////////////////////////////////////////
	public double Run(double x, double y) {
		double result = 0.0;
		base = x;
		exponent = y;
		
		result = Run();
		
		return result;
	}

	public double Run() {
		double result = 1.0;
		int intExponent = (int)exponent;
		boolean isExpNegative = false;
		
		
		if(intExponent < 0) { //hw1
			isExpNegative = true;
			intExponent = -1*intExponent;
		}
		
		for(int i = 0; i < intExponent; i++) {
			result *= base;
		}
		
		if(isExpNegative) {   //hw1
			result = 1/result;
		}
		return result;
	}
	//////////////////////////////////////////////////////
	 public boolean CheckExponent(double exp) {
		 boolean result = false;
		 
		 double e = (int) exp;
		 
		 if( (exp - e) == 0) {
			 result = true;
		 } else {
			 result = false;
		 }
		 return result;
	 }
}
