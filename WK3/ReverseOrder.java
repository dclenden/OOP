//David W. Clendenning - CSC164 - 450 - 9/21/2018 - 7.2 HW
package WK3;
import java.util.Scanner;
public class ReverseOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] reverse = new int[10];
        for(int i = 0; i < reverse.length; i++) {
        	System.out.println("Enter 10 numbers " + (i + 1 ) + ": ");
        	reverse[i] = input.nextInt();
        }
        for(int j = reverse.length - 1; j >= 0; j--) {
        	System.out.println("Num " + (j + 1)+ ": " + reverse[j]);
        }
        
        
        input.close();
    }
}
