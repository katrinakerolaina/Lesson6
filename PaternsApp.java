package Lesson6;

import java.util.Scanner;

public class PaternsApp {

	public static void main(String[] args) {
		// declare variables 
		int n;
		Scanner scan = new Scanner(System.in);
		
		//the size of the patter
		System.out.println("enter a value for n: ");
		n = scan.nextInt();
		
		/*
		 Pattern 1
		 
		 *
		 **
		 ***
		 ****
		 *****
		 ******
		 
		 */
		 
		
		System.out.println();
		System.out.println("Pattern 1: ");
		System.out.println();
		
		//two nested loops
		//outer loop: number of rows
		for(int i = 1; i <=n ; i++) {
			//inner loop: to print columns to display info for each row
			for(int j = 1; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
			/*
		 Pattern 2
		 
		       *
		      **
		     ***
		    ****
		   *****
		  ******
		 
		 */
		
		
		System.out.println();
		System.out.println("Pattern 2: ");
		System.out.println();
		
		//two nested loops
		//outer loop: number of rows
		for(int i = 1; i <=n ; i++) {
			//inner loop: to print columns to display info for each row
			for(int j = 1; j <= n; j++) {
				if(i+j < n + 1) {
				
					System.out.print(" ");
				}else {
				System.out.print('*');
				}
			}
			
			System.out.println();
		}
		
		/*
		Pattern 3
		
		******
        *****
        ****
        ***
        **
        *
        
        */
		
		
		
		System.out.println();
		System.out.println("Pattern 3: ");
		System.out.println();
		
		//two nested loops
		//outer loop: number of rows
		for(int i = 1; i <=n ; i++) {
			//inner loop: to print columns to display info for each row
			for(int j = 1; j <= n; j++) {
				if(i+j < n + 2) {
					
						System.out.print('*');
					}else {
					System.out.print(" ");
					}
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Pattern 1: ");
		System.out.println();
		
		//two nested loops
		//outer loop: number of rows
		for(int i = 1; i <=n ; i++) {
			//inner loop: to print columns to display info for each row
			for(int j = 1; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}

	}//end main

}//end class