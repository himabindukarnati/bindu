package Treemap;
import java.util.*;
public class Java13 {

	public static void main(String[] args) {
		 TreeMap < Integer, String > t2= new TreeMap < Integer, String > ();

		  t2.put(10,"lalli");
		  t2.put(20,"jyo");
		  t2.put(40,"anil");
		  t2.put(50,"anay");
		  t2.put(60,"asha");

		  System.out.println( t2);
		  System.out.println(10);
		  System.out.println(t2.headMap(10));
		  System.out.println(30);
		  System.out.println(t2.headMap(30));
		  System.out.println(70);
		  System.out.println(t2.headMap(70));

	}

}
