package Assignments;

public class ConcatenateStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Ms Dhoni is a finisher and ";
		String s2 = "virat kohli is a opener";
		System.out.println("String 1 : "+s1);
		System.out.println("String 2 : "+s2);
		String s3 = s1.concat(s2);
		
		System.out.println("The concatenated String is : "+s3);
		System.out.println("The concatenated String is : "+(s1)+(s2));

	}

}
