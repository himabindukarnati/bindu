package Collections;
import java.util.*;
public class Mappings {

	public static void main(String[] args) {
		HashMap<Integer,String>s1=new HashMap<Integer,String>();
		HashMap<Integer,String>s2=new HashMap<Integer,String>();
		s1.put(1,"hima");
		s1.put(2,"rose");
		s1.put(3,"lilly");
		s2.put(4,"lalli");
		s2.put(5,"eswari");
		s2.put(6,"kiran");
		
		s1.putAll(s2);
		System.out.println(s1);

	}

}
