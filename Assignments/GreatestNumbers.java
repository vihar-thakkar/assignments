package Assignments;

import java.util.Scanner;

public class GreatestNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number");
		int a = sc.nextInt();
		System.out.println("enter the second number");
		int b = sc.nextInt();
		System.out.println("enter the third number");
		int c = sc.nextInt();
		
		if (a>b && a >c) {
			System.out.println("the gratest number is : " +a);
		}else if (b>a && b>c ) {
			System.out.println("the gratest number is : "+b);
		}
		else if (c>a && c >b ) {
			System.out.println("the gratest number is : "+c);
		}else {
			System.out.println("all the numbers are same");
		}
		// TODO Auto-generated method stub

	}

}
