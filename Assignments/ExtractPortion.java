package Assignments;

import java.util.ArrayList;

import java.util.List;

public class ExtractPortion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> color = new  ArrayList<String>();
	      color.add("Green");
	      color.add("Red");
	      color.add("Oreange");
	      color.add("yellow");
	       System.out.println("elements original : "+color);
	       List<String> subList= color.subList(0, 3);
	      
	       System.out.println(subList);

	}

}
