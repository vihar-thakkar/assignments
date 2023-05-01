package Assignments;

import java.util.Scanner;

public class VowelConstant {

	

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the Character");
		char c = sc.next().charAt(0);
		
		if (c == 'a' ||c == 'e' ||c == 'i'|| c =='o'|| c=='u' || c=='A'|| c=='U'|| c=='E'|| c=='I'|| c=='O' ) {
			System.out.println("the inputed character is vowel ");
			
		}else if (c >= 'a' && c<='z' ||c >= 'A' && c<='Z') {
			System.out.println("the inputed character is Constant ");
		}else {
			System.out.println("the entered value is not appropriate");
		}
		// TODO Auto-generated method stub

	}

}
