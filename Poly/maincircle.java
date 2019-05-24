//David W. Clendenning Jr. - CSC164 - 11/5/2017 13.6
package HelloIamBored2;

public class maincircle {
	public static void main(String[] args) {
		ComparableCircle comparableCircle1 = new ComparableCircle(7.3);
		ComparableCircle comparableCircle2 = new ComparableCircle(73.1);
		System.out.println("\nComparableCircle1:");
		System.out.println(comparableCircle1);
		System.out.println("\nComparableCircle2:");
		System.out.println(comparableCircle2);
		System.out.println((comparableCircle1.compareTo(comparableCircle2) == 1 
			? "\nComparableCircle1 " : "\nComparableCircle2 ") + "is the larger of the two Circles");
	}
}
