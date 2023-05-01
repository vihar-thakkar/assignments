package Assignments;

import java.util.ArrayList;
import java.util.Collections;

public class CompareTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<String> color = new  ArrayList<String>();
	      color.add("Green");
	      color.add("Red");
	      color.add("Oreange");
	      color.add("yellow");
	       System.out.println("colour list 1 : "+color);
	       
	       ArrayList<String> color1 = new  ArrayList<String>();
		      color1.add("Green");
		      color1.add("Red");
		      color1.add("Blue");
		      color1.add("yellow");
		       System.out.println("colour list 2 : "+color1);
		       
		       ArrayList<String> color2 = new  ArrayList<String>();
		       for (String s: color1)
		    	   color2.add(color1.contains(s) ? "Yes" : " No");
		       System.out.println(color2);
		       
		     

	}

}
