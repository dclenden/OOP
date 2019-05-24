//David W. Clendenning Jr. - CSC164 - 450 - 9/20/18 - Lab:Q3
package WK3;
import java.util.Scanner;
public class StringMethod {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	System.out.println("Please enter a String and I will display it in a 'normal' way and then through"
    			+ " a few methods that will make all letters uppercase/lowercase");
    	String userInput = input.nextLine();
    	System.out.println("String: " + userInput + " | .toUpperCase: " + userInput.toUpperCase() + " | .toLowerCase: " + userInput.toLowerCase());
    	//This does not change the original string because it simply makes a copy of the original string and modifies that to a upper / lower case. 
    	//The real String is stored somewhere in memory waiting to be used.
    	
    	input.close();
    }
}
