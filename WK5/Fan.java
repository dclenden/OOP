// David W. Clendenning Jr. - CSC 164 - 450 - 10/13/2018 - HW 9.8
package WK5;

public class Fan {
	final static int SLOW = 1; // <- made static variabled to use in both the main method and the class' scope
	final static int MEDIUM = 2;
	final static int FAST = 3;
	private int speed;
	private boolean on;
	private double radius;
	String color;

	Fan() {
		this.speed = SLOW;
		this.on = false;
		this.radius = 5;
		this.color = "blue";
	}
	public void setSpeed(int newSpeed) {
		this.speed = newSpeed;
	}


	public void turnOn() {
			this.on = true;
	}


	public void turnOff() {
			this.on = false;
	}


	public void setColor(String newColor) {
		this.color = newColor;
	}


	public void setRadius(double newRadius) {
		this.radius = newRadius;
	}

	public String getSpeed() {
		String s = "";
		switch (speed) {
			case SLOW: s = "SLOW"; break;
			case MEDIUM: s = "MEDIUM"; break;
			case FAST: s = "FAST";
		}
		return s;
	}


	public boolean isOn() {
		return this.on;
	}

	public double getRadius() {
		return this.radius;
	}

	public String getColor() {
		return this.color;
	}

	public String toString() {
		if (on == true) {
			return "\nFan speed: " + getSpeed() + ", color: " + this.color + ", radius: " + this.radius + "\n";
		}
		else{
			return "\nFan color: " + this.color + ", radius: " + this.radius + "\t:\tfan is off";
		}
	}
	
	public static void main(String[] args) {

		Fan fan1 = new Fan();
		Fan fan2 = new Fan();
		fan1.setSpeed(FAST); //all mutator methods called to assign values to object
		fan1.setRadius(10);
		fan1.setColor("yellow");
		fan1.turnOn();
		fan2.setSpeed(MEDIUM);
		fan2.setRadius(5);
		fan2.setColor("blue");
		fan2.turnOff();
		System.out.println(fan1.toString());//created a toString() method to invoke that provides information about the fans
		System.out.println(fan2.toString());
	}
}

