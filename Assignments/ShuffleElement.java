package Assignments;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> color = new  ArrayList<String>();
	      color.add("Green");
	      color.add("Red");
	      color.add("Oreange");
	      color.add("yellow");
	       System.out.println("elements before shuffle : "+color);
	       Collections.shuffle(color);
	       System.out.println("elements after shuffle : "+color);
		

	}

}
