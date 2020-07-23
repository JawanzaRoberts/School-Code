// Class:		CSE 1321L
//Section:		12
//Term:			Spring 2020		
//Instructor:	Keerthi Manchukonda	
//Name:			Jawanza Roberts
//Lab#:			2

import java.util.Scanner;

public class NextMeeting {
	public static void main(String[] args) {
		int day;			// variable for the day
		int daysTil;		// variable for days until meeting
		int dayOfMeeting;	// variable that stories day of meeting		
		Scanner scan = new Scanner(System.in);
		
      	// prompts the user to enter the day and days until meeting
		System.out.print("Enter the day as an integer (0-6): ");
		day = scan.nextInt();
		System.out.print("Enter how many days there are until the meeting: ");
		daysTil = scan.nextInt();
		
      	// prints out what day it is determined by user input
		switch(day) {
		case 0: System.out.println("Today is Sunday"); break;
		case 1: System.out.println("Today is Monday"); break;
		case 2: System.out.println("Today is Tuesday"); break;
		case 3: System.out.println("Today is Wednesday"); break;
		case 4: System.out.println("Today is Thursdays"); break;
		case 5: System.out.println("Today is Friday"); break;
		case 6: System.out.println("Today is Saturday"); break;
		default: System.out.println("There was an error."); break;
		}
		
      	// prints out days until meeting
		System.out.println("Days to the meeting is " + daysTil + " days");
		
      	// calculates the day of the meeting 
		dayOfMeeting = (day + daysTil) % 7;
		
      	// prints out what day the meeting is on
		switch(dayOfMeeting) {
		case 0:	System.out.print("Meeting day is Sunday"); break;
		case 1:	System.out.print("Meeting day is Monday"); break;
		case 2: System.out.print("Meeting day is Tuesday"); break;
		case 3: System.out.print("Meeting day is Wednesday"); break;
		case 4:	System.out.print("Meeting day is Thursday"); break;
		case 5:	System.out.print("Meeting day is Friday"); break;
		case 6: System.out.print("Meeting day is Saturday"); break;
		default: System.out.println("There was an error."); break;
		}
		
	}
}