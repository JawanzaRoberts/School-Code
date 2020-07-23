// Class:		CSE 1321L
//Section:		12
//Term:			Spring 2020		
//Instructor:	Keerthi Manchukonda	
//Name:			Jawanza Roberts
//Lab#:			2

import java.util.Scanner;

public class ProcessGrades {
	public static void main(String[] args) {
		int grade1, grade2, grade3, grade4;		// variables to store user grade input
		Scanner scan = new Scanner(System.in);
		int highest = 0, lowest = 0;			// stores highest and lowest grades
		double average;							// stores average of grades input by user
      
      	// prompts user to enter four grades
		System.out.print("Please enter your four grades: ");
		grade1 = scan.nextInt();
		grade2 = scan.nextInt();
		grade3 = scan.nextInt();
		grade4 = scan.nextInt();
		
		System.out.println("You entered: " + grade1 + ", " + grade2 + ", " + grade3 + ", " + grade4);
      
		// if-else-if statements to determine highest grade
		if(grade1 > grade2 && grade1 > grade3 && grade1 > grade4) {
			highest = grade1;
		}
		else if(grade2 >= grade1 && grade2 >= grade3 && grade2 >= grade4) {
			highest = grade2;
		}
		else if(grade3 >= grade1 && grade3 >= grade2 && grade3 >= grade4) {
			highest = grade3;
		}
		else if(grade4 >= grade1 && grade4 >= grade2 && grade4 >= grade3) {
			highest = grade4;
		}
		
		// if-else-if statements to determine lowest grade
		if(grade1 <= grade2 && grade1 <= grade3 && grade1 <= grade4) {
			lowest = grade1;
		}
		else if(grade2 <= grade1 && grade2 <= grade3 && grade2 <= grade4) {
			lowest = grade2;
		}
		else if(grade3 <= grade1 && grade3 <= grade2 && grade3 <= grade4) {
			lowest = grade3;
		}
		else if(grade4 <= grade1 && grade4 <= grade2 && grade4 <= grade3) {
			lowest = grade4;
		}
	
		// finds the average grade and stories in variable
		average = (grade1+grade2+grade3+grade4)/4.00;
		
		// prints out results
		System.out.println("Highest grade: " + highest);
		System.out.println("Lowest grade: " + lowest);
		System.out.println("Average grade: " + average);
	}
}