// David W. Clendenning Jr. - CSC 164 - 450 - 10/13/2018 - HW 10.4
package WK5;
import java.util.*;
public class MyPoint {
    private double x;
    private double y;
    
    MyPoint(){
    	this.x = 0.0;
    	this.y = 0.0;
    }
    
    MyPoint(double x, double y){
    	this.x = x;
    	this.y = y;
    }
    
    public double getx() {
    	return this.x;
    }
    public double gety() {
    	return this.y;
    }
    
    public double distance(MyPoint point) {
    	double distance;
    	double x1 = point.getx();
    	double y1 = point.gety();
    	
    	distance = Math.sqrt(Math.pow(x1 - this.getx(),2) + Math.pow(y1 - this.gety(), 2)); //googled formula, seen it was just a simple slope formula and just used that
    	
    	return distance;
    }
    
    public double distance(double x1, double y1) {
    	double distance;
    	distance = Math.sqrt(Math.pow(x1 - this.getx(),2) + Math.pow(y1 - this.gety(), 2));
    	return distance;
    	
    }
    public static double distance(MyPoint point1, MyPoint point2) {
    	double distance;
    	distance = Math.sqrt(Math.pow(point1.getx() - point2.getx(),2) + Math.pow(point1.gety() - point2.gety(), 2));
    	return distance;
    	
    }
    
    public static void main(String args[]){
        System.out.println("p1 default: (0,0)");
        MyPoint p1 = new MyPoint(); // creates default point (0,0)

        System.out.println("p2: (7,19.3)");
        MyPoint p2 = new MyPoint(7,19.3); // creates point with x=10, y=30.5

        System.out.println("\nDistance between p1 and p2: " + p1.distance(p2));

        System.out.println("Distance between p1 (0,0) and p2 (7,19.3): " + p1.distance(7,19.3));
        System.out.println("Distance Objects: " + distance(p1,p2));
    
    }
}
