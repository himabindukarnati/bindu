package Treemap;
import java.util.*;
public class Java23 {

	public static void main(String[] args) {
		TreeMap < Integer, String > t2 = new TreeMap < Integer, String > ();
 
		  t2.put(10,"Red");
		  t2.put(20,"Green");
		  t2.put(30,"Black");
		  t2.put(40,"White");
		  t2.put(50,"Pink");
		  System.out.println("Orginal TreeMap content: " + t2);
		  System.out.println("Keys are greater than or equal to 20: " + t2.tailMap(20));

	}

}
