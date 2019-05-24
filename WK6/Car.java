// David W. Clendenning Jr. - CSC 164 - 450 - 10/20/2018 - Lab 2
package WK6;

public class Car extends Vehicle{
    Car(){
    	super.setMaxOccupants(2);
    	super.setMaxSpeed(60);
    	super.setNumDoors(4);
    	super.setColor("blue");
    	super.setNumWheels(4);
    }
    Car(int maxOccupants, double maxSpeed, int numDoors, String newColor, int numWheels){
    	super.setMaxOccupants(maxOccupants);
    	super.setMaxSpeed(maxSpeed);
    	super.setNumDoors(numDoors);
    	super.setColor(newColor);
    	super.setNumWheels(numWheels);
    }
    public String toString() {
		return
    	"\nMax Occupants: " + super.getMaxOccupants() +
		"\nMax Speed: " + super.getMaxSpeed() +
	    "\nNumber of Doors: " + super.getNumDoors() +
	    "\nColor: " + super.getColor() +
	    "\nNumber of Wheels: " + super.getNumWheels() + "\n\n";
	}
    public boolean equals(Object o) {
    	if (o instanceof Car) {
    	    if ((super.getMaxOccupants() == ((Car)o).getMaxOccupants()) && (super.getMaxSpeed() == 
    	       ((Car)o).getMaxSpeed()) && (super.getNumDoors() == ((Car)o).getNumDoors()) &&
    	       (super.getColor() == ((Car)o).getColor()) && (super.getNumWheels() == ((Car)o).getNumWheels())) {
    	       return true;
    	    }
    	    else {
        		return false;
    	    }
    	}
    	else {
    		return false;
    	}
    }
    
}
