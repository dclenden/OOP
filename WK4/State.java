package WK4;

public class State {
    private String stateName;
    private String stateCapital;
    private String stateAbrv;
    
    public static void main(String[] args) {
    	State ca = new State("California", "Sacremento", "CA");
    	State tx = new State();
    	System.out.println("\nState: California - implemented args\n");
    	System.out.println("Name: " + ca.getName() + "\nCapital: " + ca.getCapital() + "\nAbreviation: " + ca.getAbrv());
    	System.out.println("\nState: default field - no methods\n");
    	System.out.println("Name: " + tx.getName() + "\nCapital: " + tx.getCapital() + "\nAbreviation: " + tx.getAbrv());
    	tx.setName("Texas");
    	tx.setCapital("Austin");
    	tx.setAbrv("TX");
    	System.out.println("\nState: Texas w/ set methods\n");
    	System.out.println("Name: " + tx.getName() + "\nCapital: " + tx.getCapital() + "\nAbreviation: " + tx.getAbrv());
    	
    	
    }
    public State() {
    	this.stateName = "State";
    	this.stateCapital = "Capital";
    	this.stateAbrv = "Abreviation";
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
}
