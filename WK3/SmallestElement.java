//David W. Clendenning - CSC164 - 450 - 9/21/2018 - 7.9 HW
package WK3;
import java.util.Scanner;
public class SmallestElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] n = new double[10];
        for(int i = 0; i < n.length; i++) {
        	System.out.println("Enter 10 numbers " + (i + 1 ) + ": ");
        	n[i] = input.nextDouble();
        }
        System.out.printf("Min Num: " + min(n));
        
        input.close();
    }
    public static double min(double[] array) {
    	double min = array[0];
    	for(double i: array) {
    		if(i < min)
    			min = i;
    	}
    	return min;
    }
}
