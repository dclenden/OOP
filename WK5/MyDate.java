// David W. Clendenning Jr. - CSC 164 - 450 - 10/13/2018 - HW 10.14
package WK5;
import java.util.*;
public class MyDate {
    private int year;
    private int month;
    private int day;
    MyDate(){ //I had to google what the GregorianCalendar was (in the book it told me to use it)
    	GregorianCalendar calendar = new GregorianCalendar();
    	year = calendar.get(GregorianCalendar.YEAR);
    	month = calendar.get(GregorianCalendar.MONTH);
    	day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }
    
    MyDate(long elapsedTime){
    	setDate(elapsedTime);
    }
    
    MyDate(int year, int month, int day){
    	this.year = year;
    	this.month = month;
    	this.day = day;
    }
    public int getYear() {
    	return year;
    }
    public int getMonth() {
    	return month;
    }
    public int getDay() {
    	return day;
    }
    public void setDate(long elapsedTime) {
    	GregorianCalendar calendar = new GregorianCalendar();
    	calendar.setTimeInMillis(elapsedTime);
    	year = calendar.get(GregorianCalendar.YEAR);
    	month = calendar.get(GregorianCalendar.MONTH);
    	day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }
	
	public static void main(String[] args) {
    	MyDate date1 = new MyDate();
    	MyDate date2 = new MyDate(5123215321211L);
    	
    	System.out.println("Date1: " + date1.getMonth() + "/" + date1.getDay() + "/" + date1.getYear());
    	System.out.println("Date2: " + date2.getMonth() + "/" + date2.getDay() + "/" + date2.getYear());
    }
}
