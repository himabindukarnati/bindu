package Treemap;
import java.util.*;

public class Java3 {

	public static void main(String[] args) {
		TreeMap<Integer,String>h1=new TreeMap<Integer,String>();
		
		h1.put(1,"pink");
		h1.put(2,"black");
		h1.put(3,"white");
		h1.put(4,"yellow");
		h1.put(5,"green");
		
		System.out.println(h1);
		if (h1.containsKey(2)) {
			
		            System.out.println("The Tree Map contains key 2");
		        } else {
		            System.out.println("The Tree Map does not contain key 2");
		        }
		        if(h1.containsKey(9)){
		            System.out.println("The Tree Map contains key 9");
		        } else {
		            System.out.println("The TreeMap does not contain key 9");
		}
		
		
		
	

	}

}
