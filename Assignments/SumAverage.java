package Assignments;

import java.util.Scanner;

public class SumAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the first number ");
		int num1  =  sc.nextInt();
		System.out.println("enter the second number ");
		int num2  =  sc.nextInt();
		System.out.println("enter the third number ");
		int num3  =  sc.nextInt();
		System.out.println("enter the fourth number ");
		int num4  =  sc.nextInt();
		System.out.println("enter the fifth number ");
		int num5  =  sc.nextInt();
		
		System.out.println("Sum of all the  numbers is : " + (num1+num2+num3+num4+num5));
		System.out.println("average of all the  numbers is : "+(num1+num2+num3+num4+num5)/5);

	}

}
