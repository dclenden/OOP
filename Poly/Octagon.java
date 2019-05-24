//David W. Clendenning Jr. - CSC164 - 11/5/2017 13.11
package HelloIamBored2;

public class Octagon extends GeometricObject implements Cloneable, Comparable<Octagon> {
	private double side;
	
	public Octagon() {
	}
	
	
	public Octagon(double side) {
		this.side = side;
	}
	
	public void setSide(double side) {
		this.side = side;
	}
	
	public double getSide() {
		return side;
	}
	
	public double getArea() {
		return (2 + 4 / Math.sqrt(2)) * side * side;
	}
	
	public double getPerimeter() {
		return 8 * side;
	}
	
	public int compareTo(Octagon o) {
		return this.getArea() > o.getArea() ? 1 : (this.getArea() < o.getArea() ? -1 : 0);
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public String toString() {
		return super.toString() + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
	}
}