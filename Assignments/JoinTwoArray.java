package Assignments;

import java.util.ArrayList;
import java.util.Collections;

public class JoinTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<String> color = new  ArrayList<String>();
	      color.add("Green");
	      color.add("Red");
	      color.add("Oreange");
	      color.add("yellow");
	       System.out.println("colour list 1 : "+color);
	       
	       ArrayList<String> color1 = new  ArrayList<String>();
		      color1.add("Black");
		      color1.add("White");
		      color1.add("Blue");
		      color1.add("Purple");
		       System.out.println("colour list 2 : "+color1);
		       
		       ArrayList<String> a = new  ArrayList<String>();
		       a.addAll(color);
		       a.addAll(color1);
		       
		       System.out.println(a);
		       
		      

	}

}
