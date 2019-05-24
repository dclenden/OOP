//David W. Clendenning - CSC164 - 450 - 9/21/2018 - 7.19 HW
package WK3;
import java.util.Scanner;
public class Sorted {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int[] arraynum = new int[input.nextInt()];
        
        for(int i = 0; i < arraynum.length; i++) {
        	System.out.print("Enter num " + (i + 1) + ": ");
        	arraynum[i] = input.nextInt();
        }
        
        System.out.println("The list is " + (isSorted(arraynum) ? "Already " : "not ") + "sorted");
        
        input.close();
    }
    public static boolean isSorted(int[] array) {
    	for(int i = 0; i < array.length - 1; i++) {
    		if(array[i] > array[i + 1])
    			return false;
    	}
    	return true;
    }
}
