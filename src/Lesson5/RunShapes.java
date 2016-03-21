/**
 * 
 */
package Lesson5;

import java.util.Scanner;

/**
 * @author S Keem
 *
 */
public class RunShapes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Triangle t1 = new Triangle(2,3,4);

		t1.GetShape();
		t1.GetDimension();
		
		Circle c1 = new Circle(3);
		
		c1.GetShape();
		c1.GetDimensions();
		
		Shape s1;
		
		/* ask what shape.  Use scanner */
		int myShape = 0;
		Scanner inp = new Scanner(System.in);
		System.out.print("Select shape(1 for a triangle, 2 for a circle): ");
		myShape = inp.nextInt();
		
		if(myShape == 1) {
			System.out.println("Enter a number.");
			double a=inp.nextDouble();
			System.out.println("Enter a second number.");
			double b=inp.nextDouble();
			System.out.println("Enter a third number.");
			double c=inp.nextDouble();
			
			s1 = new Triangle(a,b,c);
		} else if(myShape == 2) {
			System.out.println("Enter a radius.");
			double r=inp.nextDouble();
			
			s1 = new Circle(r);
		} else {
			s1 = new Shape();
		}
		
		s1.ComputeArea();
		System.out.print("The area of the ");
		s1.GetShape();
		s1.GetArea();
		inp.close();
	}

}
