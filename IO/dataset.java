package ILostTrackOfTheWeeks;
import java.util.*;
import java.io.*;
public class dataset {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("Salary.txt");
		
		if (file.exists()) {
			System.out.println("File " + file.getName() + " already exists");
			System.exit(0);
		}
		String rank = "";
		double salary;
		try (PrintWriter output = new PrintWriter(file);) {
			for (int i = 1; i <= 1000; i++) {
				output.print("FirstName" + i + " LastName" + i);
				rank = getRank();
				salary = getSalary(rank);
				output.printf(" " + rank + " %.2f\n", salary);
				output.println();
			}
		}
	}

	public static String getRank() {
		String[] ranks = {"assistant", "associate", "full"};
		return ranks[(int)(Math.random() * ranks.length)];
	}

	public static double getSalary(String rank) {
		if (rank.equals("assistant"))
			return  50000 + (Math.random() * 30001); // min + (max+1 - min) aka. range
		else if (rank.equals("associate"))
			return 60000 + (Math.random() * 50001);
		else
			return 75000 + (Math.random() * 55001); 
	}
}
