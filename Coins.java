// Class:		CSE 1321L
//Section:		12
//Term:			Spring 2020		
//Instructor:	Keerthi Manchukonda	
//Name:			Jawanza Roberts
//Lab#:			2

import java.util.Scanner;

public class Coins {
	public static void main(String[] args) {
		int quarters, dimes, nickels, pennies;	// variables for coins input by user
		int total;	// variable for total change entered by user
		Scanner coins = new Scanner(System.in);
		
		//	asks the user to enter how much of each change they have
		System.out.print("Enter number of quarters: ");
		quarters = coins.nextInt();
		System.out.print("Enter number of dimes: ");
		dimes = coins.nextInt();
		System.out.print("Enter number of nickels: ");
		nickels = coins.nextInt();
		System.out.print("Enter number of pennies: ");
		pennies = coins.nextInt();
		System.out.println();
		
		//	prints out how much of each coin the user input
		System.out.println("You entered " + quarters + " quarters");
		System.out.println("You entered " + dimes + " dimes");
		System.out.println("You entered " + nickels + " nickels");
		System.out.println("YOu entered " + pennies + " pennies");
		System.out.println();
		
		//	calculates total amount of change and stores in variable "total"
		total = ((quarters*25)+(dimes*10)+(nickels*5)+(pennies*1));
		
		System.out.print("Your total is " + (total/100) + " Dollars and "
				+ + (total-((total/100)*100)) + " Cents");	
	}
}
