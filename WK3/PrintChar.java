//David W. Clendenning - CSC164 - 450 - 9/21/2018 - 6.12 HW
package WK3;
import java.util.Scanner;
public class PrintChar {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	System.out.print("Enter char1: ");
    	char firstChar = input.next().charAt(0);
    	System.out.print("Enter char2: ");
    	char lastChar = input.next().charAt(0);
    	System.out.print("Enter Num of Char per line: ");
    	int line = input.nextInt();
    	printChars(firstChar, lastChar, line);
    	
    	input.close();
    }
    public static void printChars(char ch1, char ch2, int numPerln) {
    	int i = (int)ch1;
    	int counter = 0;
    	for(int j = ch1; j <= ch2; j++) {
    		counter++;
    	    System.out.print((char)j + " ");
    	    if(counter == numPerln) {
    	    	System.out.println();
    	    	counter = 0;
    	    }
    	}

    }
}
