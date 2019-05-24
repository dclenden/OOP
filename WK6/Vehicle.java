// David W. Clendenning Jr. - CSC 164 - 450 - 10/20/2018 - Lab 2
package WK6;
import java.util.*;
public class Vehicle {
	private int maxOccupants;
	private double maxSpeed;
	private int numDoors;
	private String color;
	private int numWheels;
	private int numLifevests;
	private boolean hasCabin;
	
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car(2, 100, 2, "green", 4);
		Boat boat1 = new Boat();
		Boat boat2 = new Boat(6, 25, 0, "purple", 6, false);
		
		ArrayList <Vehicle> list = new ArrayList <Vehicle>();
		Collections.addAll(list, car1, car2, boat1, boat2);
		
		for(int i = 0; i < list.size(); i++) {
		    System.out.println("Object " + (i + 1) + ": " + list.get(i).toString());
		}
		
		System.out.println("\n\nCar1 equal to Car2?: " + car1.equals(car2));
		System.out.println("\n\nBoat1 equal to Boat2?: " + boat1.equals(boat2));
		car1.setMaxOccupants(2);
		car1.setMaxSpeed(100);
		car1.setNumDoors(2);
		car1.setColor("green");
		car1.setNumWheels(4);
		System.out.println("\nAfter data is changed to be the same as car 1 & 2\nCar1 equal to Car2?: " + car1.equals(car2));
		boat1.setMaxOccupants(6);
		boat1.setMaxSpeed(25);
		boat1.setNumDoors(0);
		boat1.setColor("purple");
		boat1.setNumLifevests(6);
		boat1.setHasCabin(false);
		System.out.println("\nAfter data is changed to be the same as boat 1 & 2\nBoat1 equal to Boat2?: " + boat1.equals(boat2));
		
	}
	
	public void setMaxOccupants(int maxOccupants) {
		this.maxOccupants = maxOccupants;
	}
	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public void setNumDoors(int numDoors) {
		this.numDoors = numDoors;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setNumWheels(int numWheels) {
		this.numWheels = numWheels;
	}
	public void setNumLifevests(int numLifevests) {
		this.numLifevests = numLifevests;
	}
	public void setHasCabin(boolean hasCabin) {
		this.hasCabin = hasCabin;
	}
	
	public int getMaxOccupants() {
		return this.maxOccupants;
	}
	public double getMaxSpeed() {
		return this.maxSpeed;
	}
	public int getNumDoors() {
		return this.numDoors;
	}
	public String getColor() {
		return this.color;
	}
	public int getNumWheels() {
		return this.numWheels;
	}
	public int getNumLifevests() {
		return this.numLifevests;
	}
	public boolean getHasCabin() {
		return this.hasCabin;
	}
	
}


