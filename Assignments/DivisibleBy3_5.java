package Assignments;

public class DivisibleBy3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("the numbers which can be divided by 3 are : ");
		
		for(int i=0;i<=100;i++) {
			if(i % 3 ==0  ) {
				System.out.print(" "+i);
			}
		}System.out.println();
		System.out.println("the numbers which can be divided by 5 are : " );
		
		for(int i=0;i<=100;i++) {
			if(i % 5 ==0  ) {
				System.out.print(" "+i);

	}
	
		

}       System.out.println();
		System.out.println("the numbers which can be divided by 3 and 5 are : " );
		for(int i=0;i<=100;i++) {
			if(i % 3 ==0 && i % 5==0  ) {
				System.out.print(" "+i);
}
	}
}
}