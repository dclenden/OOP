package ch18;

import java.util.Scanner;

public class CharacterReverse {
	/** Main method */
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a string
		System.out.print("Enter a string: ");
		String s1 = input.next();

		// Display the s1 reversely
		reverseDisplay(s1);
	}

	/** Method displays the characters in a string reversely */
	private static void reverseDisplay(String s1) {
		int val = s1.length() - 1;
		if (s1.length() == 1) // Base case
			System.out.println(s1);
		else {
			System.out.print(s1.charAt(val));
			reverseDisplay(s1.substring(0, val)); // Recursive call
		}
	}
}