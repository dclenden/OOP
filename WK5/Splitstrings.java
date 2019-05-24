// David W. Clendenning Jr. - CSC 164 - 450 - 10/13/2018 - Lab #1
package WK5;

public class Splitstrings {
    public static void main(String[] args) {
        String ex = "PID|||PATID1234^5^M11||JONES^WILLIAM^A^III||19610615|M-||C|1200 N ELM"+"STREET^^GREENSBORO^NC^27401-1020|GL|(91-9)379-1212|(919)271-\\\" + 3434||S||PATID12345001^2^M10|123456789|9-87654^NC";
// -> remove // and add it to line above in order to test other string//String ex = "PID|1||42||BEEBLEBROX^ZAPHOD||19781012|M|||1 Heart of Gold ave^^Fort Wayne^IN^46804||(260)555-1234|||S||999999999|||||||||||||||||||||"; // other example
    	String[] data = ex.split("\\|");
    	String[] name = data[5].split("\\^");
    	String[] address = data[11].split("\\^");
    	
    	for(int i = 0; i < address.length; i++) {
    		System.out.println(address[i] + " Index: " + i);
    	}
    	System.out.print("Name: " + name[1].toUpperCase().charAt(0) + name[1].toLowerCase().substring(1));
    	System.out.print(name.length > 1 ? " " + name[0].toUpperCase().charAt(0) + name[0].toLowerCase().substring(1) : "");
    	System.out.print(name.length > 2 ? " " + name[2].toUpperCase().charAt(0) + name[2].toLowerCase().substring(1) : "");
    	System.out.print(name.length > 3 ? " " + name[3].toUpperCase().charAt(0) + name[3].substring(1) : "");
    	
    	System.out.print("\nDOB: " + data[7].substring(4, 6) + "/" +  data[7].substring(6, 8) + "/" + data[7].substring(0, 4));
    	
    	System.out.print("\nAddress: " + (address[0].isEmpty() ? "" : address[0].toUpperCase().charAt(0)) + (address[0].contains("STREET") ? (address[0].substring(1, 8) + address[0].substring(8, 10).toLowerCase()
    			+ " " + address[0].substring(10, 12).toLowerCase() + address[0].substring(16).toLowerCase() + ", ") : address[0].substring(1) + " "));
    	System.out.print(address[1].isEmpty() ? "" : address[1].toUpperCase().charAt(0) +  address[1].toLowerCase().substring(1) + " " );
    	System.out.print(address[2].isEmpty() ? "" : address[2].toUpperCase().charAt(0) + address[2].toLowerCase().substring(1) + " " );
    	System.out.print(address[3].isEmpty() ? "" : address[3] + " " + address[4].substring(0, 5));
    }
        
}
