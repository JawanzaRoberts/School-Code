// Class:		CSE 1321L
//Section:		12
//Term:			Spring 2020		
//Instructor:	Keerthi Manchukonda	
//Name:			Jawanza Roberts
//Lab#:			2
import java.util.Scanner;

public class Echo {
	public static void main(String [] args) {
		String message;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a line of text:");
		message = scan.nextLine();
		System.out.println("You entered: \"" + message + "\"");
	}
}
