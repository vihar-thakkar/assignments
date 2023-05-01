package Assignments;

class PrintTestNumber{
	 public void intnum(int i) {
		 int num = 0;
		 System.out.println("Integer is : "+num);
		 
	 }
	 public void doublenum (double e) {
		 double d = 0;
		 System.out.println("Double : "+d);
	 }
	 public void longnum (long a) {
		 long l = 0;
		 System.out.println("Long : "+l);
	 }
	 public void floatnum (float b) {
		float f = 0;
		 System.out.println("Float : "+f);
	 }
	 public void ch (char v) {
		 char c = 0;
		 System.out.println("Character : "+c);
	 }
}

public class PrintNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintTestNumber p1= new PrintTestNumber();
		p1.intnum(20);
		p1.doublenum(2431.1343);
		p1.floatnum(1.5f);
		p1.longnum(15115132156445615l);
		p1.ch('F');
		

	}

}





