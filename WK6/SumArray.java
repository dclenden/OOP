// David W. Clendenning Jr. - CSC 164 - 450 - 10/20/2018 - Lab 11.12
package WK6;
import java.util.*;
public class SumArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ArrayList<Double> list = new ArrayList<Double>();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Num " + (i + 1) + ": ");
			list.add(input.nextDouble());
		}

		System.out.println("Sum of list: " + sum(list));
	}

	public static double sum(ArrayList<Double> list) {
		double sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		return sum;
	}
}
