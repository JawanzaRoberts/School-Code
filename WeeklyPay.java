// Class:		CSE 1321L
//Section:		12
//Term:			Spring 2020		
//Instructor:	Keerthi Manchukonda	
//Name:			Jawanza Roberts
//Lab#:			2

import java.util.Scanner;

public class WeeklyPay {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
      
      	// creates variables hours and grossEarning to store hours worked per week then calculated income
		int hours;
		int grossEarning = 0;
		
      	// asks the user to enter hours worked per week then stores input in variable hours
		System.out.print("How many hours do you work per week? ");
		hours = input.nextInt();
		
      	// prints out the hours the user entered
		System.out.println("You entered " + hours + " hours.");
		
      	// calculates gross earning using hours entered by user
		if(hours < 40) {
			grossEarning = (hours*10);
		}
		else {
			grossEarning = (hours - 40);
			grossEarning = grossEarning * 15;
			grossEarning = grossEarning + 400;
		}
		
      	// prints out the calculated gross earning
		System.out.print("Gross earning is $" + grossEarning);
	}
}