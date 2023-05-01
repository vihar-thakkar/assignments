package Assignments;

import java.util.Scanner;

abstract class Shape{
	abstract double rectangleArea(double length,double breadth);
	abstract double squareArea(double side);
	abstract double circleArea(double radius);
	
	
}
class NewArea extends Shape{

	@Override
	double rectangleArea(double length, double breadth) {
		// TODO Auto-generated method stub
		return length*breadth;
	}

	@Override
	double squareArea(double side) {
		// TODO Auto-generated method stub
		return side*side;
	}

	@Override
	double circleArea(double radius) {
		// TODO Auto-generated method stub
		return Math.PI * radius*radius ;
	}
}

public class ShapeArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		NewArea a = new NewArea();
		
		System.out.println("enter the value of length for rectangle");
		double length = sc.nextDouble();
		System.out.println("enter the value of breadth for rectangle");
		double breadth = sc.nextDouble();
		System.out.println(" Area  rectangle is :"+ a.rectangleArea(length, breadth));
		
		System.out.println("enter the value of side for square");
		double s = sc.nextDouble();
		System.out.println("the area of square is : "+a.squareArea(s));
		
		System.out.println("enter the value of radius for circle");
		double c = sc.nextDouble();
		System.out.println("the area of circle is : "+a.circleArea(s));
		
		sc.close();
		
		
		
		

	}

}
