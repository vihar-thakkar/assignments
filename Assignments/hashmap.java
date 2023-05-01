package Assignments;

import java.util.HashMap;import java.util.Map;

public class hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> set = new HashMap<Integer,String>();
		 set.put(1,"Green");
	      set.put(2,"Red");
	      set.put(3,"Oreange");
	      set.put(4,"yellow");
	      
	      
	      for (Map.Entry x:set.entrySet()) {
	      System.out.println(x.getKey()+ " "  +x.getValue());
	      }


	}

}
