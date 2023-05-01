package Assignments;

public class ComparingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "topsint.com";
		String s2 = "topsint.com";
		String s3 = "Topsint.com";
		
		System.out.println("Comparing "+s1+ " with "+s2+" : "+s1.contentEquals(s2));
		System.out.println("Comparing "+s2+ " with "+s3+" : "+s1.contentEquals(s3));
		

	}

}
