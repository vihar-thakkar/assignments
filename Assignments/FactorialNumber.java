package Assignments;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("enter a number to find its factorial");
		int a = sc.nextInt();
		sc.close();
		System.out.println(factorial(a));
	}
	public static int factorial(int a) {
		if (a ==0) {
		return 0;
		}else {
			int fact=1;
			for (int i =1; i<=a;i++) {
				fact *=i;
			}return fact;
		}
		
	}
		
		
		

	

}
