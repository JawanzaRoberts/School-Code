// Class:		CSE 1321L
//Section:		12
//Term:			Spring 2020		
//Instructor:	Keerthi Manchukonda	
//Name:			Jawanza Roberts
//Lab#:			2

import java.util.Scanner;

public class GaseMileage {
	public static void main(String[] args) {
		int miles;
		double gallons, mpg;
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter the number of miles: ");
		miles = scan.nextInt();
		
		System.out.print("Enter the gallons of fuel used: ");
		gallons = scan.nextDouble();
		
		mpg = miles/gallons;
		System.out.println("Miles Per Gallon: " + mpg);
	}
}
