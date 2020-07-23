// Class:		CSE 1321L
//Section:		12
//Term:			Spring 2020		
//Instructor:	Keerthi Manchukonda	
//Name:			Jawanza Roberts
//Lab#:			2

import java.util.Scanner;

public class SumValue {
	public static void main(String[] args) {
		int x, y, z; // variables for x, y and z, inputs
		Scanner scan = new Scanner(System.in);
		
		System.out.print("X =");
		x = scan.nextInt();
		System.out.print("Y= ");
		y = scan.nextInt();
		System.out.print("Z= ");
		z = scan.nextInt();
		System.out.print("Average= " + (x+y+z)/3.0);
	}
}
