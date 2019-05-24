package ch17;

import java.io.*;
import java.util.ArrayList;

public class DataStreamMod {
  public static void main(String[] args) throws IOException {
	  DataOutputStream output = null;
      DataInputStream input = null;
      String rank = "";
      double salary;
    try  // Create an output stream for file temp.dat
    {
    	
    	RandomAccessFile file = new RandomAccessFile("Salary.dat", "rw");
    	file.setLength(0);
    	
    	/*if (file.exists()) {
			System.out.println("File " + file.getName() + " already exists");
			System.exit(0);
		}*/
    	
        output=new DataOutputStream(new FileOutputStream("Salary.dat"));
      
      // Write student test scores to the file
    
	    for (int i = 1; i <= 1000; i++) {
	    	rank = getRank();
			salary = getSalary(rank);
	    	output.writeUTF("FirstName" + i + " LastName" + i + " " + rank + " " + salary);
	    }
	    System.out.println(file.length());
    }
    
    finally
    {
    	output.close();
    }    
    
    try // Create an input stream for file temp.dat
    {
      input=new DataInputStream(new FileInputStream("Salary.dat"));
      // Read student test scores from the file
      ArrayList<Employee> employeeList = new ArrayList<>();
      while((input.available()) > 0) {
    	  String[] line = input.readUTF().split("\\ ");
    	  Employee temp = new Employee();
    	  temp.setfName(line[0]);
    	  temp.setlName(line[1]);
    	  temp.setTitle(line[2]);
    	  temp.setSalary(Double.valueOf(line[3]));
    	  employeeList.add(temp);
	      //System.out.println(lineImLookingAtRightNow );
    	  //System.out.println(line[3] + " " + line[2] + " " + line[1] + " " + line[0]);
      }
      for(int i = 0; i < 1000; i++) {
      System.out.printf("%.2f", employeeList.get(i).getSalary());
      System.out.print(" " + employeeList.get(i).getTitle());
      System.out.print(" " + employeeList.get(i).getlName());
      System.out.println(" " + employeeList.get(i).getfName());
      }
    }
    catch(EOFException e) {System.out.println("\n\nEND OF FILE");}
    
    finally
    {
    	input.close();
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