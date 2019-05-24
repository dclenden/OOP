//David W. Clendenning - CSC164 - 450 - 9/21/2018 - 6.17 HW
package WK3;
import java.util.Scanner;
public class Matrix {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	System.out.println("This program will print a square of 0's and 1's based on your input");
    	System.out.print("Enter Number: ");
    	int matrixnum = input.nextInt();
    	printMatrix(matrixnum);
    	
        input.close();
    }
    public static void printMatrix(int n) {
    	for(int rows = 0; rows < n; rows++) {
    		for(int cols = 0; cols < n; cols++) {
    			System.out.print(((int)(Math.random() * 2)));
    		}
    		System.out.println();
    	}
    }
}
