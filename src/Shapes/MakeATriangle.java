package Shapes;

import java.util.Scanner;

public class MakeATriangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner lengths=new Scanner(System.in);
		
		System.out.println("Let's move on to triangles. We'll look at 3 different sidelengths to see if they make a triangle.");
		System.out.println("Enter a number.");
		
		int length1=lengths.nextInt();
		System.out.println("Enter a second number.");
		int length2=lengths.nextInt();
		System.out.println("Enter a third number.");
		int length3=lengths.nextInt();

		Triangle t1 = new Triangle(length1,length2,length3);
		
		if (t1.IsValid())
		// why do you use if and if else here rather than a boolean?  ==> boolean is a type.  You have to set it.  See IsValid() function in Triangle
		{
			System.out.print("These lengths form a triangle.");
		}
		else
		{
			System.out.print("These lengths do not form a triangle.");

		}

		
		lengths.close();
	}

}
