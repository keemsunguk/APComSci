package SmallProgram;

import java.util.Scanner;

public class retirement {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("How much do you plan to save per year?");
		String save = input.nextLine();
		double deposit = Double.parseDouble(save);
		
		System.out.println("How many years do you have until retirment?");
		String years = input.nextLine();
		double yearsnumber = Double.parseDouble(years);
		
		System.out.println("How much do you expect to earn per year?");
		String earn = input.nextLine();
		double apr = Double.parseDouble(earn)/100;	//Annual percentage rate
		
		System.out.printf( "\n\n======================================================================\n"); 

		String heading1 = "Year";
		String heading2 = "Starting";
		String heading3 = "Deposit";
		String heading4 = "Earnings";
		String heading5 = "Ending";
	
		System.out.printf( "%5s %15s %15s %15s %15s \n", 
		heading1, heading2, heading3, heading4, heading5);
		
		double starting = 0.0;
		double earnings = 0.0;
		double ending = 0.0;
		
		for(int i = 0; i <= yearsnumber; i++){			
			//Computing 
			starting = ending;
			earnings = ending * apr;
			ending = starting + deposit + earnings;

			System.out.printf("%5d %,15.2f %,15.2f %,15.2f %,15.2f\n", i, starting, deposit, earnings, ending );
		}
	}

}
