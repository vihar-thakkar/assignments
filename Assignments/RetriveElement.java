package Assignments;

import java.util.ArrayList;

public class RetriveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<String> color = new  ArrayList<String>();
	      color.add("Green");
	      color.add("Red");
	      color.add("Oreange");
	      color.add("yellow");
	       System.out.println(color);
	       String Element = color.get(0);
	       System.out.println("Element at first position is : " +Element);

	}

}
