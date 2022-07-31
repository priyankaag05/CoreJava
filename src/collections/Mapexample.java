package collections;

import java.util.HashMap;

public class Mapexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map1= new HashMap<Integer,String>();
		
		map1.put(1, "abc");
		map1.put(2, "djd");
		map1.put(3, "menu");
		map1.put(4, "ndjd");
		map1.put(5, "uss");
		map1.put(6, "hsu");
		map1.put(7, "siso");
       System.out.println(map1);
       System.out.println(map1.get(5));
       map1.remove(6);
       System.out.println(map1);
       
       

		for (Integer key: map1.keySet() ) {
			
			System.out.println("Key is : " +  key);
			System.out.println("Value is : " + map1.get(key));
			

	}

}
}
