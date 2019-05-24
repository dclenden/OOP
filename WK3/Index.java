//David W. Clendenning Jr. - CSC164 - 450 - 9/20/18 - Lab:Q5
package WK3;
import java.util.Scanner;
public class Index {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	System.out.println("Please enter a String so that I can displey the first occurrence of a Vowel based on index position of that String");
    	String userString = input.nextLine();
    	userString = userString.toLowerCase();
    	for(int i = 0; i < userString.length(); i++) {
    		if(userString.charAt(i) == 'a' || userString.charAt(i) == 'e' || userString.charAt(i) == 'i' 
    	    || userString.charAt(i) == 'o' || userString.charAt(i) == 'u' || userString.charAt(i) == 'y') {
    			System.out.println("First Occurence of a vowel is index " + i + ": " + userString.charAt(i));
    			break;
    		}
    			
    		
    	}
    	
    	
    	
    	
    	input.close();
    }
}
