package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array1 = {"pwq","cdd","kjl"};
		
		ArrayList<String> list1= new ArrayList<String>();
		list1.add("Avu");
		list1.add("priyanka");
		list1.add("pooja");
		list1.add("nupur");
		list1.add("priyanka");
		list1.add("mona");
		list1.add("rohan");
		list1.add("reena");
		System.out.println("list is "+list1);
		System.out.println("size is " + list1.size());
		list1.remove(1);
		System.out.println("list is "+list1);
		System.out.println("size is " + list1.size());
		System.out.println("data at 4th position is "+ list1.get(3));
		
		list1.set(1, "pooh");
		System.out.println("changed list is "+list1);
		
		list1.add(1, "happy");
		System.out.println(list1); 
		
		Collections.sort(list1);
		System.out.println(list1);
		
		for(int i=0;i<list1.size();i++) {
			System.out.println(list1.get(i));
		}
		for (String name:list1)
			System.out.println(name);
		
	
	for(int index=0;index<list1.size();index++) {
		if(list1.get(index).equals("priyanka")){
            System.out.println(index);
            break;

		
		}
	}
	}
}

