package Treemap;
import java.util.*;
public class Java18 {

	public static void main(String[] args) {
		TreeMap < Integer, String > t8 = new TreeMap < Integer, String > ();

		  // Put elements to the map 
		  t8.put(10,"Rose");
		  t8.put(20,"hibiscus");
		  t8.put(40,"lilly");
		  t8.put(50,"jasmine");
		  t8.put(60,"lotus");

		  System.out.println(t8);
		  System.out.println(t8.navigableKeySet());

	}

}
