//David W. Clendenning - CSC164 - 11/11/2018 lab part 1
package HelloIamBored2;

import java.util.*;
import java.lang.*;

public class Car implements Comparable<Car>{
	private int year;
	private String make;
	private String model;
	private String color;
	private double gasMPG;
	private double price;
	
	public Car() {
		this.year = 2010;
		this.make = "Ford";
		this.model = "Fusion";
		this.color = "Green";
		this.gasMPG = 20.0;
		this.price = 20000.00;
	}
	public Car(int year, String make, String model, String color, double gasMPG, double price) {
		this.year = year;
		this.make = make;
		this.model = model;
        this.color = color;
        this.gasMPG = gasMPG;
		this.price = price;
	}
	
    public void setYear(int year) {
    	this.year = year;
    }
    public void setMake(String make) {
    	this.make = make;
    }
    public void setModel(String model) {
    	this.model = model;
    }
    public void setColor(String color) {
    	this.color = color;
    }
    public void setgasMPG(double gasMPG) {
    	this.gasMPG = gasMPG;
    }
    public void setPrice(double price) {
    	this.price = price;
    }
    public int getYear() {
    	return this.year;
    }
    public String getMake() {
    	return this.make;
    }
    public String getModel() {
    	return this.model;
    }
    public String getColor() {
    	return this.color;
    }
    public double getgasMPG() {
    	return this.gasMPG;
    }
    public double getPrice() {
    	return this.price;
    }
    
    public int compareTo(Car a) {
    	return (this.getPrice() > a.getPrice() ? 1 : (this.getPrice() == a.getPrice() ? 0 : -1));
    	}
    
    public String toString() {
    	return "Year: " + this.year + "\tMake: " + this.make + "\tModel: " + this.model;
    }

    public static void main(String[] args) {
	    Car car1 = new Car(); 
    	test();
	    //car1.toString();
    }
    
    public static void test() {
    	Car car1 = new Car();
    	Car car2 = new Car(1999, "Ford", "Fusion", "Purple", 15.6, 15000.00);
    	Car car3 = new Car(2001, "Chevy", "LT", "Orange", 13.1, 10000.00);
    	Car car4 = new Car(2003, "Chevy", "RL", "Red", 17.3, 123000.00);
    	Car car5 = new Car(1993, "Subaru", "LT", "Orange", 23.1, 13000.00);
    	
    	Car[] cars = {car1, car2, car3, car4, car5};
    	
    	for(int i = 0; i < cars.length; i++) {
    		System.out.println("Price: " + cars[i].getPrice() + "\t" + cars[i].toString());
    	}
    	
    	Arrays.sort(cars);
    	
    	System.out.println("\n\nAFTER SORTING BY PRICE!!!!!!!!!\n\n");
    	
    	for(int i = 0; i < cars.length; i++) {
    		System.out.println("Price: " + cars[i].getPrice() + "\t" + cars[i].toString());
    	}
    }
}
