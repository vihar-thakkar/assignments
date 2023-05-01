package Assignments;


import java.util.Collections;
import java.util.HashSet;

public class CompareTwoSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashSet<String> set = new HashSet<String>();
	      set.add("Green");
	      set.add("Red");
	      set.add("Oreange");
	      set.add("yellow");
	       System.out.println("colour list 1 : "+set);
	       
	       HashSet<String> set1 = new HashSet<String>();
		      set1.add("Black");
		      set1.add("Red");
		      set1.add("Blue");
		      set1.add("Green");
		       System.out.println("colour list 2 : "+set1);
		       set.retainAll(set1);
		       System.out.println(set);
		       
		      

	}

}
