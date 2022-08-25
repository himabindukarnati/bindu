package Treemap;
import java.util.*;
public class Java19 {

	public static void main(String[] args) {
		  TreeMap < Integer, String > t9 = new TreeMap < Integer, String > ();

		  t9.put(10,"audi");
		  t9.put(20,"punch");
		  t9.put(40,"nexon");
		  t9.put(50,"vista");
		  t9.put(60,"brezza");

		  // polling first entry
		  System.out.println("Value before poll: " + t9);
		  System.out.println("Value returned: " + t9.pollFirstEntry());
		  System.out.println("Value after poll: " +t9);


	}

}
