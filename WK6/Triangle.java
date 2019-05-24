// David W. Clendenning Jr. - CSC 164 - 450 - 10/20/2018 - HW 11.1
package WK6;

public class Triangle extends GeometricObject{
	private double s1;
	private double s2;
	private double s3;
	
	Triangle() {
		s1 = 1.0;
		s2 = 1.0;
		s3 = 1.0;
	}

	Triangle(double s1, double s2, double s3) { 
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}

	public double gets1() {
		return s1;
	}

	public double gets2() {
		return s2;
	}

	public double gets3() {
		return s3;
	}

	public double getArea() {
		double s = (s1 + s2 + s3) / 2;
		return Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
	}

	public double getPerimeter() {
		return s1 + s2 + s3;
	}

	public String toString() {
		return "Triangle: s1 = " + s1 + " s2 = " + s2 +
			" s3 = " + s3;
	}
}
