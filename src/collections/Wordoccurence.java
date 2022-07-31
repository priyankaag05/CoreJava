package collections;

import java.util.HashMap;

public class Wordoccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str="Clean world green love world";
      String[] words=str.split(" ");
      
      HashMap<String,Integer> map1= new HashMap<String,Integer>();
    
      for(String word:words) {
    	  
    	  if(map1.get(word)==null) {
    		   
    		  map1.put(word,1);
    		  
    	  }else {
    		  int oldocc=map1.get(word);
    		  
    		  map1.put(word, oldocc+1);
    	  }
      }
      System.out.println(map1);
	}

}
