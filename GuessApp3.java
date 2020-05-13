package Lesson6;

import java.util.Scanner;

/**
Problem 3
GuessApp3 
	uses the instantiable class GuessNumber
	allows the user to guess the number, and then ask the user whether would they like to guess again. If they answer yes, the application should run again, if they answer no, the application should end.
*/
public class GuessApp3 {

	public static void main(String[] args) {
		
				//declare local variables
				int guess;
				String answer = "yes";
				
				
				//declare a variable of type Scanner and create an object of type Scanner
				Scanner input = new Scanner(System.in);
				
				//declare an object of type GuessNumber
				GuessNumber check = new GuessNumber();

				
				//input
				while(answer.equals("yes")) {
					System.out.println("Please, enter any number from 1-10!");
					guess = input.nextInt();
					
					check.setGuess(guess);
					
					//processing
					check.compute();
					
					//output
					String message = check.getMessage();
					System.out.println(message);
					
					
					//
					int secret = check.getSecret();
					
					if(guess != secret) {
						System.out.println("Would you like to guess again? Enter 'yes' to continue, 'no' to exit.");
						answer = input.next();
					}else if(message.equals("congrats")|| answer.equals("no")){
						break;
					}
					
				}//end while loop
				
				
				int sec = check.getSecret();
				System.out.println("The secret nummber is: " + sec);
				System.out.println("Thank you for playing! ");
				System.out.println("=====================================");
						
						
	}

}
