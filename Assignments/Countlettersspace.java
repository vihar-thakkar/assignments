package Assignments;

import java.util.Scanner;

public class Countlettersspace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("input string to count letter ");
		String s = sc.next();
		int letter = 0;
		int space = 0;
		int num = 0;
		
		
		for (int i=1;i<=s.length();i++) {
			if (i>='a' || i<='z' ) {
				letter++;
				
				
			}else if (i==' ') {
				space++;
				
			}else if (i>=0 || i<=100000) {
				num++;
			
			}
		}System.out.println("number of letters :"+letter);
		System.out.println("number of spaces :"+space);
		System.out.println("numbers of integers :"+num);

	}

}
