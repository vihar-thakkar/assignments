package Assignments;

import java.util.ArrayList;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<String> color = new  ArrayList<String>();
	      color.add("Green");
	      color.add("Red");
	      color.add("Oreange");
	      color.add("yellow");
	       System.out.println(color);
	       color.remove(3);
	       System.out.println("After removing third element : " +color);

	}

}
