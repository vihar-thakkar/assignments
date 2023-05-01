package Assignments;

import java.util.HashSet;

public class HashIterate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<String>();
		 set.add("Green");
	      set.add("Red");
	      set.add("Oreange");
	      set.add("yellow");
	      System.out.println("the hash set : " +set);
	      for(String element : set ) {
	    	  System.out.println(element);

	}

}
}