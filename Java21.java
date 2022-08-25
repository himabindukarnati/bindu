package Treemap;
import java.util.*;
public class Java21 {

	public static void main(String[] args) {
		 TreeMap < Integer, String > t1 = new TreeMap < Integer, String > ();
		  SortedMap < Integer, String > s1 = new TreeMap < Integer, String > ();

		  // Put elements to the map 
		  t1.put(10, "Red");
		  t1.put(20, "Green");
		  t1.put(30, "Black");
		  t1.put(40, "White");
		  t1.put(50, "Pink");
		  System.out.println("Orginal TreeMap content: " +t1);
		  s1 = t1.subMap(20, 40);
		  System.out.println("Sub map key-values: " + s1);

	}

}
