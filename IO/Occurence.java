package ILostTrackOfTheWeeks;
import java.util.*;
import java.io.*;
public class Occurence {
    public static void main (String[] args) throws FileNotFoundException{
    	File file = new File(getFileName());
    	
    	if(!file.exists()) {
    		System.out.println("This file: " + file.getName() + " does not exist!");
    		System.exit(0);
    	}
    	
    	int[] count = new int[26];
    	
    	try(Scanner input = new Scanner(file)) {
    		while(input.hasNext()) {
    			String nxtline = (input.nextLine()).toUpperCase();
    			countLetters(count, nxtline);
    		}
    	}
    	
    	for(int i = 0; i < count.length; i++) {
    		System.out.println("Number of " + (char)('A' + i) + "'s: " + count[i]);
    	}
    	
    }
    
    public static void countLetters(int[] count, String s) {
    	for(int i = 0; i < s.length(); i++) {
    		if(Character.isLetter(s.charAt(i))) {
    			count[(int)(s.charAt(i) - 'A')]++;
    		}
    	}
    }
    
    public static String getFileName() {
    	Scanner input = new Scanner(System.in);
    	
    	System.out.println("Enter a file name(no spaces): ");
    	
    	return input.next();
    }
}
