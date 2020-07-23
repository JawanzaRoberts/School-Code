// Class:		CSE 1321L
//Section:		12
//Term:			Spring 2020		
//Instructor:	Keerthi Manchukonda	
//Name:			Jawanza Roberts
//Lab#:			2

import java.util.Scanner;

public class CheckPoint {
	public static void main(String[] args) {
		int x, y;	// variables to store user input
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter an x coordinate, then a y coordinate: ");
		x = scan.nextInt();
		y = scan.nextInt();
		
		System.out.println("X-coordinate is " + x);
		System.out.println("Y-coordinate is " + y);
		
		// determines which quadrant the coordinates belong to
		if(x == 0 && y == 0) {
			System.out.println("(" + x + ", " + y + ") is on the origin.");
		}
		else if(x == 0 && y > 0) {
			System.out.println("(" + x + ", " + y + ") is on the y-axis.");
		}
		else if(x > 0 && y == 0) {
			System.out.println("(" + x + ", " + y + ") is on the x-axis.");
		}
		else if(x > 0 && y > 0) {
			System.out.println("(" + x + ", " + y + ") is in the first quadrant.");
		}
		else if(x < 0 && y > 0) {
			System.out.println("(" + x + ", " + y + ") is in the second quadrant.");
		}
		else if(x < 0 && y < 0) {
			System.out.println("(" + x + ", " + y + ") is in the third quadrant.");
		}
		else if(x > 0 && y < 0) {
			System.out.println("(" + x + ", " + y + ") is in the fourth quadrant.");
		}
		else {
			System.out.println("There was an error.");
		}
		
	}
}