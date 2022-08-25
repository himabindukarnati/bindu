package Treemap;
import java.util.*;
public class Java14 {

	public static void main(String[] args) {
		TreeMap < Integer, String > t5 = new TreeMap < Integer, String > ();

		  t5.put(10, "Red");
		  t5.put(20, "Green");
		  t5.put(40, "Black");
		  t5.put(50, "White");
		  t5.put(60,"Pink");

		  System.out.println(t5);
		  System.out.println(10);
		  System.out.println(t5.headMap(10,true));
		  System.out.println( 20);
		  System.out.println(t5.headMap(20,true));
		  System.out.println(70);
		  System.out.println(t5.headMap(70, true));

	}

}
