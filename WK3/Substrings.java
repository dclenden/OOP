//David W. Clendenning Jr. - CSC164 - 450 - 9/20/18 - Lab:Q4
package WK3;
import java.util.Scanner;
public class Substrings {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	System.out.println("Please enter a String; I will split it into two parts and display them");
    	String userString = input.nextLine();
    	int halfString;
    	System.out.println("String: " + userString + "\nString(1): " + userString.substring(0, (userString.length() / 2)) 
    	+ "\nString(2): " + userString.substring((userString.length()/2), userString.length()));
    	
    	
    	input.close();
    }
}
