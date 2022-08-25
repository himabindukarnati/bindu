package Treemap;
import java.util.*;
public class Java4 {

	public static void main(String[] args) {
		TreeMap<Integer,String>h2=new TreeMap<Integer,String>();
		h2.put(1,"hima");
		h2.put(2,"kiran");
		h2.put(3,"jyo");
		h2.put(4,"asha");
		
		if(h2.containsValue("hima")){
            System.out.println("The TreeMap contains value hima");
        } else {
            System.out.println("The TreeMap does not contain value hima");
        }
        if(h2.containsValue("navya")){
            System.out.println("The TreeMap contains value navya");
        } else {
            System.out.println("The TreeMap does not contain value navya");
        }
		

	}

}
