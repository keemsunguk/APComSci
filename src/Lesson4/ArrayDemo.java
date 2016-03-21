package Lesson4;

public class ArrayDemo {

	public final static int DATASIZE = 20;
	static double [] no = new double [DATASIZE];	//array of size 20

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		//create double array
		
		for(int i = 0; i < DATASIZE; i++) {
			no[i] = Math.random()*100;
		}

		PrintData();
		double maxNo = FindMax();
		double minNo = FindMin();
		double avgNo = FindMean();
		double stdev = FindSTDEV(avgNo);
		
		System.out.println("Maximum value is: " + maxNo);
		System.out.println("Minimum value is: " + minNo);
		System.out.println("Mean value is: " + avgNo);
		System.out.println("STDEV value is: " + stdev);
		
		BubbleSort();
		PrintData();
		
		
	}

	/*
	 * Print all data in the array "no"
	 * */
	public static void PrintData() {
		for(int i = 0; i < DATASIZE; i++) {
			System.out.println(no[i]);
		}
	}
	
	/*
	 * Find Max value from no
	 */
	public static double FindMax() {
		double max = Double.MIN_VALUE;
		
		for(int j = 0; j < DATASIZE; j++) {
			if (max < no[j]) {
				max = no[j];
			}
		}
		
		return max;
	}
	
	/*
	 * Find Min value from no
	 */
	public static double FindMin() {
		double min = Double.MAX_VALUE;
		
		for(int j = 0; j < DATASIZE; j++) {
			if (min > no[j]) {
				min = no[j];
			}
		}
		
		return min;
	}
	
	
	/* find an average of no array
	 * 
	 */
	public static double FindMean() {
		double mean = 0;
		double sum = 0;
		
		for(int j = 0; j < DATASIZE; j++) {
			sum += no[j];
			
		}
		
		mean = sum/DATASIZE;		
		
		return mean;
	}
	
	public static double FindSTDEV(double mean) {
		double stdev = 0;
		double diffsq = 0;
		for(int i = 0; i < DATASIZE; i++) {
			diffsq += (no[i]-mean)*(no[i]-mean);
		}
		 stdev = Math.sqrt(diffsq/(DATASIZE-1));
		
		return stdev;
	}

	public static void BubbleSort() {
		double temp = 0;
		
		for(int j = 0; j < DATASIZE-1; j++) {
			for(int i = j; i < DATASIZE; i++) {
				if(no[j] > no[i]) {
					temp = no[j];
					no[j] = no[i];
					no[i] = temp;
				}
			}
		}
	}
}
