// Class:		CSE 1321L
//Section:		12
//Term:			Spring 2020		
//Instructor:	Keerthi Manchukonda	
//Name:			Jawanza Roberts
//Lab#:			2

import java.util.Scanner;

public class Youth {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		
		int age;
		
      	// asks the user to enter their age, then stores their input in variable age
		System.out.println("How old are you?");
		age = input.nextInt();			
		
      	// prints out age the user entered
		System.out.println("You entered: " + age);
		
		if(age <= 21) {
			System.out.println("Youth is a wonderful thing. Enjoy. ");
		}
	
		System.out.println("Age is a state of mind.");
	}
}