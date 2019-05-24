// David W. Clendenning Jr. - CSC 164 - 450 - 10/13/2018 - Lab #2
package WK5;

public class Wrapper {
    public static void main(String[] args) {
    	int a = 5;
    	String ab = "55";
    	Integer x = new Integer(a);
    	Integer y = new Integer(ab);
    	System.out.println("Int Val: " + x.intValue());
    	System.out.println("Int Byte Val: " + x.byteValue());
    	System.out.println("Int Short Val: " + x.shortValue());
    	System.out.println("Int Long Val: " + x.longValue());
    	System.out.println("Int Float Val: " + x.floatValue());
    	System.out.println("Int Double Val: " +x.doubleValue());
    	System.out.println("Int Compare: " +x.compareTo(3));
    	System.out.println("Int to string: " +x.toString());
    	System.out.println("Int Max: " +x.MAX_VALUE);
    	System.out.println("Int Min: " +x.MIN_VALUE);
    	System.out.println("Int Val of: " +x.valueOf(ab));
    	System.out.println("Int Val of (String): " +x.valueOf(ab, 10));
    	System.out.println("Int Parse (base 10): " +x.parseInt(ab));
    	System.out.println("Int Parse (String: base 10): " +x.parseInt(ab, 10));
    	
    	
    }
}
