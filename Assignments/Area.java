package Assignments;
 class printarea {
	 public void area(int side) {
		 int s = side*side;
		 System.out.println("the area of square is : " +side);
		 
	 }
	 public void area(int length,int breadth) {
		 int lb = length*breadth;
		 System.out.println("the area of rectangle is : " +lb);
	 }
	 
 }

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printarea d = new printarea();
		d.area(4);
		d.area(4, 2);

	}

}
