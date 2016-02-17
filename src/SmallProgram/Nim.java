package SmallProgram;

import java.util.Scanner;

public class Nim {
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Hi, this game is Nim");
		System.out.println("Play with me");

		int wantContinue = 1;
		while(wantContinue == 1) {
			int pileone = 9;
			int piletwo = 9;
			int pilethree = 9;
			int piletakenfromnumber = 1;
			int rocksRemoved = 0;
			
			while (pileone + piletwo + pilethree > 0  ) {
				System.out.println("Pile 1: " + pileone);
				System.out.println("Pile 2: " + piletwo); //inform player of game status
				System.out.println("Pile 3: " + pilethree);
	
				System.out.println("Which pile do you want rocks from?");
				String piletakenfrom = input.nextLine();
				piletakenfromnumber = Integer.parseInt(piletakenfrom);
				//Asked the player for a pile number and stored it as pile taken from number
	
				if (piletakenfromnumber <= 0 || piletakenfromnumber > 3) {
					System.out.println("You can't do that");
				} else {
					System.out.println("How many rocks do you want?");
					String take = input.nextLine();
					rocksRemoved = Integer.parseInt(take);				
					
					if (piletakenfromnumber == 1) {
						pileone = pileone - rocksRemoved;
		
						if (pileone <= -1){
							System.out.println("You can't do that");
							pileone = pileone + rocksRemoved;
						} else {
							System.out.println("Taking " + rocksRemoved + " from stack 1.");
						}
					} else if (piletakenfromnumber == 2) {
						piletwo = (piletwo - rocksRemoved); 	
		
						if (piletwo <= -1) {
							System.out.println("You can't do that");
							piletwo = (piletwo + rocksRemoved);
						} else {
							System.out.println("Taking " + rocksRemoved + " from stack 2.");
						}
					} else if (piletakenfromnumber == 3) {
						pilethree = (pilethree - rocksRemoved); 
		
						if (pileone <= -1){
							System.out.println("You can't do that");
							pilethree = (pilethree + rocksRemoved);
						} else {
							System.out.println("Taking " + rocksRemoved + " from stack 3.");
						}
					}
				}	
			}
			System.out.println("You Lose!");
			
			System.out.print("Would you like to continue (y for Yes)? ");
			String strContinue = input.nextLine();
			if(!strContinue.equals("y")) {
				wantContinue = 0;
			}
		}
		input.close();
	}
}

		
	

	 
		
			
		
		


		
		
			
		
		
		
	

		





























