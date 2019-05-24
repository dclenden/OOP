package ILostTrackOfTheWeeks;
import java.io.*;
import java.util.*;
public class Read {
    public static void main(String[] args) throws java.io.IOException {
    	try {
    	java.io.File file = new File("Classes.txt");
    	Scanner input = new Scanner(file);
    	input.useDelimiter("\t");
    	ArrayList<String> s = new ArrayList<String>();
        List<String> s2 = new ArrayList<String>();
        Collections.addAll(s2, "A", "B", "C", "F");
    
        while(input.hasNext()) {
    		int i = 0;
    		i++;
    		s.add(input.useDelimiter("\\\t").next());
    	}
        
    	s.retainAll(s2);
    	//s.remove(enter index here to change elements in array);
    	//s.add("B");
    	//s.add("C");
    	System.out.print("Grades: ");
    	for(String num: s) {
    		System.out.print("|" + num + "|");
    	}
    	
    	input.close();
    	
    	System.out.printf("\nGPA: " + "%.2f", getGrade(s));
    	}
    	catch(FileNotFoundException e){
    		System.out.println("Please run program 'Write' first before executing this program");
    	}
    	
    }
    
    public static double getGrade(ArrayList<String> grade){
    	double totalGrade = 0.0;
    	for(int i = 0; i < grade.size(); i++) {
    		if(grade.get(i).toString().equals("A")) {
    			totalGrade += 4.0;
    		}
    		else if(grade.get(i).toString().equals("B")) {
    			totalGrade += 3.0;
    		}
    		else if(grade.get(i).toString().equals("C")) {
    			totalGrade += 2.0;
    		}
    		else{
    			totalGrade += 0.0;
    		}
    	}
    	return (totalGrade / grade.size());
    }
}
