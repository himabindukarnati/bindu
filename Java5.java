package Treemap;
import java.util.*;
public class Java5 {

	public static void main(String[] args) {
		TreeMap<Integer,String> h3=new TreeMap<Integer,String>();      
		   // Put elements to the map 
		  h3.put(1,"apple");
		  h3.put(2,"banana");
		  h3.put(3,"mango");
		  h3.put(4,"sapota"); 
		    
		 Set<Integer> keys = h3.keySet();
		        for(Integer key: keys){
		            System.out.println(key);

	}

	}
}
