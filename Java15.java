package Treemap;
import java.util.*;
public class Java15 {

	public static void main(String[] args) {
		  TreeMap< Integer, String > t6 = new TreeMap< Integer, String >();      
		   
		  t6.put(10,"venky");
		  t6.put(20,"anil");
		  t6.put(40,"kiran");
		  t6.put(50,"madhav"); 
		  t6.put(60,"kumar"); 
		    
		      System.out.println(t6);
			  System.out.println(10);
		      System.out.println(t6.higherEntry(10));  
			  System.out.println(20);
		      System.out.println(t6.higherEntry(20));  
			  System.out.println(70);
		      System.out.println(t6.higherEntry(70));

	}

}
