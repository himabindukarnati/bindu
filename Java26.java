package Treemap;
import java.util.*;
public class Java26 {

	public static void main(String[] args) {
		TreeMap < Integer, String > t3 = new TreeMap < Integer, String > ();
		  
		  t3.put(10, "hibiscus");
		  t3.put(20,"jasmine");
		  t3.put(40,"lotus");
		  t3.put(50,"rose");
		  t3.put(60,"lilly");
		  System.out.println("Orginal TreeMap content: " + t3);
		  System.out.println("Keys greater than or equal to 20: " + t3.ceilingKey(20));
		  System.out.println("Keys greater than or equal to 30: " + t3.ceilingKey(30));
		  System.out.println("Keys greater than or equal to 50: " + t3.ceilingKey(50));
		

	}

}
