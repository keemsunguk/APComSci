package Shapes;

public class Triangle {
	
	//Default constructor
	Triangle() {;}
	
	//Constructor
	Triangle(int i, int j, int k) {
		a = i;
		b = j;
		c = k;
	}
	
	public double a;
	public double b;
	public double c;

	public boolean IsValid() {
		boolean isTriangle = false;
		
		int sum1=0;
		int sum2=0;
		int sum3=0;
		
		sum1=(int)(a+b);
		sum2=(int)(b+c);
		sum3=(int)(c+a);

		
		if (sum1>c && sum2>a && sum3>b)
		{
			isTriangle = true;
		}
		else
		{
			isTriangle = false;

		}
		return isTriangle;
	}
	
	public void AddSum() {
		int sum4 = (int)(a + b);
		
	}
}
