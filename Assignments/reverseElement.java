package Assignments;

import java.util.ArrayList;
import java.util.Collections;


public class reverseElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> color = new  ArrayList<String>();
	      color.add("Green");
	      color.add("Red");
	      color.add("Oreange");
	      color.add("yellow");
	       System.out.println("elements in original order : "+color);
	       Collections.reverse(color);
	       System.out.println("elements after reverse : "+color);
	}

}
