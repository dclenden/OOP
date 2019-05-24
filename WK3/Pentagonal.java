//David W. Clendenning - CSC164 - 450 - 9/21/2018 - 6.1 HW
package WK3;
import java.util.Scanner;
public class Pentagonal {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	System.out.print("Enter num: " );
    	int userPent = input.nextInt();
    	System.out.println("Pentagonal num: " + getPentagonalnum(userPent));
    	
    	input.close();
    }
	public static int getPentagonalnum(int num) {
		int pentnum = (num * (3*num - 1))/2;
		return pentnum;
	}
}
