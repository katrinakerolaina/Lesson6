package Lesson6;

import java.util.Scanner;
/*
 * GuessApp1
 * Lets use Lab3.GuessNumber as the instantiable class to calculate the users guess number.
 * Number of guesses: 3
 */
//import GuessNumber
public class GuessApp1 {

	public static void main(String[] args) {
		// declare a local variables
		int guess;
		
		Scanner input= new Scanner (System.in);
		GuessNumber checker = new GuessNumber();
		
		for(int i = 0; i < 3; i++) {
			//input
			System.out.println("Enter to guess the number: ");
			guess = input.nextInt();
			
			
			checker.setGuess(guess);
			
			//processing
			checker.compute();
			
			//output
			String m =checker.getMessage();
			System.out.println(m);
			
			if(m.equals("congrats")) {
				break;
			}
			
		}//end for loop
		int s = checker.getSecret();
		System.out.println("secret "+ s);
		
	}// end main

}//end class
