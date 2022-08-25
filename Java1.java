package Treemap;
 import java.util.*;
import java.util.Map.Entry;
 
public class Java1 {

	public static void main(String[] args) {
		TreeMap<Integer,String>h1=new TreeMap<Integer,String>();
		
		h1.put(10,"green");
		h1.put(10,"black");
		h1.put(11,"white");
		h1.put(19,"pink");
		
		for (Entry<Integer, String> e:h1.entrySet()) {
			System.out.println(e);
		}

	}

}
