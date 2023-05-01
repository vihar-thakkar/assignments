package Assignments;

import java.util.HashSet;

public class HashToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<String>();
		 set.add("Green");
	      set.add("Red");
	      set.add("Oreange");
	      set.add("yellow");
	      System.out.println("the hash set : " +set);
	       
	      
	      String[] array = new String[set.size()];
	      set.toArray(array);
	      System.out.println("Array elements : ");
	      for(String s : array) {
	    	  System.out.println(s);
	      }

	}

}
