package ILostTrackOfTheWeeks;
import java.util.*;
import java.io.*;
public class twoInts { //12.2
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	int num1 = 0;
    	int num2 = 0;
    	while(true) {
    		System.out.println("Enter two integers: ");
	    	try {
	    		num1 = input.nextInt();
	    		num2 = input.nextInt();
	    	    break;	
	    	}
	    	catch(InputMismatchException e) {
	    		System.out.println("Invalid input! (Please enter valid numbers)\n\n");
	    		input.nextLine();
	    	}
        }
    	System.out.println("Sum -> " + num1 + " + " + num2 + " = " + (num1 + num2));
    }
}
