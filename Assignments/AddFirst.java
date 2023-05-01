package Assignments;

import java.util.ArrayList;

public class AddFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		 ArrayList<String> color = new  ArrayList<String>();
	      color.add("Green");
	      color.add("Red");
	      color.add("Oreange");
	      color.add("yellow");
	       System.out.println("first Array : "+color);
	       color.add(0, "pink");
	       System.out.println("colour added at first position : "+color);
	}

}
