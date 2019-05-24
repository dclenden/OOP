//David W. Clendenning Jr. - CSC164 - 450 - 9/20/18 - Lab:Q2
package WK3;
import java.util.Scanner;
public class ACIILoop {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	System.out.println("Please enter one of the following\n\nU: UpperCase\nL: LowerCase\nP: Punctuation");
    	char userInput = input.next().charAt(0);
    	userInput = Character.toLowerCase(userInput);
    	int row = 0;
    	if(userInput == 'l') {
    	    for(int i = 97; i < 123; i++) {
    	    	System.out.print("|" + (char)i + "| -> " + i + ", ");
    	    	row++;
    	    	if(row % 10 == 0) {
    	    		System.out.println("\n");
    	    	}
    	    }
    	}
    	
    	else if(userInput == 'p') {
    		for(int i = 35; i < 48; i++) {
    			System.out.print("|" + (char)i + "| -> " + i + ", ");
    			row++;
    	    	if(row % 10 == 0) {
    	    		System.out.println("\n");
    	    	}
    		}
    	}
    	else if(userInput == 'u'){
    		for(int i = 65; i < 91; i++) {
    			System.out.print("|" + (char)i + "| -> " + i + ", ");
    			row++;
    	    	if(row % 10 == 0) {
    	    		System.out.println("\n");
    	    	}
    		}
    	}
    	else {
    		System.out.println("Error: restart program");
    	}
    	
    	input.close();
    }
}
