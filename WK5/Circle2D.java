// David W. Clendenning Jr. - CSC 164 - 450 - 10/13/2018 - HW 10.11
package WK5;
import java.util.*;
public class Circle2D {
    private double x;
    private double y;
    private double r;
    
    Circle2D(){
    	this.x = 0.0;
    	this.y = 0.0;
    	this.r = 1.0;
    }
    
    Circle2D(double x, double y, double r){
    	this.x = x;
    	this.y = y;
    	this.r = r;
    }
    public double getx() {
    	return x;
    }
    public double gety() {
    	return y;
    }
    public double getr() {
    	return r;
    }
    public double getArea() {
    	return Math.PI * Math.pow(r, 2);
    }
    public double getPerimeter() {
    	return 2 * Math.PI * r;
    }
    
    public boolean contains(double x, double y) {
    	return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2)) < r;
    }
    
    public boolean contains(Circle2D circle) {
    	return Math.sqrt(Math.pow(circle.getx() - x, 2) + Math.pow(circle.gety() - y, 2)) <= Math.abs(r - circle.getr());
    }
    public boolean overlaps(Circle2D circle) {
    	return Math.sqrt(Math.pow(circle.getx() - x, 2) + Math.pow(circle.gety() - y, 2)) <= r + circle.getr(); 
    }
	
	public static void main(String[] args) {
		Circle2D c1 = new Circle2D(5, 5, 7);
		Circle2D c2 = new Circle2D();
		System.out.println("c1 Area: " + c1.getArea());
		System.out.println("c1 Perimeter: " + c1.getPerimeter());
		System.out.println("contains (1,1)?: " + c1.contains(1,1));
		System.out.println("contains object?: " + c1.contains(c2));
		System.out.println("overlap object?: " + c1.overlaps(c2));
	}
}

