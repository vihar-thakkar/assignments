package Assignments;
 class Member{
	 String name;
	 int age;
	 Long phonenumber;
	 String Address;
	 int salary;
	 
	    
	 public Member(String name, int age,Long phonenumber,String Address,int salary) {
		 this.name=name;
		 this.age=age;
		 this.phonenumber=phonenumber;
		 this.Address=Address;
		 this.salary=salary;
	 }
}

public class Salary {
	
	public static void main(String[] args) {
		Member member = new Member("XYZ",50,8905387055l,"Address",25000);
		System.out.println("The salary of " + member.name + " is "+ member.salary);
	}

	
}
		

	


