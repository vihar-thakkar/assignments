package Assignments;

import java.util.Scanner;

public class Vote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 21;
		
		
		try {
			validate(age);
			
			
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Exception in thread main"+e.getMessage());
		}

	}

	private static void validate(int age) {
		// TODO Auto-generated method stub
		
	}

}
