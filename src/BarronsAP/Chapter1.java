package BarronsAP;

import java.util.Scanner;

public class Chapter1 {

	static double x = 0;

	static Scanner inp = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		int selection  = 0;
		
		System.out.println("====== Caculator Menu ======");
		System.out.println("* 20: While loop trace     *");
		System.out.println("* 21: Mod function         *");
		System.out.println("* 23: For Loop (nested)    *");
		System.out.println("* 25: While/Mod            *");
		System.out.println("* 26: Reverse Number       *");
		System.out.println("* 6: Exit                  *");
		System.out.println("* ======================== *");
		
		
		while( selection != 6) {
			System.out.print("Please enter your selection: ");
			
			selection = inp.nextInt();
			
			switch(selection) {
			case 20:
				Prob20();
				break;
			case 21:
				ReadInputs();
				boolean valid = checkNumber((int)x);
				System.out.println(x+": "+valid);
				ReadInputs();
				valid = checkNumber((int)x);
				System.out.println(x+": "+valid);
				ReadInputs();
				valid = checkNumber((int)x);
				System.out.println(x+": "+valid);
				ReadInputs();
				valid = checkNumber((int)x);
				System.out.println(x+": "+valid);
				break;
			case 23:
				Prob23();
				break;
			case 25:
				ReadInputs();
				int num = (int)x;
				Prob25(num);
				break;
			case 26:
				ReadInputs();
				int n = (int)x;
				Prob26(n);
				break;
			case 6:
				System.out.println("Bye");
				break;
				
			default:
				System.out.println("Please enter an integer 1 ~ 6");
				break;
			}

		}
		inp.close();
	}

	static void ReadInputs() {
		System.out.print("Enter 1st no: ");
		x = inp.nextDouble();	//to read from the console
//		System.out.print("Enter 2nd no: ");
//		y = inp.nextDouble();		
	}

	static void Prob20() {
		int x = 10, y = 0;
		while(x>5) {
			y = 3;
			while(y<x) {
				y *= 2;
				if(y % x == 1) {
					y += x;
				}
				System.out.println(x + " " + y);
			}
			x -= 3;
		}
		System.out.println(x + " " + y);
	}
	
	static boolean checkNumber(int n) {  //prob 21
		int d1, d2, d3, checkDigit, nRemaining, rem;
		
		checkDigit = n % 10;
		nRemaining = n / 10;
		d3 = nRemaining % 10;
		nRemaining /= 10;
		d2 = nRemaining % 10;
		nRemaining /= 10;
		d1 = nRemaining % 10;

		rem = (d1 + d2 + d3) % 7;
		return rem == checkDigit;
		
	}
	
	static void Prob23() {
		for(int i = 5; i >= 1; i--) {
			for(int j = i; j >= 1; j--) {
				System.out.print(2*j-1);
			}
			System.out.println();
		}
	}
	
	static void Prob25(int k) {
		int newNum = 0, temp;
		int num = k;
		while (num > 10) {
			temp = num % 10;
			num /= 10;
			newNum = newNum * 10 + temp;
			System.out.println("Num: "+num+",  newNum: "+newNum);
		}
	}
	
	static void Prob26(int k) {  //reverse
		int n = k;
		int rem, revNum = 0;
		
		System.out.println("Segment I");
		for(int i = 0; i <= n; i++) {
			rem = n % 10;
			revNum = revNum * 10 + rem;
			n /= 10;
			System.out.println("revNum: "+revNum+",  n: "+n);			
		}
		
		System.out.println("\nSegment II");
		n = k;
		revNum = 0;
		while(n != 0) {
			rem = n % 10;
			revNum = revNum * 10 + rem;
			n /= 10;
			System.out.println("revNum: "+revNum+",  n: "+n);			
		}
		
		System.out.println("\nSegment III");
		n = k;
		revNum = 0;
		for(int i = n; i != 0 ; i /=10) {
			rem = i % 10;
			revNum = revNum * 10 + rem;
			System.out.println("revNum: "+revNum+",  n: "+n);			
		}
		
	}
}
