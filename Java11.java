package Treemap;
import java.util.*;
public class Java11 {

	public static void main(String[] args) {
		 TreeMap < Integer, String > t1 = new TreeMap < Integer, String > ();
		  // Put elements to the map 
		  t1.put(10,"watermelon");
		  t1.put(30,"sapota");
		  t1.put(50,"custord apple");
		  t1.put(70,"banana");
		  t1.put(90,"apple");

		  System.out.println( t1);
		  System.out.println( 10);
		  System.out.println( t1.floorEntry(10));
		  System.out.println( t1.floorEntry(40) );
		  System.out.println(t1.floorEntry(100));

	}

}
