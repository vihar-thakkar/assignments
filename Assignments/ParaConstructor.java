package Assignments;
    class data {
    	public void run(int i , char c) {
    		System.out.println("The integer value is : "+i+" and the character is : "+c);
    	}
    	public void run(char c , int i) {
    		System.out.println("The Character value is : "+c+" and the Integer is : "+i);
    	}
    	
    		
	 
}

public class ParaConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		data d = new data();
		d.run(3, 'e');
		d.run('c', 2);

	}

}
