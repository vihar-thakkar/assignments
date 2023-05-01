package Assignments;

import java.util.ArrayList;
import java.util.Collections;

public class SwapArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<String> color = new  ArrayList<String>();
	      color.add("Green");
	      color.add("Red");
	      color.add("Oreange");
	      color.add("yellow");
	       System.out.println("colour list before swap : "+color);
	       for (String s : color) {
	    	   System.out.println(s);
	       }
	       
	     
		       
		       Collections.swap(color, 0, 2);
		       System.out.println("Array list after swap : " );
		       for(String a : color) {
		    	   System.out.println(a);
		    	   
		       }
		      

	}

}
