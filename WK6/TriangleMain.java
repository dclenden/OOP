// David W. Clendenning Jr. - CSC 164 - 450 - 10/20/2018 - HW 11.1
package WK6;
import java.util.*;
public class TriangleMain {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		
		System.out.print("Side1: ");
		double s1 = input.nextDouble();
		System.out.print("Side2: ");
		double s2 = input.nextDouble();
		System.out.print("Side3: ");
		double s3 = input.nextDouble();

		
		System.out.print("Enter a color: ");
		String color = input.next();
		
		System.out.print("Is the triangle filled? ex. (true / false) ");
		boolean filled = input.nextBoolean();
		Triangle triangle = new Triangle(s1, s2, s3);
		triangle.setColor(color);
		triangle.setFilled(filled);

		System.out.println(triangle.toString());
		System.out.println("Area: " + triangle.getArea());
		System.out.println("Perimeter: " + triangle.getPerimeter());
		System.out.println("Color: " + triangle.getColor());
		System.out.println("Triangle is " + (triangle.isFilled() ? "" : "not ") + "filled");
	}
}
