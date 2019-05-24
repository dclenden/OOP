// David W. Clendenning Jr. - CSC 164 - 450 - 10/20/2018 - HW 11.6
package WK6;

import java.util.*;

public class Array {

	public static void main(String[] args) {
		ArrayList<Object> o = new ArrayList<Object>();
		o.add(new Loan());		
		o.add(new Date());		
		o.add(new String("String"));	
		o.add(new Circle());	


		for (int i = 0; i < o.size(); i++) {
			System.out.println((o.get(i)).toString());
		}
	}
}
