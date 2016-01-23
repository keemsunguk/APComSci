package Lesson1;

public class TypeCastExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello, World");
		System.out.println("Lesson 1:  Type casting and ASCII example");
		
		int c = 97;
		char b = 97;  //a
		System.out.println(b);
		System.out.println(c);
		
		char d = 224;
		System.out.println(d);
		int e = 123;
		double f = 35.6;
		
		System.out.println( (int)(e+f) );	//Type casting
		System.out.println( e+f );			//Without type casting
	}

}
