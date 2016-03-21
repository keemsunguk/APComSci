package Lesson5;

public class Triangle extends Shape {
	
	//Default constructor
	Triangle() {
		a = 0;
		b = 0;
		c = 0;
	}
	
	//Constructor
	Triangle(double i, double j, double k) {
		a = i;
		b = j;
		c = k;
	}
	
	public double a;
	public double b;
	public double c;

	public void GetShape() {
		System.out.println("Triangle");
	}
	
	public void GetDimension() {
		System.out.println("Side 1:"+a);		
		System.out.println("Side 2:"+b);		
		System.out.println("Side 3:"+c);		
	}
	
	public void ComputeArea() {
		double s = (a+b+c)/2;
		
		area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
}
