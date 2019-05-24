//David W. Clendenning - CSC164 - 11/11/2018 lab part 2
package HelloIamBored2;
import java.util.*;
import java.lang.*;
public class Transcript implements Cloneable {
    private String name;
	private int studentID;
	private ArrayList<String> courses = new ArrayList<String>();
	
	public Transcript() {
		
	}
	public Transcript(String name, int studentID) {
		this.name = name;
		this.studentID = studentID;
	}
	
	public void addCourse(String a) {
		courses.add(a);
	}
	
	public String toString() {
		return "Course: " + this.courses;
	}
	
	public static void testMethod() {
		Transcript s1 = new Transcript("Somebody", 12341);
		s1.addCourse("MATH");
		s1.addCourse("CSC");
		s1.addCourse("CIS");
		Transcript s2 = (Transcript)s1.clone();
		System.out.println("Transcript 1: \n");
		System.out.println("Name: " + s1.name + "\nStudent ID: " + s1.studentID + "\n");
		for(String a: s1.courses) {
			System.out.println(a);
		}
		System.out.println("\nTranscript 2(Transcript 1 cloned): \n");
		System.out.println("Name: " + s1.name + "\nStudent ID: " + s1.studentID + "\n");
		for(String a: s2.courses) {
			System.out.println(a);
		}
		
		
	}
	
	public Object clone() {
		try {
			return super.clone();
		}
		catch(CloneNotSupportedException e){
			return null;
		}
	}
	
	public static void main(String[] args) { 
		testMethod();
		
	}
}