package Lesson2;

import java.util.Scanner;

public class ArithmeticSeq {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		System.out.println("Arithmetic Sequence");
		System.out.println("Enter the initial number.");
		
		int a0=inp.nextInt();
		System.out.println("Enter a second number.");
		int endNo=inp.nextInt();

	
		System.out.println("Arithmetic Seq from "+a0);
		for(int i = 0; i <=(endNo-a0); i++) {
			System.out.print(a0+i+",");
		}
		System.out.println("\n");

		System.out.println("Arithmetic Seq increment by 2 from "+a0);
		for(int i = 0; i <=(endNo-a0); i+=2) {
			System.out.print(a0+i+",");
		}
		System.out.println();
		inp.close();
	}

}
