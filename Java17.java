package Treemap;
import java.util.*;
public class Java17 {

	public static void main(String[] args) {
		 TreeMap < Integer, String > t7 = new TreeMap < Integer, String > ();

		  t7.put(10,"Red");
		  t7.put(20,"Green");
		  t7.put(40,"Black");
		  t7.put(50,"White");
		  t7.put(60,"Pink");

		  System.out.println(t7);
		  System.out.println(10);
		  System.out.println(t7.lowerKey(10));
		  System.out.println(20);
		  System.out.println(t7.lowerKey(20));
		  System.out.println(70);
		  System.out.println(t7.lowerKey(70));

	}

}
