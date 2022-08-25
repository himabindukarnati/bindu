package Collections;
import java.util.HashMap;
import java.util.Map;
public class HashMap1 {

	public static void main(String[] args) {
		HashMap<Integer,String>h1=new HashMap<Integer,String>();
		h1.put(1,"hima");
		h1.put(2,"subha");
		h1.put(3,"swetha");
		h1.put(4,"jyo");
		for(Map.Entry m:h1.entrySet()) {
			System.out.println(m);
		}

	}


	}
