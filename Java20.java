package Treemap;
import java.util.*;
public class Java20 {

	public static void main(String[] args) {
		 TreeMap < Integer, String > t3 = new TreeMap < Integer, String > ();

		  t3.put(10, "Red");
		  t3.put(20,"Green");
		  t3.put(40,"Black");
		  t3.put(50,"White");
		  t3.put(60,"Pink");

		  // polling first entry
		  System.out.println("Value before poll: " + t3);
		  System.out.println("Value returned: " + t3.pollLastEntry());
		  System.out.println("Value after poll: " + t3);

	}

}
