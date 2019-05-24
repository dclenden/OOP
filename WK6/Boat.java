// David W. Clendenning Jr. - CSC 164 - 450 - 10/20/2018 - Lab 2
package WK6;

public class Boat extends Vehicle{
	Boat(){
    	super.setMaxOccupants(5);
    	super.setMaxSpeed(30);
    	super.setNumDoors(1);
    	super.setColor("blue");
    	super.setNumLifevests(5);
    	super.setHasCabin(true);
    }
	Boat(int maxOccupants, double maxSpeed, int numDoors, String newColor, int numLifevests, boolean cabin){
		super.setMaxOccupants(maxOccupants);
		super.setMaxSpeed(maxSpeed);
		super.setNumDoors(numDoors);
		super.setColor(newColor);
		super.setNumLifevests(numLifevests);
		super.setHasCabin(cabin);
	}
	
	public String toString() {
		return
	    "\nMax Occupants: " + super.getMaxOccupants() + "\nMax Speed: " + 
		super.getMaxSpeed() + "\nNumber of Doors: " + super.getNumDoors() + 
		"\nColor: " + super.getColor() + "\nNumber of Lifevests: " + super.getNumLifevests() 
		+ "\nHas a Cabin?: " + super.getHasCabin() + "\n\n";

	}
	public boolean equals(Object o) {
    	if (o instanceof Boat) {
    	    if ((super.getMaxOccupants() == ((Boat)o).getMaxOccupants()) && (super.getMaxSpeed() == 
    	       ((Boat)o).getMaxSpeed()) && (super.getNumDoors() == ((Boat)o).getNumDoors()) &&
    	       (super.getColor() == ((Boat)o).getColor()) && (super.getNumLifevests() == ((Boat)o).getNumLifevests())
    	       && (super.getHasCabin() == ((Boat)o).getHasCabin())) {
    	       
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