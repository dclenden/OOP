// David W. Clendenning Jr. - CSC 164 - 450 - 10/20/2018 - Lab 1
package WK6;
import java.util.*;
public class State {
    private String stateName;
    private String stateCapital;
    private String stateAbrv;
    
    public static void main(String[] args) {
    	State ca = new State("California", "Sacremento", "CA");
    	State tx = new State();
    	State ma = new State("Massachusetts", "Boston", "MA");
    	State wy = new State("Wyoming", "Cheyenne", "WY");
    	State ri = new State("Rhode Island", "Providence", "RI");
    	
    	Scanner input = new Scanner(System.in);
    	
    	ArrayList <State> stateList = new ArrayList <State>();
    	Collections.addAll(stateList, ca, tx, ma, wy, ri);
    	
    	System.out.println("There are 5 states listed, one of them will be incorrect: Please remove that state from the array\n");
    	
    	
    	for(int i = 0; i < stateList.size(); i++) {
    		System.out.println("State: " + (i + 1) + stateList.get(i).toString());
    		}
    	
    	System.out.println("\n\nPlease enter the abbreviation of the state you would like to remove: ex. ca");
    	String removedState = input.nextLine().toUpperCase();
    	stateList.removeIf(State -> State.getAbrv().equals(removedState));
    	System.out.println("New List: \n\n");
    	
    	for(int i = 0; i < stateList.size(); i++) {
    		System.out.println("State: " + (i + 1) + stateList.get(i).toString());    	
    		}
    	
    }
    public State() {
    	this.stateName = "State";
    	this.stateCapital = "Capital";
    	this.stateAbrv = "AA";
    }
    public State(String stateName, String stateCapital, String stateAbrv) {
    	this.stateName = stateName;
    	this.stateCapital = stateCapital;
    	this.stateAbrv = stateAbrv;
    }
    public void setName(String stateName) {
    	this.stateName = stateName;
    }
    public void setCapital(String stateCapital) {
    	this.stateCapital = stateCapital;
    }
    public void setAbrv(String stateAbrv) {
    	this.stateAbrv = stateAbrv;
    }
    public String getName() {
    	return this.stateName;
    }
    public String getCapital() {
    	return this.stateCapital;
    }
    public String getAbrv() {
        return this.stateAbrv;
    }
    
    public String toString() {
    	return
    	"\nState: " + this.getName() +
    	 "\nCapital: " + this.getCapital() +
    	 "\nAbbreviation: " + this.getAbrv() + "\n\n";
    }
}
