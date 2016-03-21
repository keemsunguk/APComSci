/**
 * 
 */
package Lesson5;

/**
 * @author S Keem
 *
 */
public class Circle extends Shape {
	public final double PI=3.141592;
	
	Circle() {
		radius = 0;
	}
	
	Circle(double r) {
		radius = r;
	}
	
	public double radius;
	public double circumference;
	
	public void GetShape() {
		System.out.println("Circle");
	}
	
	public void GetDimensions() {
		System.out.println("Radius:"+radius);
	}

	public void ComputeArea() {
		area = PI*radius*radius;
	}
}
