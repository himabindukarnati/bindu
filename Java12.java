package Treemap;
import java.util.*;
public class Java12 {

	public static void main(String[] args) {
		TreeMap < Integer, String > t2 = new TreeMap < Integer, String > ();
		   
		  t2.put(10,"Red");
		  t2.put(20,"Green");
		  t2.put(40,"Black");
		  t2.put(50,"White");
		  t2.put(60,"Pink");

		  System.out.println(t2);
		  System.out.println(10);
		  System.out.println(t2.floorKey(10));
		  System.out.println(30);
		  System.out.println(t2.floorKey(30));
		  System.out.println(70);
		  System.out.println(t2.floorKey(70));
		 }

		

	}


