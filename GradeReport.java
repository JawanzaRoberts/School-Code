// Class:		CSE 1321L
//Section:		12
//Term:			Spring 2020		
//Instructor:	Keerthi Manchukonda	
//Name:			Jawanza Roberts
//Lab#:			2

import java.util.Scanner;

public class GradeReport {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
      
      	// variable used to store user's grade
		int grade;
		
      	// asks the user to enter a grade then stores input in variable grade
		System.out.print("Please enter a test grade: ");
		grade = input.nextInt();
		
      	// prints out grade entered by user
		System.out.println("You entered " + grade);
		
      	// prints statement if grade input by user is within a set range
		if(grade >= 100) {
			System.out.print("That grade is a perfect score. Well done.");
		}
		else if(grade >= 90 && grade <= 99) {
			System.out.print("That grade is well above average. Excellent work.");
		}
		else if(grade >= 80 && grade <= 89) {
			System.out.print("That grade is above average. Nice job.");
		}
		else if(grade >= 70 && grade <= 79) {
			System.out.print("That grade is average work.");
		}
		else if(grade >= 60 && grade <= 69) {
			System.out.print("That grade is not good, you should seek help!");
		}
		else if(grade < 60) {
			System.out.print("That grade is not passing.");
		}
		else {
			System.out.print("There was an error");
		}
	}
}