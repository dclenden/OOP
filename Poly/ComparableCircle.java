//David W. Clendenning Jr. - CSC164 - 11/5/2017 13.6
package HelloIamBored2;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

	public ComparableCircle() {
	}
	public ComparableCircle(double radius) {
	super(radius);
	}
	public ComparableCircle(double radius, String color, boolean filled) {
	super(radius, color, filled);
	}
	public int compareTo(ComparableCircle o) {
	return this.getArea() > o.getArea() ? 1 : (this.getArea() < o.getArea() ? -1 : 0);
	
	}
	public String toString() {
		return super.toString() + "\nArea: " + getArea();
	}
}