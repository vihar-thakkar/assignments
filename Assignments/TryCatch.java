package Assignments;

import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		try {
			System.out.println("enter two numbers : ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int divison = a/b;
			System.out.println("result of these two numbers is : "+divison);
			
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Exception in thread main"+e);
			
		}

	}

}
