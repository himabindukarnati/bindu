package Treemap;
import java.util.*;
public class Java7 {

	public static void main(String[] args) {
		  TreeMap<String,String> h9 = new TreeMap<String,String>();
		   
		  h9.put("c1","apple");
		  h9.put("c2", "banana");
		  h9.put("c3", "orange");
		  h9.put("c4", "sapota"); 
		  System.out.println(h9); 
		    }

	 class sort_key implements Comparator <String>{
		 
		 public int compare(String e,String str) {

		return e.compareTo(str);

	}
	 }

}
