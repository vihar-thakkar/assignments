package Assignments;
abstract class Marks{
	public abstract double getpercentage();
}
	class studentA extends Marks{
		private double subject1Marks,subject2Marks,subject3Marks;
		public studentA(double subject1Marks,double subject2Marks,double subject3Marks) {
			this.subject1Marks=subject1Marks;
			this.subject2Marks=subject2Marks;
			this.subject3Marks=subject3Marks;
			
		}
		@Override
		public double getpercentage() {
			// TODO Auto-generated method stub
			double totalmarks = subject1Marks +subject2Marks+ subject3Marks;
			return (totalmarks/3);
		}
		
	}
	class studentB extends Marks{
		private double subject1Marks,subject2Marks,subject3Marks,subject4Marks;
		public studentB(double subject1Marks,double subject2Marks,double subject3Marks,double subject4Marks) {
			this.subject1Marks=subject1Marks;
			this.subject2Marks=subject2Marks;
			this.subject3Marks=subject3Marks;
			this.subject4Marks=subject4Marks;
		}

		@Override
		public double getpercentage() {
			// TODO Auto-generated method stub
			double totalMarks = subject1Marks+subject2Marks+subject3Marks+subject4Marks;
			return (totalMarks/4);
		}
		
	}
public class percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		studentA m= new studentA(80, 45, 78);
		studentB m1 = new studentB(45, 78, 89, 88);
		
		System.out.println("Percentage of student A : "+ m.getpercentage()+" %");
		System.out.println("Percentage of student B : "+ m1.getpercentage()+" %");
		
		

	}

}
