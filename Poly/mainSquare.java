//David W. Clendenning Jr. - CSC164 - 11/5/2017 13.7
package HelloIamBored2;

public class mainSquare {
	public static void main(String[] args) {
		GeometricObject[] squares = {new Square(0.15), new Square(103), 
			new Square(3.1), new Square(6.1), new Square(57.3)};

		for (int i = 0; i < squares.length; i++) {
		 	System.out.println("\nSquare #" + (i + 1));
		 	System.out.println("Area: " + squares[i].getArea());
		 	System.out.println("How to color: " + ((Square)squares[i]).howToColor());
		 } 
	}
}
