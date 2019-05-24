// David W. Clendenning Jr. - CSC 164 - 450 - 10/20/2018 - Lab 11.6
package WK6;

public class Circle {

	private double radius = 1;
	private static int numberOfObjects = 0;


	public Circle() {
		numberOfObjects++;
	}


	public Circle(double newRadius) {
		radius = newRadius;
		numberOfObjects++;
	}


	public double getRadius() {
		return radius;
	}


	public void setRadius(double newRadius) {
		radius = (newRadius >= 0) ? newRadius : 0;
	}


	public static int getNumberOfObjects() {
		return numberOfObjects;
	}

	public double getArea() {
		return radius * radius * Math.PI;
	}
}
