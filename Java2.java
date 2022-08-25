package Treemap;

import java.util.*;

public class Java2 {

	public static void main(String[] args) {
		TreeMap<Integer,String>h4=new TreeMap<Integer,String>();
		TreeMap<Integer,String>h5=new TreeMap<Integer,String>();
		
		h4.put(1,"apple");
		h4.put(2,"banana");
		h4.put(7,"mango");
		h4.put(8,"orange");
		h5.put(4,"berry");
		h5.put(3,"sapota");
		h5.put(9,"watermelon");
		
		h4.putAll(h5);
		System.out.println(h4);
		
		

	}

}
