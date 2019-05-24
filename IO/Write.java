package ILostTrackOfTheWeeks;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
public class Write {
    public static void main(String[] args) throws java.io.IOException {
    	java.io.File file = new java.io.File("Classes.txt");
    	if(file.exists()) {
    		System.out.println("File already exists!");
    		//System.exit(1);
    	}
    	java.io.PrintWriter output = new PrintWriter(file);
    	output.println("ENG101\tCritical Thinking & Academic Writing\tDr.Becker\tSpring 2018\tAllen & Bacon 7th edition\tA\t");
    	output.println("HIS111\tU.S. History: Pre-Civil War\tMr.\tSpring 2018\tPre-Civil War 10th edition\tA\t");
    	output.println("SSC100\tFirst Year Seminar\tN.A.\tSpring 2018\tN.A.\tA\t");
    	output.println("CSC114\tComputer Science I\tJin An\tSummer 2018\tIntro to C++\tA\t");
    	output.println("MAT180\tCollege Mathematics\tMr.Armstrong\tSummer2018\tCollege Mathematics\tA\t");
    	output.close();
    }
}
