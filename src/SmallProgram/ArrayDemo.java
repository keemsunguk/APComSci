package SmallProgram;

public class ArrayDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Integer [] myData;
		
		int data1 = 0;
		int data2 = 2;
		
		myData = new Integer [10];
		
		for(int i = 0; i < 10; i++) {
			myData[i] = i*2;
		}
	System.out.println("Done");	
	}

}
