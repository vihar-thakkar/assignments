package Assignments;

import java.util.ArrayList;

public class IncreaseArray {
	public static void main(String[] args) {
		ArrayList<String> color= new ArrayList<String>();
		  color.add("Green");
	      color.add("Red");
	      color.add("Oreange");
	      color.add("yellow");
	      System.out.println(color);
	      color.ensureCapacity(5);
	      color.add("White");
	      color.add("Black");
	      System.out.println(color);
	      
		
	}

}
