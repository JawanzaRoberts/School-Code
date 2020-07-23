// Class:		CSE 1321L
//Section:		12
//Term:			Spring 2020		
//Instructor:	Keerthi Manchukonda	
//Name:			Jawanza Roberts
//Lab#:			2

import java.util.Scanner;

public class SimpleMath {
	public static void main(String[] args) {
	double R, T;	// variables for user input
	Scanner scan = new Scanner(System.in);
	
	System.out.print("R = ");
	R = scan.nextDouble();
	System.out.print("T = ");
	T = scan.nextDouble();
	
	System.out.println("R + T = " + (R+T));	
	System.out.println("R - T = " + (R-T));
	System.out.println("R * T " + (R*T));	
	}
}
