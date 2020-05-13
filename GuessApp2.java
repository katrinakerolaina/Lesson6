package Lesson6;
/**
Problem 2
GuessApp2 
	uses the instantiable class GuessNumber
	allows the user to guess the number. User can enter the number of guesses!
*/
import java.util.*;
public class GuessApp2 {

	public static void main(String[] args) {
		//declare local variables
		int guess;
		int numOfGuesses;
		
		//declare a variable of type Scanner and create an object of type Scanner
		Scanner input = new Scanner(System.in);
		
		//declare an object of type GuessNumber
		GuessNumber check = new GuessNumber();

		
		
		//input
		System.out.println("Please, enter the number of guesses: ");
		numOfGuesses = input.nextInt();
		
		for(int i = 0; i < numOfGuesses; i++) {
			System.out.println("Please, enter any number from 1-10!");
			guess = input.nextInt();
			
			check.setGuess(guess);
			
			//processing
			check.compute();
			
			
			//output
			String message = check.getMessage();
			System.out.println(message);
			
			if(message.equals("congrats")) {
				break;
			}
			
		}//end for loop
		
		int secret = check.getSecret();
		System.out.println("The secret nummber is: " + secret);
		
	}

}
